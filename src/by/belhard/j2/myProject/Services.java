package by.belhard.j2.myProject;

import by.belhard.j2.Exceptions.InvalidInputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Services /*extends Commands*/ {

    private final BufferedReader reader;

    public Services() {

        reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        sb.append("Select an action:\n")
                .append("1 Add Visa\n")
                .append("2 Delete Visa\n")
                .append("3 Change Visa\n")
                .append("4 Show All Visas\n")
                .append("5 Show clients' base\n")
                .append("6 Change status of visa application\n")
                .append("7 Calculate the company's revenue\n")
                .append("0 Close program");
        System.out.println(sb);
    }


    public BufferedReader startWork() throws IOException, StringIndexOutOfBoundsException{

        String visas ="";
        String clients = "";
        int amount;
        char a = '0';

        try {
            a = askForInput();
        } catch (InvalidInputException e) {
            System.err.println("There is no such command!");
            return null;

        }

        while (a != '0'){
        switch (a) {
            case '1':
                System.out.printf("Enter the following parameters: \n 1. Country.\n 2. Visa fee.\n " +
                        "3. Currency of visa fee.\n 4. The cost of visa services in the agency.\n");
                break;
            case '2':
                System.out.printf("If you want to delete the visa, please enter the country.\n");
                break;
            case '3':

            case '4':
                System.out.printf("Visa list:\n");
                break;
            case '5':
                System.out.printf("Clients'base:\n");
                break;
            case '6':
                System.out.printf("Enter the following parameters: \n 1. Client.\n 2. Visa.\n " +
                        "3. Decision date.\n 4. New status.\n");
                break;

            case '7':
                System.out.println("Total revenue of the company is: " );
            case '0':
                return startWork();


        }}

        return null;
    }

    private char askForInput() throws IOException, StringIndexOutOfBoundsException {
        String s = reader.readLine();
        if (s.length() != 1 && !s.matches("[01234567]"))
            throw new InvalidInputException();

        return s.charAt(1);

    }

}