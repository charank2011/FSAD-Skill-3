package com.product.main;

import com.product.dao.ProductDao;
import com.product.entity.Product;

public class App {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();

        // INSERT
        Product p1 = new Product("Laptop", "Dell i5", 60000, 10);
        Product p2 = new Product("Mouse", "Wireless", 800, 50);

        dao.saveProduct(p1);
        dao.saveProduct(p2);

        // READ
        Product product = dao.getProductById(1);
        System.out.println("Product Name: " + product.getName());

        // UPDATE
        product.setPrice(58000);
        product.setQuantity(8);
        dao.updateProduct(product);

        // DELETE
        dao.deleteProduct(2);
    }
}
