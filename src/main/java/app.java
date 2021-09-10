/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        Scanner scan;
        String output, state, county;
        double orderAmount, tax, total, taxRate = 0;

        System.out.println("Enter the order amount:");
        scan = new Scanner(System.in);
        orderAmount = Double.parseDouble(scan.next());

        System.out.println("Enter your state initials:");
        scan = new Scanner(System.in);
        state = scan.next();

        output = String.format("Total: $%.2f", orderAmount);

        if( (state.toUpperCase()).equals("WI") )
        {
            System.out.println("Enter the full name of your county:");
            scan = new Scanner(System.in);
            county = scan.next();

            if( (county.toLowerCase()).equals("eau claire") || (county.toLowerCase()).equals("eau claire county") )
            {
                taxRate += 0.005;
            }
            else if( (county.toLowerCase()).equals("dunn") || (county.toLowerCase()).equals("dunn county") )
            {
                taxRate += 0.004;
            }

            taxRate += 5;
            tax = (taxRate/100) * orderAmount;
            total = tax + orderAmount;
            output = String.format("Tax: $%.2f\nTotal: $%.2f", tax, total);
        }
        else if( (state.toUpperCase()).equals("IL") )
        {
            taxRate += 8;
            tax = (taxRate/100) * orderAmount;
            total = tax + orderAmount;
            output = String.format("Tax: $%.2f\nTotal: $%.2f", tax, total);
        }

        System.out.println(output);
    }
}