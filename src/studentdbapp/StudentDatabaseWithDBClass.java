/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdbapp;

import java.sql.SQLException;
import java.util.ArrayList;
import utilities.DatabaseDriver;
import utilities.DatabaseHandler;

/**
 *
 * @author user
 */
public class StudentDatabaseWithDBClass {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/Student";
        String user = "app";
        String passwd = "app";
        /*String driver = "com.mysql.cj.jdbc.Driver";
        //String url="jdbc:mysql://localhost:3306/employee?serverTimezone=UTC";
        String user = "root";
        String passwd = "root";*/
        DatabaseDriver dbDriver = new DatabaseDriver(driver, url, user, passwd);
        DatabaseHandler dbHandler = new DatabaseHandler(dbDriver);
        Student stu1 = new Student(1, "John",3.5 );
        Student stu2 = new Student(2, "Marry", 4.0);
        StudentTable.insertStudent(dbHandler, stu1);
        StudentTable.insertStudent(dbHandler, stu2);
        //Employee emp = EmployeeTable.findEmployeeById(dbHandler, 1);
        //emp.setName("Jack");
        //emp.setSalary(98765);
        //EmployeeTable.updateEmployee(dbHandler, emp);
        //EmployeeTable.removeEmployee(dbHandler, emp);
        //ArrayList<Employee> employeeList = EmployeeTable.findEmployeeByName(dbHandler, "Marry");
        ArrayList<Student> stuList = StudentTable.findAllStudent(dbHandler);
        if (stuList != null) {
            printAllStudent(stuList);
        }
        dbHandler.closeConnection();
    }
    
    public static void printAllStudent(ArrayList<Student> stuList) {
        for(int i = 0; i < stuList.size(); i++) {
            System.out.print(stuList.get(i).getId() + " ");
            System.out.print(stuList.get(i).getName() + " ");
            System.out.println(stuList.get(i).getGPA()+ " ");
        }
        
    }
}
