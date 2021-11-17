package ca.durhamcollege;

import java.util.ArrayList;
import java.util.Scanner;

public class Console
{
    // private instance variables (members / fields)
    private ArrayList<String> stringLog; // declare shape of variable, and initialize after in function (constructor)
    private ArrayList<Integer> intLog; // when you instantiate an obj of 'type' this is the way
    private ArrayList<Float> floatLog;
    // public properties (getters / setters)

    // constructors
    public Console()
    {
        initialize();
    }

    // private members
    private boolean notEmpty(ArrayList list)
    {
        if(list.isEmpty())
        {
            System.out.println("Specified Log is empty.");
            return false;
        }
        return true;
    }

    // public methods

    /**
     * Initializes all input logs. If input logs already initialized - performs destructive clear.
     */
    public void initialize() // can be called anytime, and is destructive
    {
        // instantiate empty lists of various types
        stringLog = new ArrayList<String>();
        intLog = new ArrayList<Integer>();
        floatLog = new ArrayList<Float>();
    }

    /**
     * This method gets a string from the console
     * @param prompt a friendly message to show the user
     * @param type indicates the input type to be used
     */
    public void input(String prompt, InputTypes type)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);

        try
        {
            switch (type)
            {
                case STRING:
                    stringLog.add(console.nextLine());
                    break;
                case INTEGER:
                    int intInput = console.nextInt();
                    intLog.add(intInput);
                    break;
                case FLOAT:
                    float floatInput = console.nextFloat();
                    floatLog.add(floatInput);
                    break;
            }
        }
        catch (Exception e)
        {
            String message ="ERROR: Incorrect Type entered. ";
            if(type == InputTypes.INTEGER)
            {
                message += "Please re-enter an Integer: ";
                input(message, InputTypes.INTEGER);
            }
            else if(type == InputTypes.FLOAT)
            {
                message = "Please re-enter a Float: ";
                input(message, InputTypes.FLOAT);
            }
        }
    }

    /**
     * Adds a string to the string Log
     * @param prompt
     */
    public void input(String prompt)
    {
        input(prompt, InputTypes.STRING);
    }

    /**
     * For each line in the log, outputs a line of string
     * @param type indicates the type to be printed
     */
    public void printLog(InputTypes type) // no longer need for generic type, just specify what the log is
    {
        switch (type)
        {
            case STRING:
                if(!notEmpty(stringLog))
                {
                    for (var line : stringLog)
                    {
                        System.out.println(line);
                    }
                }
                break;
            case INTEGER:
                if(!notEmpty(intLog))
                {
                    for (var line : intLog)
                    {
                        System.out.println(line);
                    }
                }
                break;
            case FLOAT:
                if(!notEmpty(floatLog))
                {
                    for (var line : floatLog)
                    {
                        System.out.println(line);
                    }
                }
                break;
        }
    }

    /**
     * Prints the string log (this is a default)
     */
    public void printLog()
    {
        printLog(InputTypes.STRING);
    }

    /**
     * This function adds element to a generic array
     * @param type indicates the log to be cleared
     */
    public void clear(InputTypes type)
    {
        switch (type)
        {
            case STRING:
                stringLog.clear();
                break;
            case INTEGER:
                intLog.clear();
                break;
            case FLOAT:
                floatLog.clear();
                break;
        }

    }

    /**
     * Clears all input logs (non-destructive)
     */
    public void clearAll()
    {
        stringLog.clear();
        intLog.clear();
        floatLog.clear();
    }
}
