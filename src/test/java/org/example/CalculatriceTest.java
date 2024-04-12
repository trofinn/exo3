package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatriceTest {

    @Test
    public void shouldAdd() {
        String path = "src/main/java/org/example/numbers.csv";
        CalculatriceAdd calculatrice = new CalculatriceAdd(path, "+", new AdapterCSV(), new AdapterPrintForAdd());
        var result = calculatrice.add();

        Assertions.assertEquals(result.get(0).toString(), "3");
        Assertions.assertEquals(result.get(1).toString(), "6");
        Assertions.assertEquals(result.get(2).toString(), "10");

    }

    @Test
    public void shouldMultipy() {
        String path = "src/main/java/org/example/numbers.csv";
        CalculatriceMultiply calculatrice = new CalculatriceMultiply(path, "*", new AdapterCSV(), new AdapterPrindForMultiply());
        var result = calculatrice.multiply();

        Assertions.assertEquals(result.get(0).toString(), "2");
        Assertions.assertEquals(result.get(1).toString(), "6");
        Assertions.assertEquals(result.get(2).toString(), "24");

    }

}