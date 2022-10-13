public class ChanceCard {
    private String text;
    private int cost;
    private int income;

    public ChanceCard(String text, int cost, int income) {
        this.text = text;
        this.cost = cost;
        this.income = income;
    }

    public String getText() {
        return text;
    }

    public int getCost() {
        return cost;
    }

    public int getIncome() {
        return income;
    }
}
