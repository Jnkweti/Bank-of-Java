package games.Bankin;

import java.util.Scanner;


public class accounts {
    private String name;
    private String type;
    private double balance = 0.0;
    private  String iD;
    Scanner z = new Scanner(System.in);
    
    //private String holder = getiD();
    public accounts()
    {
        

        System.out.println("what is your name?:");
        setName(z.nextLine());
        System.out.println("what type of account do you want to open?:");
        setType(z.nextLine());
        System.out.println("what is the initial amount you want to deposit in the account(100.00/10000.00ect..):");
        setBalance(z.nextDouble());
        getiD();
        System.out.println(iD + "\tThis is your account ID number do not lose it or share it with anyone as it is how you access you account.");
        
    }
//this constructor is used when trying to work with user data in records (DO NOT DELETE!)
    public accounts(String name, String type , double balance)
    {
        setName(name);
        setType(type);
        setBalance(balance);
    }

    public accounts(accounts source)
    {
        this.name = source.name;
        this.type = source.type;
        this.balance = source.balance;
    }

    public void setBalance(double balance) {

        
        this.balance = balance;
    }
    public void setName(String name) {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("INVALID NAME");
        }
        this.name = name;
    }
    public void setType(String type) {
        if(!type.equalsIgnoreCase("Savings") && !type.equalsIgnoreCase("Loan") && 
        !type.equalsIgnoreCase("Checking"))
        {
            throw new IllegalArgumentException("INVALID ACCOUNT TYPE");
        }
        this.type = type;
    }
    private String getiD() {
        iD = uniqueIdGenerator();
        return iD;
    }
    
    @Override
    public String toString() 
    {
        
        return name + " " + type + " " + balance + " " + iD;
    }
 
    private String uniqueIdGenerator()
    {
        String keys = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] k = keys.toCharArray();
        String ID = "";
        for (int index = 0; index < 10; index++) 
        {
            int rand = (int)(Math.random() * 52);
            ID += k[rand];
        }
        
        
        return ID;
    }
    
    //searches the file for the users account
    // public static void lookUp()
    // {

    // }

}
