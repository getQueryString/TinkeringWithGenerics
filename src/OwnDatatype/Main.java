package OwnDatatype;// Copyright© by Fin

public class Main {

    public static void main(String[] args) {
        QueryValue<String, String, String> generics = new QueryValue<>();

        generics.add("Eins", "Zwei", "Drei");

        System.out.println("1.");
        System.out.println("Generic 1: " + generics.get());

        generics = null;

        QueryValue<String, Integer, Double> generics2 = new QueryValue<>();
        generics2.add("Test", 321, 3.14);

        System.out.println("2.");

        try {
            System.out.println("Generic 1: " + generics.get());
        } catch (NullPointerException npe) {
            System.out.println("null");
        }

        System.out.println();
        System.out.println("Generic 2: " + generics2.get());
    }
}