/*
OOP Lab: Day 4
Q3. WAP to create a class named "person" that should have the
properties "name" and "address" which should be private. There
should be methods available to get and set the values.
The class must have overloading constructors. Also with proper
functionalities the address may be changed. Derive two other
classes "account_holder" and "employee" from the person class.
"account_holder" should have an account_number and balance and 
methods to display them. An employee should have designation,
department, salary and proper methods to display them. Also
the designation and salary may be changed.
 
Akshay Anand
CSE 5th Sem

*/
class person
{    
    private String name, address;
    person(String name, String address)
    {
        this.name=name; this.address=address;
    }
    
    public String getName()
    {
        return this.name;
    }

    public String getAdress()
    {
        return this.address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }   

    public static void main(String[] args)
    {
        employee p1= new employee("Akshay", "Khidirpur", "engg", "IT", 300000);
        p1.display();
    }
}

class account_holder extends person{
    private int account_number, balance;
    account_holder(String name, String address, int account_number, int balance )
    {
        super(name, address);
        this.account_number = account_number;
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return this.account_number;
    }
    public int getBalance()
    {
        return this.balance;
    }
}

class employee extends person{
    private String designation, department;
    private int salary;
    employee(String name, String address, String designation, String department, int salary)
    {
        super(name, address);
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }
    public String getDesignation()
    {
        return this.designation;
    }

    public String getDepartment()
    {
        return this.department;
    }
    public int getSalary()
    {
        return this.salary;
    }

    public void display()
    {
        System.out.println("Name = " + this.getName());
        System.out.println("Designation = " + this.designation);
        System.out.println("Department = " + this.department);
        System.out.println("Salary= " + this.salary);
        System.out.println("Address = " + this.getAdress());
    }
}