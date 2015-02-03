/**
 * One object of class Employee stores the personal information for one
 * Employee.
 */

public class Employee
{
    private static int numEmployees = 0; // counter for number of employees
    private String name; // Holds the employee name

    /**
     * sets the value of name to "newName"
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * returns the current value of name
     */
    public String getName()
    {
        return name;
    }

    private String ssn;

    /**
     * sets the value of ssn to "newSsn"
     */
    public void setSsn(String newSsn)
    {
        ssn = newSsn;
    }

    /**
     * returns the current value of Ssn
     */
    public String getSsn()
    {
        return ssn;
    }

    private double salary;

    /**
     * sets the value of salary to "newSalary"
     */
    public void setSalary(double newSalary)
    {
        salary = newSalary;
    }

    /**
     * returns the current value of salary
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * default constructor for Employee class object which assigns default
     * values for all class properties and increments a counter to track the
     * number of objects created
     */
    public Employee()
    {
        this.setName("null");
        this.setSsn("000-00-0000");
        this.setSalary(0);
        numEmployees++;
    }

    /**
     * parameterized constructor for Employee class object which takes in name,
     * ssn and salary and constructs one employee object. It
     * also increments a counter to track the number of objects created
     */
    public Employee(String name, String ssn, double salary)
    {
        this.setName(name);
        this.setSsn(ssn);
        this.setSalary(salary);
        numEmployees++;

    }

    /**
     * Returns a String containing all the data stored in this object.
     */
    @Override
    public String toString()
    {
        String result = "Name: " + this.getName() + "\nSSN#: " + this.getSsn()
                + "\nSalary: $" + this.getSalary() + "\n";
        return result;
    }

    /**
     * Returns an integer that counts the number of objects that have been
     * constructed.
     */
    public static int getNumEmployees()
    {
        return numEmployees;
    }
}