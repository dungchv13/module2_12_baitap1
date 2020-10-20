package sudung_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    ArrayList<Product> myProducts = new ArrayList<>();

    public void add(Product p){
        myProducts.add(p);
    }

    public void remove(int id){
        myProducts.removeIf(p -> p.getId() == id);
    }

    public void chance(int id,String name,int price){
        for (Product p:myProducts) {
            if(p.getId() == id){
                p.setName(name);
                p.setPrice(price);
            }
        }
    }

    public void display(){
        for (Product p:myProducts) {
            System.out.println(p.toString());
        }
    }

    public Product search(int id){
        Product p1 = new Product();
        for (Product p:myProducts) {
            if(p.getId() == id){
                p1 = p;
                break;
            }
        }
        return p1;
    }

    public void SortPrice(){
        Collections.sort(myProducts);
    }

}
