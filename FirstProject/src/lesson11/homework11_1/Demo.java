package lesson11.homework11_1;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room r1 = new Room(1, 123, 2, new Date(), "Hotel1", "Kyiv");
        Room r2 = new Room(2, 55, 1, new Date(), "Hotel1", "Kyiv");
        Room r3 = new Room(3, 600, 4, new Date(), "Hotel1", "Kyiv");
        Room r4 = new Room(4, 121, 1, new Date(), "Hotel2", "Kyiv");
        Room r5 = new Room(5, 550, 4, new Date(), "Hotel2", "Kyiv");
        Room r6 = new Room(6, 1000, 5, new Date(), "Hotel3", "Kyiv");

        Room[] rooms = new Room[]{r1, r2, r3, r4, r5, r6};

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
        GoogleAPI googleAPI = new GoogleAPI(rooms);

        API[] apis = new API[]{bookingComAPI, tripAdvisorAPI, googleAPI};

        Controller controller = new Controller(apis);
        Room[] requestrooms = controller.requestRooms(123, 2, "Kyiv", "Hotel1");

        System.out.println("Кол-во комнат: "+requestrooms.length);
        for(Room room : requestrooms){
            System.out.print("["+room.getId()+"]");
        }
    }

    static int uniqueCount(int[] array){
        int countRepeat = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){
                    countRepeat++;
                    break;
                }
            }
        }
        return array.length - countRepeat;
    }
}
