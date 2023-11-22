package tr.com.huseyinaydin.pattern_matching_instanceof;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java 21.
 *
 */

class Product {
    String model;
    Double price;

    @Override
    public boolean equals(Object obj) {
        // Kodun eski hali.
        /*
        if (obj instanceof Product) {
           Product otherObj = (Product) obj;
           return model.equals(otherObj.model) && price.equals(otherObj.price);
        }
        return false;
        */

        // JAVA 14 - Yeni kod, uzun versiyonu
        if (obj instanceof Product otherObj) {
            return model.equals(otherObj.model) && price.equals(otherObj.price);
        }
        return false;

        // JAVA 14 - Yeni kod, kısa version
        // return obj instanceof Monitor otherObj && model.equals(otherObj.model) && price.equals(otherObj.price);
    }
}

public class MainApplication {
    public static void main(String[] args) {
        // Product product1 = new Product();
        var product1 = new Product();
        product1.model = "Lenovo";
        product1.price = 100.0;
        System.out.println("Ürün 1: " + product1);
        System.out.println("Modeli: " + product1.model);
        System.out.println("Fiyatı: " + product1.price);

        System.out.println("--------------------------------------");

        //  Product product2 = new Product();
        var product2 = new Product();
        product2.model = "MSI";
        product2.price = 200.0;
        System.out.println("Ürün 2: " + product2);
        System.out.println("Modeli: " + product2.model);
        System.out.println("Fiyatı: " + product2.price);

        System.out.println(product1.equals(product2));
    }
}