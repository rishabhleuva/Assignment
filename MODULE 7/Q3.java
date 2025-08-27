import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class SwingCrudApp extends JFrame {

    // --- Configuration: Replace with your database details ---
    private static final String DB_URL = "jdbc:mysql://localhost:3306/company_db";
    private static final String USER = "your_username"; // Replace with your MySQL username
    private static final String PASS = "your_password"; // Replace with your MySQL password

    // --- GUI Components ---
    private JTextField idField, fnameField, lnameField, emailField;
    private JButton insertButton, updateButton, selectButton, deleteButton;
    private JTextArea displayArea;

    public SwingCrudApp() {
        // --- Frame Setup ---
        setTitle("Employee CRUD Application");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // --- Input Panel Setup ---
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("ID (for Update/Select/Delete):"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("First Name:"));
        fnameField = new JTextField();
        inputPanel.add(fnameField);

        inputPanel.add(new JLabel("Last Name:"));
        lnameField = new JTextField();
        inputPanel.add(lnameField);

        inputPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        inputPanel.add(emailField);
        
        // --- Button Panel Setup ---
        JPanel buttonPanel = new JPanel();
        insertButton = new JButton("Insert");
        updateButton = new JButton("Update");
        selectButton = new JButton("Select");
        deleteButton = new JButton("Delete");
        buttonPanel.add(insertButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(selectButton);
        buttonPanel.add(deleteButton);
        
        inputPanel.add(new JLabel()); // Placeholder
        inputPanel.add(buttonPanel);

        // --- Display Area Setup ---
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Database Records"));

        // --- Add components to frame ---
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // --- Add Action Listeners for Buttons ---
        insertButton.addActionListener(e -> insertRecord());
        updateButton.addActionListener(e -> updateRecord());
        selectButton.addActionListener(e -> selectRecord());
        deleteButton.addActionListener(e -> deleteRecord());

        setVisible(true);
        selectRecordsOnLoad(); // Load all records on startup
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    /**
     * INSERT Operation
     */
    private void insertRecord() {
        String sql = "INSERT INTO employees (fname, lname, email) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fnameField.getText());
            pstmt.setString(2, lnameField.getText());
            pstmt.setString(3, emailField.getText());
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Record inserted successfully!");
                clearFields();
                selectRecordsOnLoad(); // Refresh display
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error inserting record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * UPDATE Operation
     */
    private void updateRecord() {
        if (idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an ID to update.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String sql = "UPDATE employees SET fname = ?, lname = ?, email = ? WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fnameField.getText());
            pstmt.setString(2, lnameField.getText());
            pstmt.setString(3, emailField.getText());
            pstmt.setInt(4, Integer.parseInt(idField.getText()));
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Record updated successfully!");
                clearFields();
                selectRecordsOnLoad(); // Refresh display
            } else {
                 JOptionPane.showMessageDialog(this, "No record found with the given ID.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error updating record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * SELECT (Single Record) Operation
     */
    private void selectRecord() {
        if (idField.getText().isEmpty()) {
            selectRecordsOnLoad(); // If ID is empty, show all records
            return;
        }
        String sql = "SELECT * FROM employees WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(idField.getText()));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                fnameField.setText(rs.getString("fname"));
                lnameField.setText(rs.getString("lname"));
                emailField.setText(rs.getString("email"));
            } else {
                JOptionPane.showMessageDialog(this, "No record found with ID: " + idField.getText(), "Not Found", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error selecting record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * DELETE Operation
     */
    private void deleteRecord() {
        if (idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an ID to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String sql = "DELETE FROM employees WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(idField.getText()));
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Record deleted successfully!");
                clearFields();
                selectRecordsOnLoad(); // Refresh display
            } else {
                JOptionPane.showMessageDialog(this, "No record found with the given ID.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting record: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Utility method to load all records into the display area
     */
    private void selectRecordsOnLoad() {
        String sql = "SELECT * FROM employees";
        displayArea.setText(""); // Clear previous content
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            displayArea.append(String.format("%-5s %-15s %-15s %-25s\n", "ID", "First Name", "Last Name", "Email"));
            displayArea.append("----------------------------------------------------------------\n");
            while (rs.next()) {
                displayArea.append(String.format("%-5d %-15s %-15s %-25s\n",
                        rs.getInt("id"),
                        rs.getString("fname"),
                        rs.getString("lname"),
                        rs.getString("email")));
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Error loading records: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Utility method to clear all input fields
     */
    private void clearFields() {
        idField.setText("");
        fnameField.setText("");
        lnameField.setText("");
        emailField.setText("");
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(SwingCrudApp::new);
    }
}
