package org.example;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/java/org/example/numbers.csv";
        Calculatrice calculatrice = new Calculatrice(path, "*", new AdapterCSV(), new AdapterPrint());
        calculatrice.calculate();
    }
}