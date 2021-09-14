package com.company.lesson_9.MyShop;

import java.util.Scanner;

public class AppShop {
    Scanner scan = new Scanner(System.in);

    public void startShop() {
        Shop shop = new Shop();

        Product p1 = new Product(11, "Dirol", 3);
        Product p2 = new Product(15, "Orbit", 2);
        Product p3 = new Product(13, "Cola", 5);
        Product p4 = new Product(18, "Sprite", 6);
        Product p5 = new Product(19, "7Up", 6);

        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);
        shop.addProduct(p4);
        shop.addProduct(p5);


            while (true) {
                System.out.println("Выберите действие : get - вывод всех товаров, add - добавление товара," +
                        " del - удаление товара, corr - редактирование товара, stop - выйти из магазина");
                String enter = scan.nextLine();
                switch (enter) {
                    case "get":
                        System.out.println("Как сортировать? up - цена(возр), down - цена(убыв)," +
                                " new - по добавлению(от новых)");
                        String enterT = scan.nextLine();
                        switch (enterT) {
                            case "up":
                                shop.sortPriceUp();
                                break;
                            case "down":
                                shop.sortPriceDown();
                                break;
                            case "new":
                                shop.sortFromNew();
                                break;
                        }
                        break;

                    case "add":
                        System.out.println("Введите параметры : id, name, price");
                        System.out.print("\n id = ");
                        int id = scan.nextInt();
                        System.out.print("\n name ");
                        String name = scan.nextLine();
                        name = scan.nextLine();
                        System.out.print("\n price = ");
                        int price = scan.nextInt();
                        Product product = new Product(id, name, price);
                        shop.addProduct(product);
                        System.out.println("Товар добавлен");
                        break;
                    case "del":
                        System.out.print("\n Введите id товара, кторый хотите удалить: ");
                        int delId = scan.nextInt();
                        shop.remove(delId);
                        System.out.println("Товар удален");
                        break;
                    case "corr":
                        System.out.print("\n Введите id товара для редактирования: ");
                        int idCor = scan.nextInt();
                        System.out.print("\n Введите новое имя: ");
                        String nameCor = scan.nextLine();
                        nameCor = scan.nextLine();
                        System.out.print("\n Введите цену: ");
                        int priceCor = scan.nextInt();
                        shop.correct(idCor, nameCor, priceCor);
                        System.out.println("Товар отредактирован");
                        break;
                    case "stop":
                        System.out.println("Вы вышли из магазина");
                        break;
                }
                if (enter.equals("stop")){
                    break;
                }
            }
        }
    }
