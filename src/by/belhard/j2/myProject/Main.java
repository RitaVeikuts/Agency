package by.belhard.j2.myProject;

import by.belhard.j2.myProject.Clients;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver" ;
    private static final String USER = "root";
    private static final String PASSWORD = "rootroot1";
    private static final String URL =
            "jdbc:mysql://localhost:3306/Visas_agency?serverTimezone=UTC";

    public static void main(String[] args) throws IOException, StringIndexOutOfBoundsException {

        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.err.println(DRIVER_NAME + " loading failure");
            return;
        }
        Connection connection;
        List<Clients> clientsList = new ArrayList<>();
        List<Visas> visasLIat = new ArrayList<>();


        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

            String query = "select * from visas e;";
            ResultSet resultSet = statement.executeQuery(query);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        }



        Services services = new Services();

        services.startWork();
    }

