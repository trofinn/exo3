package org.example;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/java/org/example/numbers.csv";
        CalculatriceAdd calculatriceAdd = new CalculatriceAdd(path, "+", new AdapterCSV(), new AdapterPrintForAdd());
        CalculatriceMultiply calculatriceMultpl = new CalculatriceMultiply(path, "*", new AdapterCSV(), new AdapterPrindForMultiply());
        calculatriceAdd.add();
        calculatriceMultpl.multiply();
    }
}