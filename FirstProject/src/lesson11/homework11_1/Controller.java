package lesson11.homework11_1;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){
        int countRooms = 0;
        for(API api : apis) {
            countRooms += api.findRooms(price, persons, city, hotel).length;
        }
        Room[] validRooms = new Room[countRooms];
        int validRoomsIndex = 0;
        for(API api : apis){
            for(Room room : api.findRooms(price, persons, city, hotel)) {
                validRooms[validRoomsIndex] = room;
                validRoomsIndex++;
            }
        }
        return validRooms;
    }

    public Room[] check(API api1, API api2){
        int countRooms = 0;
        for(Room roomAPI1 : api1.getAll()){
            for(Room roomAPI2 : api2.getAll()){
                if(     roomAPI1.getPrice() == roomAPI2.getPrice()
                        && roomAPI1.getHotelName() == roomAPI2.getHotelName()
                        && roomAPI1.getCityName() == roomAPI2.getCityName()
                        && roomAPI1.getPersons() == roomAPI2.getPersons()){
                    countRooms++;
                }
            }
        }
        Room[] similarRooms = new Room[countRooms];
        int similarRoomsIndex = 0;
        for(Room roomAPI1 : api1.getAll()){
            for(Room roomAPI2 : api2.getAll()){
                if(     roomAPI1.getPrice() == roomAPI2.getPrice()
                        && roomAPI1.getHotelName() == roomAPI2.getHotelName()
                        && roomAPI1.getCityName() == roomAPI2.getCityName()
                        && roomAPI1.getPersons() == roomAPI2.getPersons()){
                    similarRooms[similarRoomsIndex] = roomAPI1;
                    similarRoomsIndex++;
                }
            }
        }

        return similarRooms;
    }
}
