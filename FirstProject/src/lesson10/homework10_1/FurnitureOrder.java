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

        if(checkCityFrom(citiesFrom) && getBasePrice() >= 500 && getCustomerOwned().getName() != "Test"){
            setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice() {
        int price = getBasePrice();
        double shipmentPrice = price * 0.2;
        if(price < 5000)
            shipmentPrice = price * 0.5;
        double totalPrice = price+shipmentPrice;
        setTotalPrice(totalPrice);
    }
}
