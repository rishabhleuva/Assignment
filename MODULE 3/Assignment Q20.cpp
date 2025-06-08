#include<iostream>
using namespace std;

class person
{
	protected:
		string name;
		int age;
	public:
		person(string n, int a)
		{
			name = n;
			age = a;
		}	
		void displayperson()
		{
			cout<<"\nName: "<<name;
			cout<<"\nAge: "<<age;
		}
		
};


class teacher : public person
{
	private:
		string subject;
	public:
		teacher(string n,int a,string s):person(n,a)
		{
			subject = s;	
		}	
		
		void displayteacher()
		{
			cout<<"-----Teacher info-----";
			displayperson();
			cout<<"\nSubject: "<<subject<<endl;
		}
		
		
};

class student  : public person
{
	private:
		string course;
	public:
		student(string n,int a,string c):person(n,a)
		{
			course = c;	
		}	
		void displaystudent()
		{
			cout<<"\n-----Student info-----";

			displayperson();
			cout<<"\nCourse: "<<course<<endl;
		}
};

int main()
{
	teacher t1("Sharma",33,"English");
	student s1("Rohit",14,"IT");
	t1.displayteacher();
	s1.displaystudent();
	return 0;
}
