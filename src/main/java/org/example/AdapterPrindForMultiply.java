package org.example;

import java.util.ArrayList;

public class AdapterPrindForMultiply implements IPrintResultForMultiply{

    @Override
    public void printResultForMultiply(String operation, ArrayList<String> linesFromFile, ArrayList<Integer> result) {
        System.out.println(linesFromFile.get(0));
        for(int i=1;i<linesFromFile.size(); i++) {
            System.out.println(operation + linesFromFile.get(i) + "(=" + result.get(i-1) + ")" );
        }

        System.out.println("---------");
        System.out.println("total = " + result.get(result.size() -1 ) + " mulitplication");
    }
}
