package by.belhard.j2.myProject;

import by.belhard.j2.Exceptions.InvalidInputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Services extends Commands {

    private final BufferedReader reader;

    public Services() {

        reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        sb.append("Select an action:\n")
                .append("1 Add Visa\n")
                .append("2 Delete Visa\n")
                .append("3 Show All Visas\n")
                .append("4 Show clients' base\n")
                .append("0 Close program");
        System.out.println(sb);
    }


    public BufferedReader startWork() throws IOException, StringIndexOutOfBoundsException {

        String visas = "";
        String clients = "";
        int amount;
        char a = 0;



        while (a != '0') {
            try {
                a = askForInput();
            } catch (InvalidInputException e) {
                System.err.println("There is no such command!");
                return null;

            }
            switch (a) {
                case '1':
                    try {
                        Commands.toAddVisa();
                    } catch (SQLException sqle){
                        System.out.println("Try again.");

                    } catch (IOException ioe) {
                        System.out.println("Try again.");
                    } catch (NullPointerException npe) {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case '2':
                    try {
                        Commands.toDeleteVisa();
                    } catch (SQLException sqle){
                        System.out.println("Try again.");

                    } catch (IOException ioe) {
                        System.out.println("Try again.");
                    } catch (NullPointerException npe) {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case '3':
                    System.out.printf("Visa list:\n");
                    try {
                        Commands.toShowAllVisas();
                    } catch (SQLException ioe) {
                        System.out.println("Try again.");
                    } catch (NullPointerException npe) {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case '4':
                    System.out.printf("Clients'base:\n");
                    try {
                        Commands.toShowAllClients();
                    } catch (SQLException ioe) {
                        System.out.println("Try again.");
                    } catch (NullPointerException npe) {
                        System.out.println("Something went wrong.");
                    }
                    break;
                case '0':
                    return startWork();


                default:
                    throw new IllegalStateException("Unexpected value: " + a);

            }
        }

        return null;
    }

    private char askForInput() throws IOException, StringIndexOutOfBoundsException {
        String a = reader.readLine();

        if (a.length() != 1 && !a.matches("[01234]"))
        throw new InvalidInputException();
        else return a.charAt(0);
    }


}