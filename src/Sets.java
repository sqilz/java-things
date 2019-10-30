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
        System.out.println(test + "size " + test.size());

        test.remove(expenses);
        System.out.println(test  + "size " + test.size());

        test.add(income);
        System.out.println(test);
        test.clear();
        System.out.println(test);


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
