package games.BankingV2;

public abstract class accounts {
    private String id;
    private String name;
    private String balance;

    public accounts(String id , String name, String balance)
    {
        setName(name);
        setBalance(balance);
        setId(id);
    }
    public accounts(accounts source)
    {
        setName(source.name);
        setBalance(source.balance);
        setId(source.id);
    }
    public String getBalance() {
        return balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setBalance(String balance) 
    {
        if(balance == null || balance.isBlank())
        {
            throw new IllegalArgumentException("Invalid Balance");
        }
        this.balance = balance;
    }
    public void setId(String id) {
        if(id == null || id.isBlank())
        {
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id = id;
    }
    public void setName(String name) {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Invalid Name");
        }
        this.name = name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (this.getClass().getSimpleName()) + "       " + 
                "\t" + this.getId() + " " +
                "\t" + this.getName() + " " +
                "\t" + this.getBalance() + " ";
    }
    
}
