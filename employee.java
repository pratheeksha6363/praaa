class Employee
{
int empno;
String name;
String designation;
float salary;
void setdata(int eno,String n,String d,float sal)
{
empno=eno;
name=n;
designation=d;
salary=sal; 
}
void getdata()
{
System.out.println("employeeno:"+empno);
System.out.println("name"+name);
System.out.println("designation"+designation);
System.out.println("salary"+salary);
}
}
class employee
{
public static void main (String[]args)
{
employee e=new employee( );
e.setdata(15,"riya","employee",3000);
System.out.println("employee information is:");
e.getdata( );
}
}