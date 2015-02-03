/**
 * This is a test driver for the employees LinkedList
 */

public class EmployeeTestList
{
    public static void main(String[] args)
    {

        EmployeeList employeeList = new EmployeeList();

        Employee employee1 = new Employee("Ted", "123123", 10000.0);
        employeeList.add(employee1);

        Employee employee2 = new Employee("Sparky", "134343", 20000.0);
        employeeList.add(employee2);

        Employee employee3 = new Employee("Axl", "123123", 10000.0);
        employeeList.add(employee3);

        Employee employee4 = new Employee("Eddie", "134343", 20000.0);
        employeeList.add(employee4);

        Employee employee5 = new Employee("Mick", "134343", 20000.0);
        employeeList.add(employee5);

        System.out.println("The total number of employees: "
                + Employee.getNumEmployees() + "\n\n");

        System.out.println(employeeList.toString());

    }
}

/**********
 The total number of employees: 5


 Name: Ted
SSN#: 123123
Salary: $10000.0

 Name: Sparky
SSN#: 134343
Salary: $20000.0

 Name: Axl
SSN#: 123123
Salary: $10000.0

 Name: Eddie
SSN#: 134343
Salary: $20000.0

 Name: Mick
SSN#: 134343
Salary: $20000.0


*/

