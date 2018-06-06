package lesson10.homework10_1;

import java.util.Date;

public class FurnitureOrder extends Order{
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        String[] citiesFrom = {"Киев","Львов"};

        if(super.checkCities(citiesFrom, null) && super.getBasePrice() >= 500 && super.getCustomerOwned().getName() != "Test"){
            super.setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice() {
        int price = super.getBasePrice();
        double shipmentPrice = price * 0.2;
        if(price < 5000)
            shipmentPrice = price * 0.5;
        double totalPrice = price+shipmentPrice;
        super.setTotalPrice(totalPrice);
    }
}
