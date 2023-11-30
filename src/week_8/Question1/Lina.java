package week_8.Question1;

public class Lina {

     /*
    Write a method that can find the minimum number from an int Array
     */

    public static int minNumFromArray(int[] array){
        int minNum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum){
                minNum = array[i];
            }
        }

        return minNum;
    }


    public static void main(String[] args) {
      int[] array = {2, 5, 9, 32, 1};

        System.out.println("minNumFromArray(array) = " + minNumFromArray(array));

    }
}
