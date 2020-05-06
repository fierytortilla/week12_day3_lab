import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<ICard> cards;

    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<ICard>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size();
    }

    public void addItem(ICard item) {
        this.cards.add(item);
    }
}
