package sudung_LinkedList;

import sudung_ArrayList.Product;
import sudung_ArrayList.ProductManager;

public class TestProductManager {
    public static void main(String[] args) {
        sudung_ArrayList.ProductManager products = new ProductManager();

        for (int i = 1; i <= 10; i++) {
            sudung_ArrayList.Product product = new Product(i,"product"+i,(int)(Math.random()*50+50));
            products.add(product);
        }

        System.out.println("my products:");
        products.display();

        System.out.println("xoa product co id=7 va 4");
        products.remove(4);
        products.remove(7);
        products.display();

        System.out.println("chance(6,product6fix,100 )");
        products.chance(6,"product6fix",100);
        System.out.println(products.search(6).toString());

        System.out.println("sap xep theo price");
        products.SortPrice();
        products.display();
    }
}
