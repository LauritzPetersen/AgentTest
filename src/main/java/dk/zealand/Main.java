package dk.zealand;

import java.util.Scanner;

public class Main {

    private static final DishService DISH_SERVICE = new DishService();

    private static final Dish[] DISHES = {
            DISH_SERVICE.createDish("Festivalburger", 59),
            DISH_SERVICE.createDish("Sprøde fritter", 35),
            DISH_SERVICE.createDish("Vegansk bowl", 65)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("ByteBites – festivalens foodtruck");

        while (running) {
            showMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> showDishes();
                case "2" -> System.out.println(
                        "Oprettelse af bestillinger er endnu ikke implementeret."
                );
                case "0" -> running = false;
                default -> System.out.println(
                        "Ugyldigt valg. Vælg 0, 1 eller 2."
                );
            }
        }

        System.out.println("Programmet er afsluttet.");
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("1. Vis retter");
        System.out.println("2. Opret bestilling");
        System.out.println("0. Afslut");
        System.out.print("Vælg: ");
    }

    private static void showDishes() {
        System.out.println("Retter:");

        for (int i = 0; i < DISHES.length; i++) {
            Dish dish = DISHES[i];
            System.out.printf("%d. %s - %d kr.%n", i + 1, dish.getName(), dish.getPrice());
        }
    }
}
