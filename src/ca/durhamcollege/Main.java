/**
 * @author  Russell Waring
 * @file    OOP3200 - Week 9, Java - Logic, Arrays & String
 * @date    November 8th, 2021
 */
package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    /**
     * This method gets a string from the console
     * @param prompt a friendly message to show the user
     * @param object the object type to store the console input
     * @return the value from the console
     */
    public static Object getConsoleInput(String prompt, Object object)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);
        // console.nextLine(); // this is the input inquiry // DRY - Do Not Repeat Yourself


        switch (object.getClass().getSimpleName()) // a switch case. Can't switch on anything but an int in c++ and other lower-lvl languages
        {
            case "String":
                return console.nextLine();
            case "Integer":
                return console.nextInt();
            case "Float":
                return console.nextFloat();
            default:
                return console.nextLine();
        }
    }

    /**
     * For each line in the log, outputs a line of string
     * @param log string array of input lines
     */
    public static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
        int intNumber = 0;
        float floatNumber = 0.0f; // "notice the f"
        String stringInput = "";

        stringInput = (String) getConsoleInput("Enter a String: ", stringInput);

        System.out.println("Our string is: " + stringInput);

        intNumber = (Integer) getConsoleInput("Enter an Integer: ", intNumber);

        System.out.println("Our integer is: " + intNumber);

        floatNumber = (Float) getConsoleInput("Enter a Float: ", floatNumber);

        System.out.println("Our float is: " + floatNumber);
    }
}
