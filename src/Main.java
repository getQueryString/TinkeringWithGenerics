// Copyright© by Fin

public class Main {

    public static void main(String[] args) {
        Generics<String, Integer, Double> stringIntegerDoubleGenerics = new Generics<>();

        stringIntegerDoubleGenerics.setStringObject("STRING");
        stringIntegerDoubleGenerics.setIntegerObject(12345);
        stringIntegerDoubleGenerics.setDoubleObject(1.2);

        System.out.println("No longer zero:");
        System.out.println(stringIntegerDoubleGenerics.getStringObject());
        System.out.println(stringIntegerDoubleGenerics.getIntegerObject());
        System.out.println(stringIntegerDoubleGenerics.getDoubleObject());
    }
}