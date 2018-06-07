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

        int countDistinctRooms = 0;
        for(int i = 0; i < validRooms.length; i++){
            if(isRoomDublicated(validRooms, i)){
                countDistinctRooms++;
            }
        }
        System.out.println(countDistinctRooms);

        Room[] validRoomsDistinct = new Room[countDistinctRooms];
        int validRoomsDistinctIndex = 0;
        for(int i = 0; i < validRooms.length; i++){
            if(isRoomDublicated(validRooms, i)){
                validRoomsDistinct[validRoomsDistinctIndex] = validRooms[i];
            }
        }

        return validRoomsDistinct;
    }

    public Room[] check(API api1, API api2){

        return new Room[0];
    }

    private boolean isRoomDublicated(Room[] rooms, int i){
        for(int j = 0; j < i; j++)
            if(rooms[i] == rooms[j])
                return true;
        return false;
    }
}
