package grocery.calculator;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Ryan
 */
public class GroceryDriver {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
         private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    //function to display menu
    public static void displayMenu() {
        System.out.println("Select an option:\n(1) Input a Grocery item,\n"
                + "\n"
                + "(2) Input Meat item,\n"
                + "\n"
                + "(3) Input Produce item,\n"
                + "\n"
                + "(-1) End user input.\n Enter: ");
    }
    
        public static void main(String args[]) throws IOException {
        
         
        
        String file_name_out = "C:\\school\\WriteFile.txt";
        
        //create arraylist
        ArrayList<Grocery> groceries = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int userChoice = -1;
        do {
            
            //the menu
            displayMenu();
            userChoice = in.nextInt();
            String name = "";
            int quantity = 0;
            double cost = 0.0;
            int cookingTemp = 0;
            String cookingTime = "";
            boolean cooked = false;
            boolean needsPeeled = false;
            boolean peeled = false;

            switch (userChoice) {

                case 1:
                    in.nextLine();
                    System.out.println("Enter Item Name");
                    name = in.nextLine();
                    System.out.println("Enter the quanity");
                    quantity = Integer.parseInt(in.nextLine());
                    if (quantity < 1) {
                        System.out.println("Invalid quantity!!");
                        break;
                    }

                    System.out.println("Enter the cost");
                    cost = Double.parseDouble(in.nextLine());
                    if (cost <= 0) {
                        System.out.println("Invalid Cost!!!!");
                        break;
                    }
                    groceries.add(new Grocery(name, quantity, cost));
                    break;
                case 2:
                    in.nextLine();
                    System.out.println("Enter Item Name");
                    name = in.nextLine();
                    System.out.println("Enter the quanity");
                    quantity = Integer.parseInt(in.nextLine());
                    if (quantity < 1) {
                        System.out.println("Invalid quantity!!");
                        break;
                    }

                    System.out.println("Enter the cost");
                    cost = Double.parseDouble(in.nextLine());
                    if (cost <= 0) {
                        System.out.println("Invalid Cost!!!!");
                        break;
                    }
                    System.out.println("Cooking Temperature (degrees)");
                    cookingTemp = Integer.parseInt(in.nextLine());
                    System.out.println("Enter cooking Time: (enter in minutes)");
                    cookingTime = in.nextLine();
                    System.out.println("Is item Cooked?  (enter true or false)");
                    cooked = in.nextBoolean();
                    //this is where we will use the meat class
                    Meat meat = new Meat(name, quantity, cost, cookingTemp, cookingTime, cooked);

                    //adds meats to the array list
                    groceries.add(meat);

                    break;
                case 3:
                    in.nextLine();
                    System.out.println("Enter Item Name");
                    name = in.nextLine();
                    System.out.println("Enter the quanity");
                    quantity = Integer.parseInt(in.nextLine());
                    if (quantity < 1) {
                        System.out.println("Invalid quantity!!");
                        break;
                    }

                    System.out.println("Enter the cost");
                    cost = Double.parseDouble(in.nextLine());
                    if (cost <= 0) {
                        System.out.println("Invalid Cost!!!!");
                        break;
                    }
                    System.out.println("needs to peeled (enter true or false)");
                    needsPeeled = in.nextBoolean();
                    System.out.println("Has been peeled (enter true or false)");
                    peeled = in.nextBoolean();
                    //this is where we will use the produce class
                    Produce produce = new Produce(name, quantity, cost, needsPeeled, peeled);
                    produce.setName(name);
                    produce.setQuantity(quantity);
                    produce.setCost(cost);
                    //this is where we will add produce to the array list
                    groceries.add(produce);
                    break;

            }
        } while (userChoice != -1);

        //Displays the information
        System.out.println( "Program: Grocery Calculator");
        System.out.println( "Name: Jeremy Ryan");
        System.out.println( "Class: QMB1200c OOP Using Java | Module 4 | Course Project");
        Date date2 = new Date();
        System.out.println( sdf.format(date2));
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println("Grocery Item " + (i + 1) + ":" + groceries.get(i).toString());
        }
        System.out.println("Total" + " Cost: $" + groceries.get(groceries.size() - 1).getTotalExtendedCost() + " | Total Quantity: "
                + groceries.get(groceries.size() - 1).getTotalQuantity() + " | " + groceries.get(groceries.size() - 1).getTotalsAverage());
        
        try {
            
                      
            System.out.println("Starting to create file");
            WriteFile data= new WriteFile(file_name_out, false);
            data.writeToFile( "Program: Grocery Calculator");
            WriteFile data2= new WriteFile(file_name_out, true);
            data2.writeToFile( "Name: Jeremy Ryan");
            data2.writeToFile( "Class: QMB1200c OOP Using Java | Module 4 | Course Project");
            Date date = new Date();
            data2.writeToFile( sdf.format(date));
            int z;
            for ( z=0; z < groceries.size(); z++ ) {
                data2.writeToFile( "Grocery Item " + (z + 1) + ":" + groceries.get(z).toString());
            
            }
            
            data2.writeToFile("Total" + " Cost: $" + groceries.get(groceries.size() - 1).getTotalExtendedCost() + " | Total Quantity: "
                + groceries.get(groceries.size() - 1).getTotalQuantity() + " | " + groceries.get(groceries.size() - 1).getTotalsAverage());
            System.out.println("File created successfully.");
            
        }
        catch (IOException e) {
            System.out.println( e.getMessage());
        }
        
    }
}
