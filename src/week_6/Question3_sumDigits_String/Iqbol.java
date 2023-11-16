package week_6.Question3_sumDigits_String;

public class Iqbol {


        public static void main(String[] args) {

            String str = "A1B2C3D4";

            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                //System.out.println(ch); // this will print out each of the characters
                if (Character.isDigit(ch)) {
                    sum += Integer.parseInt("" + ch);
                }
            }
            System.out.println(sum);
        }
    }

