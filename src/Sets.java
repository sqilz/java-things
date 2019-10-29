import lombok.EqualsAndHashCode;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        System.out.println(myHashSet.toString());
        myHashSet.add(2);
        System.out.println(myHashSet);
        myHashSet.add(23);
        myHashSet.add(23);
        myHashSet.add(21);
        System.out.println(myHashSet);
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        HashSet<Money> test = new HashSet<>();

        test.add(income);
        test.add(expenses);
        System.out.println(test);
        java.util.HashSet<Money> test2 = new java.util.HashSet<>();

        test2.add(income);
        test2.add(expenses);
        System.out.println(test2);

    }

    @EqualsAndHashCode
    static class Money {
        int amount;
        String currencyCode;

        public Money(int amount, String currencyCode) {
            this.amount = amount;
            this.currencyCode = currencyCode;
        }

    }
}
