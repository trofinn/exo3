package org.example;

import java.util.ArrayList;

public class Calculatrice {
    private final String inputFilePath;
    private final String operation;
    private final IGetNumbersFromFileUseCase iGetNumbersFromFileUseCase;
    private final IPrintResult iPrintResult;

    public Calculatrice(String inputFilePath, String operation, IGetNumbersFromFileUseCase iGetNumbersFromFileUseCase, IPrintResult iPrintResult) {
        this.inputFilePath = inputFilePath;
        this.operation = operation;
        this.iGetNumbersFromFileUseCase = iGetNumbersFromFileUseCase;
        this.iPrintResult = iPrintResult;
    }


    public ArrayList<Integer> calculate() {
        var numbersFromFile = iGetNumbersFromFileUseCase.getFileLines(inputFilePath);
        ArrayList<Integer> result = new ArrayList<>();

        if(operation.equals("+")) {
            for(int i=1; i<numbersFromFile.size(); i++) {
                result.add(addFromZeroToN(i, numbersFromFile));
            }
        }
        if(operation.equals("*")) {
            for(int i=1; i<numbersFromFile.size(); i++) {
                result.add(multiplyFromZeroToN(i, numbersFromFile));
            }
        }

        iPrintResult.printResult(operation, numbersFromFile, result);

        return result;
    }


    private int addFromZeroToN(int n, ArrayList<String> numbers) {
        int result = Integer.parseInt(numbers.get(0));
        for(int i=1; i<n+1; i++) {
            result = result + Integer.parseInt(numbers.get(i));
        }
        return result;
    }

    private int multiplyFromZeroToN(int n, ArrayList<String> numbers) {
        int result = 1;
        for(int i=0; i<n; i++) {
            result = result + result * Integer.parseInt(numbers.get(i));
        }
        return result;
    }

}
