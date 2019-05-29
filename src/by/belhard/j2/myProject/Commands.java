
package by.belhard.j2.myProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;*/

public class Commands {

    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "rootroot1";
    private static final String URL =
            "jdbc:mysql://localhost:3306/company?serverTimezone=UTC";


    private static Connection connection;
    //List<Visas> visasList = new ArrayList<>();
    //private final Map<String, Visas> visasMap = new HashMap<>();
    private static BufferedReader reader = null;

    public Commands() {

        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.err.println(DRIVER_NAME + " loading failure");
            return;
        }

        reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void toAddVisa() throws SQLException, IOException, NullPointerException {

        PreparedStatement preparedStatement = connection.prepareStatement
                ("insert into visas values (null, ?, ?, ?, ?)");
        System.out.println("Enter country:\\n");
        String country = reader.readLine();
        System.out.println(country);

        System.out.println("Enter visa fee:\\n");
        int visa_fee = Integer.parseInt(reader.readLine());
        System.out.println(visa_fee);

        System.out.println("Enter the currency of visa fee:\\n");
        String visa_fee_currency = reader.readLine();
        System.out.println(visa_fee_currency);

        System.out.println("Enter the cost of visa:\\n");
        int cost = Integer.parseInt(reader.readLine());
        System.out.println(cost);

        preparedStatement.setString(1, country);
        preparedStatement.setInt(2, visa_fee);
        preparedStatement.setString(3, visa_fee_currency);
        preparedStatement.setInt(4, cost);

        preparedStatement.execute();

        System.out.println("New visa added!");

    }

    public static void toDeleteVisa() throws SQLException, IOException, NullPointerException {

        PreparedStatement preparedStatement = connection.prepareStatement
                ("delete from visas where id = ?");
        System.out.println("If you want to delete the visa, please, enter visa's number in the table:\\n");
        int id = Integer.parseInt(reader.readLine());
        System.out.println(id);

        preparedStatement.setString(1, String.valueOf(id));

        preparedStatement.execute();

        System.out.println("Visa deleted!");
    }

    public static void toShowAllVisas() throws SQLException, NullPointerException {
        Statement statement = connection.createStatement();
        String query = "select * from visas;";
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println(resultSet);

    }

    public static void toShowAllClients() throws SQLException, NullPointerException {
        Statement statement = connection.createStatement();
        String query = "select * from clients;";
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println(resultSet);
    }
}
