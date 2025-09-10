package games.Bankin;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class search extends records
{
    boolean pass = false;
    ArrayList<String> S;
    String ID;
    
    public search()
    {

    }
    public void save(String x)
    {
        S = new ArrayList<String>();
        String hold = "";
        for (int i = 0; i < x.length(); i++) 
        {
            
            if(x.substring(i, i + 1).equals(" ") || i == x.length() - 1)
            {
                S.add(hold);
                hold = "";
            }
            else
            {
                if(x.substring(i, i + 1).equals("[") || x.substring(i, i + 1).equals("]")  )
                {
                    continue;
                }
                hold += x.substring(i, i + 1);
            }
        }
    }
    public void setID(String id) {
        this.ID = id;
    }
    public  String getID()
    {
        return ID;
    }
    public boolean check()
    {
        if(S.contains(ID))
        {
            System.out.println("We have found your account");
            System.out.println(S);
            transc.updateLogs(ID, "\tLogged In.");
            pass = true;
            return true;
        }

        else
        {
            return false;
        }
        
    }

    public void reader() throws IOException
    {
        Scanner sc = new Scanner(FILENAME);
            try {
                BufferedReader bf = new BufferedReader(new FileReader(FILENAME));
                String line;
                while((line = bf.readLine()) != null)
                {
                    save(line);
                    check();
                    if(pass == true)
                    {
                        break;
                    }
                    // if(line.contains(key))
                    // {
                    //     //System.out.println(line);
                    //     bal = getBalance(line);
                    //     typ = getType(line);
                    //     System.out.println("We have found your account!");
                    //     break;
                    // }
                    
                }
                if(pass == false)
                {
                    System.out.println("no such account Id exist in our database");
                }
                bf.close();
                sc.close();
            } 
            catch (FileNotFoundException e) {
                
                e.printStackTrace();
            }
    }
    
}
