package aggregation;

public class Driver {

    public static void main(String[] args) {

        String amountOfLettuce = "a lot";
        Salad salad = new Salad(amountOfLettuce, "not much", "tons","a few"); // aggregation
        System.out.println(salad);

        Salad anotherSalad = new Salad(); // composition
        System.out.println(anotherSalad);
        System.out.println(amountOfLettuce);
    }
}
