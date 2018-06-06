package lesson10.homework10_1;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Альона", "Одесса", "Женский");
        Customer customer2 = new Customer("Михаил", "Буча", "Мужской");
        Customer customer3 = new Customer("Test", "Полтава", "Мужской");
        Customer customer4 = new Customer("Анна", "Киев", "Женский");

        ElectronicsOrder eOrder1 = new ElectronicsOrder("Пылесос", new Date(), "Киев", "Одесса", 4500, customer1);
        eOrder1.validateOrder();
        eOrder1.calculatePrice();

        ElectronicsOrder eOrder2 = new ElectronicsOrder("Флешка", new Date(), "Одесса", "Буча", 300, customer2);
        eOrder2.validateOrder();
        eOrder2.calculatePrice();

        ElectronicsOrder fOrder1 = new ElectronicsOrder("Шторы", new Date(), "Полтава", "Киев", 1000, customer3);
        fOrder1.validateOrder();
        fOrder1.calculatePrice();

        ElectronicsOrder fOrder2 = new ElectronicsOrder("Ковер", new Date(), "Харьков", "Одесса", 2100, customer4);
        fOrder2.validateOrder();
        fOrder2.calculatePrice();
    }
}
