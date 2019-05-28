/*package by.belhard.j2.myProject;

import by.belhard.j2.Exceptions.InvalidInputException;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commands {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL =
            "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";

    private final Map<String, Visas> visasMap = new HashMap<>();
    private BufferedReader reader = null;

    public Commands() {
*/
  /*      try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.err.println(DRIVER_NAME + " loading failure");
            return;
        }

        reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        Connection connection;
        List<Visas> visasList = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement = connection.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        public static void toAddVisa (); {
            (sb.append("Enter country:\n")).append(reader).append("Enter visa fee:\n").
                    append(reader).append("Enter the currency of visa fee:\n").
                    append(reader).append("Enter the cost of visa:\n");
            Statement query = new Statement() {

                @Override
                public ResultSet executeQuery(String sql) throws SQLException {
                    Visas visa = new Visas(0, "vdoij", 142, "USD", 15);
                    visasList.add(visa);
                    System.out.println(visasList);
                    return null;
                }};}}}

    /*private char askForInput(StringBuilder sb) throws IOException {

        String s = reader.readLine();

        if (s.length() != 1 && !s.matches("[ ]"))
            throw new InvalidInputException();

        return s.charAt(0);
    }*/


