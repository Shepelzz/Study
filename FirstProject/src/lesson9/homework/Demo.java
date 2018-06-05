package lesson9.homework;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User u1 = new User(1, "User1", "121212");
        User u2 = new User(4, "User2", "12143212");
        User u3 = new User(4, "User3", "1rfd21212");
        User u4 = new User(4, "User4", "121235h212");

        User[] userList = {null, u2, u3, null};

        UserRepository rep = new UserRepository(userList);

        System.out.println(Arrays.toString(rep.getUserNames()));
        System.out.println(Arrays.toString(rep.getUserIds()));
        System.out.println(rep.getUserNameById(67));
    }
}
