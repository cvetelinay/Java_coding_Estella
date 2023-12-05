package week_8.Question2;

import java.util.Arrays;

public class Leena {
    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */
    public static int[] moveZeros(int[] nums) {
        int[] result = new int[nums.length];
        int nonZeroIndex = 0;

        // Add non-zero elements to the new array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[nonZeroIndex++] = nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 0, 2, 0, 3, 0, 4, 0};

        System.out.println("Input Array: " + Arrays.toString(inputArray));

        int[] outputArray = moveZeros(inputArray);

        System.out.println("Output Array: " + Arrays.toString(outputArray));
    }
    }

