package org.example;

import java.util.ArrayList;

public interface IPrintResult {
    public void printResultForAdd(String operation, ArrayList<String> linesFromFile, ArrayList<Integer> result);
    public void printResultForMultiply(String operation, ArrayList<String> linesFromFile, ArrayList<Integer> result);
}
