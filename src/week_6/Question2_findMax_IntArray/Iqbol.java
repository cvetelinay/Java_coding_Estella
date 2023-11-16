package week_6.Question2_findMax_IntArray;

public class Iqbol {
    public static void main(String[] args) {

        int myArray[] = {8, 7, 4, 3, 2, 9, 1, 6, 5};

        int max = myArray[0];

        for(int i =0; i < 9; i ++)
            if (myArray[i] > max)
                max = myArray[i];

        System.out.println(max);

    }
}


