package lesson10.homework10_1;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Альона", "Одесса", "Женский");
        Customer customer2 = new Customer("Михаил", "Буча", "Мужской");
        Customer customer3 = new Customer("Test", "Полтава", "Мужской");
        Customer customer4 = new Customer("Анна", "Киев", "Женский");

        ElectronicsOrder eOrder1 = new ElectronicsOrder("Пылесос", new Date(), "Киев", "Одесса", 4500, customer1, 12);
        eOrder1.validateOrder();
        eOrder1.calculatePrice();

        ElectronicsOrder eOrder2 = new ElectronicsOrder("Флешка", new Date(), "Одесса", "Буча", 300, customer2, 3);
        eOrder2.validateOrder();
        eOrder2.calculatePrice();

        FurnitureOrder fOrder1 = new FurnitureOrder("Шторы", new Date(), "Полтава", "Киев", 1000, customer3, "Str99734");
        fOrder1.validateOrder();
        fOrder1.calculatePrice();

        FurnitureOrder fOrder2 = new FurnitureOrder("Ковер", new Date(), "Харьков", "Одесса", 2100, customer4, "453rfdtg");
        fOrder2.validateOrder();
        fOrder2.calculatePrice();


        /*Customer customer7 = new Customer("Альона", "Одесса", "Женский");
        FurnitureOrder eOrder7 = new FurnitureOrder("Пылесос", new Date(), "xcvfxc", "Бровары", 1001, customer7, "fdgd");
        eOrder7.validateOrder();
        eOrder7.calculatePrice();
        System.out.println(eOrder7.getDateConfirmed());
        System.out.println(eOrder7.getTotalPrice());*/
    }
}
