import java.util.*;
class Main extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Count: " + i);
            try
            {
            	Thread.sleep(50);
            }
            catch(InterruptedException e)
            {
            	System.out.println("Exception");
            }
        }
    }

    public static void main(String[] args)
    {
        Main t1 = new Main();
        t1.start();  
    }
}