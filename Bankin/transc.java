package games.Bankin;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class transc extends search{

    public static String name;
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    static LocalDateTime now = LocalDateTime.now();
    
    
    Scanner sc = new Scanner(System.in);
    String input;
    public transc()
    {
        System.out.println("\t1.)Deposit \n\t2.)Withdraw \n\t3.)Transfer \n\t4.)Show account logs \n\t5.)Exit");
        input = sc.nextLine();
        switch(input)
        {
            case "1":System.out.println("Enter the amount you wish to deposit");

            case "2":

            case "3":

            case "4":

            case "5":

            default:
        }

    }
    
    public void timeLog()
    {
        System.out.println(dtf.format(now));
    }
    public static void setFileName(String w)
    {
        search q = new search();
        q.setID(w);
        name = q.getID() + ".txt";
    }
    public static void updateLogs( String id, String content)
    {
        setFileName(id);
        String path = System.getProperty("user.dir") + "\\" + "folder" + "\\" + name;
        System.out.println(path);

        try 
        {
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dtf.format(now) + content);
            bw.close();
            fw.close();
        }
        catch(IOException e)
        {
                e.getMessage();
        }
    }

    
}
