package week_8.Question1;

public class Leena {

    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).

     */
    public static int[] sumUpToZero(int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length - 1; i++) {
            res[i++] = i;
            res[i] = -i;
        }
        return res;
    }

    public static int[] sumUpToZero2(int N) {
        int[] result = new int[N];
        int sum = 0;
        for(int i=0; i < N-1; i++) { // 0, 1, 2
            result[i] =i;  //  [0, 1, 2, -3]
            sum += i; // 3
        }
        result[N-1] = -sum; //3
        return result;
    }
}
