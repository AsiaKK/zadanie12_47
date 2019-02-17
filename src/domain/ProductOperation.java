package domain;

public class ProductOperation {

    public double sumOfProductPrice(Product[] products){
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public Product getTheMostExpensiveProduct(Product[] products) {
        if (products == null || products.length == 0) {
            throw new IllegalArgumentException("Nic nie ma");
        }

        Product theMostExpensiveProduct = products[0];
        for (Product product : products) {
            if (product.getPrice() > theMostExpensiveProduct.getPrice()) {
                theMostExpensiveProduct = product;
            }
        }
        return theMostExpensiveProduct;
    }

}
