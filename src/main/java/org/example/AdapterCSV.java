package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdapterCSV implements IGetNumbersFromFileUseCase {

    @Override
    public ArrayList<String> getFileLines(String path) {
        ArrayList<String> result = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(path));

            while (scanner.hasNextLine()) {
                result.add(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }
}
