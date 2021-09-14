package com.company.lesson_9.MyShop;

import com.company.lesson_9.MyShop.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
     List<Product> list = new ArrayList<>();

    @Override
    public String toString() {
        return "Shop " +'\n'+
                 list;
    }

    public void addProduct(Product p) {
        for (Product product : list) {
            if (product.getId() == p.getId()){
                System.out.println("Товар с таким ID существует");
                return;
            }
        }
        list.add(p);
        signIndex();
    }

    public void getProduct() {
        System.out.println(list);
    }

    public boolean remove(int id) {
        list.removeIf(product -> product.getId() == id);
        return true;
    }

    public void sortPriceUp() {
        list.sort(Comparator.comparing(Product::getPrice));
        getProduct();
    }

    public void sortPriceDown(){
        list.sort(Comparator.comparing(Product::getPrice).reversed());
        getProduct();
    }

    public void correct(int id, String name, int price) {
        for (Product product : list) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
            }else {
                System.out.println("Такого продукта не существует");
            }
            return;
        }
    }
    public void signIndex() {
        int index = 0;
        for (Product p : list) {
            p.setIndex(index);
            index++;
        }
    }

    public void sortFromNew() {
        list.sort(Comparator.comparing(Product::getIndex).reversed());
        getProduct();
    }
}
