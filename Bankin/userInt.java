package games.Bankin;

import java.io.IOException;
import java.util.Scanner;
public class userInt {
    records a = new records();
    Scanner x = new Scanner(System.in);
    transc y;
    boolean loop = true;
    public userInt()
    {
        System.out.println("================================================" + 
                           "\n\tWELCOME TO THE BANK OF JAVA!\n" + 
                           "================================================\n\n");

        while(loop)
        {
            System.out.println("\t1.)LOGIN\n\t2.)OPEN ACCOUNT\n\t3.EXIT" );
            String hol = x.nextLine();
            if(hol.equals("1"))
            {   
                search u = new search();
                System.out.println("please enter your account ID number");
                hol = x.nextLine();
                if(hol.length() != 10)
                {
                    System.out.println("NOT A VALID ACCOUNT ID, RETURNING TO MAIN MENU...");
                    continue;
                }
                else
                {
                    u.setID(hol);
                    try {
                        u.reader();
                    } catch (IOException e) {
                        
                        e.printStackTrace();
                    }
                    y = new transc();
                    
                }



                break;
            }
            else if(hol.equals("2"))
            {
                accounts r = new accounts();
                records.O.add(r);
                a.updateRecords();
                break;
            }
            else if(hol.equals("3"))
            {
                // transc test = new transc();
                // test.timeLog();
                leave();
                break;
            }
            else if(!hol.equals("1") && !hol.equals("1") && !hol.equals("3") )
            {
                System.out.println("INVALID INPUT");
            }
        }
                    
    }
    public void leave()
    {
        mainBank.stay = false;
    }
    // public void nine(String e)
    // {
    //     if(e.length() != 9)
    //     {
    //         System.out.println("not a valid account ID");
    //     }
    // }
}
