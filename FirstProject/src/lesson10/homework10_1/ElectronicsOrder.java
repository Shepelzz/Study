package lesson10.homework10_1;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
    }

    @Override
    void validateOrder() {
        String[] citiesFrom = {"Киев","Одесса","Днепр","Харьков"};
        String[] citiesTo = {"Киев","Одесса","Днепр","Харьков"};

        if(super.checkCities(citiesFrom, citiesTo) && super.getBasePrice() >= 100 && super.getCustomerOwned().getGender() == "Женский"){
                super.setDateConfirmed(new Date());
        }
    }

    @Override
    void calculatePrice() {
        int price = super.getBasePrice();
        double shipmentPrice = price * 0.1;
        if(super.getShipToCity() != "Киев" && super.getShipToCity() != "Одесса")
            shipmentPrice = price * 0.15;
        double totalPrice = price+shipmentPrice;
        if(price > 1000)
            totalPrice = totalPrice - totalPrice * 0.05;
        super.setTotalPrice(totalPrice);
    }
}
