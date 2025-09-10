package games.BankingV2;

public class chequeing extends accounts {

    public chequeing(String id, String name, String balance) {
        super(id, name, balance);
        
    }
    public chequeing(chequeing source )
    {
        super(source);
    }
    
}
