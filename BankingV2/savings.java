package games.BankingV2;

public class savings extends accounts {

    public savings(String id, String name, String balance) {
        super(id, name, balance);
        //TODO Auto-generated constructor stub
    }
    public savings(savings source)
    {
        super(source);
    }
}
