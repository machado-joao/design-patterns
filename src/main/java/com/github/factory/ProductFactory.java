package com.github.factory;

public class ProductFactory {

    public static Product getInstance(ProductType productType) {

        Product product;

        if (ProductType.DIGITAL.equals(productType)) {
            product = new DigitalProduct();
            product.setHasDimension(Boolean.FALSE);
        } else {
            product = new PhysicalProduct();
            product.setHasDimension(Boolean.TRUE);
        }

        return product;
    }
}
