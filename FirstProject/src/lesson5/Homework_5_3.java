package lesson5;

public class Homework_5_3 {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,3,4};
        System.out.println(uniqueCount(array));
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
