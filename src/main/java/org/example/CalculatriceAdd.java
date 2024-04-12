package org.example;

import java.util.ArrayList;

public class CalculatriceAdd {
    private final String inputFilePath;
    private final String operation;
    private final IGetNumbersFromFileUseCase iGetNumbersFromFileUseCase;
    private final IPrintResultForAdd iPrintResult;

    public CalculatriceAdd(String inputFilePath, String operation, IGetNumbersFromFileUseCase iGetNumbersFromFileUseCase, IPrintResultForAdd iPrintResult) {
        this.inputFilePath = inputFilePath;
        this.operation = operation;
        this.iGetNumbersFromFileUseCase = iGetNumbersFromFileUseCase;
        this.iPrintResult = iPrintResult;
    }


    public ArrayList<Integer> add() {
        var numbersFromFile = iGetNumbersFromFileUseCase.getFileLines(inputFilePath);
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=1; i<numbersFromFile.size(); i++) {
            result.add(addFromZeroToN(i, numbersFromFile));
        }
        iPrintResult.printResultForAdd(operation, numbersFromFile, result);

        return result;
    }


    private int addFromZeroToN(int n, ArrayList<String> numbers) {
        int result = Integer.parseInt(numbers.get(0));
        for(int i=1; i<n+1; i++) {
            result = result + Integer.parseInt(numbers.get(i));
        }
        return result;
    }

}
