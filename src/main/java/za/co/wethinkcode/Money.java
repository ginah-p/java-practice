package za.co.wethinkcode;

public class Money implements Comparable<Money>
{
    public Money ZERO = new Money( 0 );


    // TODO
    public Money(int money) {
    }

    public Money(String money) {
    }


    public Money add(Money amount) {
        return ZERO = amount;
    }

    public Money subtract(Money amount){
        return ZERO = amount;
    }

    public String formattedAsRands() {
        return "R" + String.format("%.2f", ZERO);
    }

    @Override
    public int compareTo(Money o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
