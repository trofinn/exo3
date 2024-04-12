package org.example;

import java.util.ArrayList;

public class CalculatriceMultiply {
    private final String inputFilePath;
    private final String operation;
    private final IGetNumbersFromFileUseCase iGetNumbersFromFileUseCase;
    private final IPrintResultForMultiply iPrintResult;

    public CalculatriceMultiply(String inputFilePath, String operation, IGetNumbersFromFileUseCase iGetNumbersFromFileUseCase, IPrintResultForMultiply iPrintResult) {
        this.inputFilePath = inputFilePath;
        this.operation = operation;
        this.iGetNumbersFromFileUseCase = iGetNumbersFromFileUseCase;
        this.iPrintResult = iPrintResult;
    }

    private int multiplyFromZeroToN(int n, ArrayList<String> numbers) {
        int result = 1;
        for(int i=0; i<n; i++) {
            result = result + result * Integer.parseInt(numbers.get(i));
        }
        return result;
    }

    public ArrayList<Integer> multiply() {

        var numbersFromFile = iGetNumbersFromFileUseCase.getFileLines(inputFilePath);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<numbersFromFile.size(); i++) {
            result.add(multiplyFromZeroToN(i, numbersFromFile));
        }
        iPrintResult.printResultForMultiply(operation, numbersFromFile, result);
        return result;
    }
}
