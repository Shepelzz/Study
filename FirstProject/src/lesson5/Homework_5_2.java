package lesson5;

import java.util.Arrays;

public class Homework_5_2 {
    public static void main(String[] args) {
        String[] names = {"Jack","Ann", "Denis","Andrey","Nikolay","Irina","John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(balances));

        System.out.println(withdraw(names, balances, "Denis", 55000));

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(balances));
    }

    static int withdraw(String[] clients, int[] balances, String client, int amount){
        if(balances[findClientIndexByName(clients, client)] < amount)
            return -1;
        else {
            balances[findClientIndexByName(clients, client)] -= amount;
            return balances[findClientIndexByName(clients, client)];
        }
    }

    static int findClientIndexByName(String[] clients, String client){
        int clientIndex = 0;
        for (String cl : clients){
            if(cl == client)
                break;
            clientIndex++;
        }
        return clientIndex;
    }
}
