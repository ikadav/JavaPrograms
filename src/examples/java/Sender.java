package examples.java;
import java.io.*;
import java.util.*;
 
// A Class used to send a message
class Sender
{
    public synchronized void send(String msg)
    {
        System.out.println("Sending\t"  + msg );
       try // This sleep is just to make the program slow
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        } 
        System.out.println("\n" + msg + "Sent");
    }
}
 