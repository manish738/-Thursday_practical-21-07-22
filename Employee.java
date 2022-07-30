/*  2. Write a program that would print the information (name, year of joining, salary, address)
of three employees by creating a class named 'Employee'. The output should be as
follows:
Name Year of joining Address
Robert 1994    64C- WallsStreat
Sam    2000    68D- WallsStreat
John   1999    26B- WallsStreat */

class Employee
{
	String Name;
	int Year;
	int Salary;
	String Address;
	
	Employee(String name,int years,int salary, String addr)
	{
		Name=name;
		Year=years;
		Salary=salary;
		Address=addr;
   	}
	public void Robert()
	{
		System.out.println(Name+" "+Year+" "+Salary+" "+Address);
	}

	public void Sam()
	{
		System.out.println(Name+" "+Year+" "+Salary+" "+Address);
	}

	public void John()
	{
		System.out.println(Name+" "+Year+" "+Salary+" "+Address);
	}

	public static void main(String[] args)
	{
		System.out.println("Name"+    "Year of joining"+    "Salary "+     "Address");
		Employee e=new Employee("Robert",  1994,   20000,   "64C-WallsStreat");
		e.Robert();
	
		Employee e1=new Employee("Sam",    2000,   30000,   "68D-WallsStreat");
		e1.Sam();
		
		Employee e2=new Employee("John",   1999,   30000,   "26B-WallsStreat");
		e2.John();
	}
}