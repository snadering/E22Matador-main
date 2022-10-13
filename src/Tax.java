import java.util.ArrayList;

public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);

    }

    @Override
    public String onLand(Player p) {
        String s = super.onLand(p);
        s += "\n Vil du betale fast beløb? Tast J for ja \n (Ellers trækker vi et beløb der svarer til 10 % af dine aktiver)";
        return s;
    }

    @Override
    protected String onAccept(Player p) {
        p.pay(this.cost);
        return p.getName()+" har nu betalt et fast beløb";
    }



    @Override
    protected String onReject(Player p) {

        float balance = p.getBalance();
        /*Todo: indkommenter følgende linje når metoden er skrevet: */
        float assets = calculateAssets(p);
        float calcTax = balance + assets * 0.1f; // todo: ændres til denne assignment: balance + assets * 0.1f; (Når der er kommet en værdi i 'assets')

        p.pay((int) calcTax);

        return p.getName()+" Afviste at betale et fast beløb i skat. Vi har derfor trukket 10 % af "+p.getName()+"'s aktiver";
    }


    public int calculateAssets(Player p) {
        int assets  = p.getBalance();
        assets += p.getPropertyValues();
        return assets;
    }
}
