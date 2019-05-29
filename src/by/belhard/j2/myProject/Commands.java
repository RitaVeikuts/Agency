
package by.belhard.j2.myProject;

import javax.swing.text.html.parser.Parser;
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


    private Connection connection;
    List<Visas> visasList = new ArrayList<>();
    private final Map<String, Visas> visasMap = new HashMap<>();
    private BufferedReader reader = null;

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


    public void toAddVisa() throws SQLException, IOException {

        PreparedStatement preparedStatement = connection.prepareStatement("insert into visas values (null, ?, ?, ?, ?)");
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

        preparedStatement.setString(1,country);
preparedStatement.setInt(2, visa_fee);

preparedStatement.execute();


//
        //

        System.out.println();
    }

}
