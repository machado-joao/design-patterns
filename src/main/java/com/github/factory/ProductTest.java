package com.github.factory;

public class ProductTest {

    public static void main(String[] args) {

        Product digitalProduct = ProductFactory.getInstance(ProductType.DIGITAL);
        Product physicalProduct = ProductFactory.getInstance(ProductType.PHYSICAL);
        System.out.println(digitalProduct);
        System.out.println(physicalProduct);
    }

}
