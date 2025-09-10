package games.Bankin;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class records {
    
    public static final String FILENAME = "BankAccRecords.txt";
    public static ArrayList<accounts> O;
    public records()
    {

        records.O = new ArrayList<>();
        
    }
    public  void add(accounts x)
    {
        //String hold = x.toString();
        records.O.add(x);
    }


    public void updateRecords()
    {
        String path = System.getProperty("user.dir") + "\\" + FILENAME;
        System.out.println(path);

        try 
        {
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(O.toString() + "\n");
            bw.close();
            fw.close();
        }
        catch(IOException e)
        {
                e.getMessage();
        }
    }

    
}
