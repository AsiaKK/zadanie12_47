package utils;

import domain.Product;
import domain.ProductOperation;

import java.io.IOException;

public class ProductChecker {

    public static void main(String[] args) throws IOException {

        ProductReader productReader = new ProductReader();
        ProductOperation productOperation = new ProductOperation();

        Product[] products = productReader.getFromFile("resources/Products.CSV");

        Product theMostExpensiveProduct = productOperation.getTheMostExpensiveProduct(products);
        System.out.println(theMostExpensiveProduct.toString());

        double sumOfProductPrice = productOperation.sumOfProductPrice(products);
        System.out.println("The sum is equal: " +sumOfProductPrice);

    }


}
