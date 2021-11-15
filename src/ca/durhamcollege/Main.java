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
    public static <T> T getConsoleInput(String prompt, T object)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "String":
                return (T) console.nextLine();
            case "Integer":
                return (T) console.nextInt();
            case "Float":
                return (T) console.nextFloat();
            default:
                return (T) console.nextLine();
        }
    }

    /**
     * For each line in the log, outputs a line of string
     * @param log string array of input lines
     */
    public static <T> void printLog(T[] log) throws Exception // If not getting a String, Int or Float
    {
        int capacity = 0;
        String prompt = "";

        if(log instanceof String[])
        {
            capacity = Config.NUM_OF_STRINGS;
            prompt = "Enter your String: ";
        }
        else if (log instanceof Integer[])
        {
            log[i] = (T) new Integer(0);
        }

        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void printLog(int[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void printLog(float[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }


    public static void buildLog(String[] log)
    {
        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            String prompt = "Enter your String: ";
            log[i] = "";
            log[i] = (String) getConsoleInput(prompt, log[i]);
        }
    }

    public static void buildLog(int[] log)
    {
        for (int i = 0; i < Config.NUM_OF_INTEGERS; i++)
        {
            String prompt = "Enter your Integer: ";
            log[i] = (int) getConsoleInput(prompt, log[i]);
        }
    }

    public static void buildLog(float[] log)
    {
        for (int i = 0; i < Config.NUM_OF_FLOATS; i++)
        {
            String prompt = "Enter your Float: ";
            log[i] = (float) getConsoleInput(prompt, log[i]);
        }
    }

    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
        String[] Log = new String[Config.NUM_OF_STRINGS];
        int[] intLog = new int[Config.NUM_OF_INTEGERS];
        float[] floatLog = new float[Config.NUM_OF_FLOATS];

        buildLog(Log);
        printLog(Log);
        System.out.println(); // empty spac

        buildLog(intLog);
        printLog(intLog);
        System.out.println(); // empty space

        buildLog(floatLog);
        printLog(floatLog);
        System.out.println(); // empty space
    }
}
