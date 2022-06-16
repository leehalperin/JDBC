package com.sparta.lh.jdbc;

import java.sql.*;

public class App {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO(ConnectionManager.getConnection());
        employeeDAO.insertEmployee("1", "Mr", "Lee", "D", "Halperin", "M", "leehalperin@gmail.com", "09/01/1998", "20/05/2022", "500000");
        employeeDAO.printAllEmployees();
        ConnectionManager.closeConnection();

    }
}
