package utils;

import domain.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductReader {

    public Product[] getFromFile(String pathToFile) throws IOException {
        int numberOfProducts = countLines(pathToFile);
        Product[] products = new Product[numberOfProducts];

        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i = 0;
        String singleLine;
        while ((singleLine = bufferedReader.readLine()) != null) {
            products[i] = convertToProdduct(singleLine);
            i++;
        }

        bufferedReader.close();
        return products;
    }

    public int countLines(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int counter = 0;
        while ((bufferedReader.readLine()) != null) {
            counter++;
        }
        bufferedReader.close();
        return counter;
    }

    private Product convertToProdduct(String input) {
        // input == "nazwa1;producent1;cena1"

        String[] values = input.split(";");
        // values == [nazwa1][producent1][cena1]

        String name = values[0];
        String producer = values[1];
        double price = Double.valueOf(values[2]);

        return new Product(name, producer, price);
    }
}
