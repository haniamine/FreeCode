package Codewars.Java;

import Utils.Print;

import java.util.Arrays;
import java.util.stream.IntStream;

//// CODE WARS
//// https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java ////
public class DigPow {

    public static void main(String[] args) {
        Print.o(digPow(89, 1)+" " + digPowStream(89, 1));
        Print.o(digPow(92, 1)+" " +digPowStream(92, 1));
    }

    // NON STREAM
    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        int sum = 0;
        for(int j=0;j < number.length();j++){
            sum+= Math.pow(number.charAt(j)-48,p+j);
        }
        return sum%n==0 ? sum/n : -1;
    }
    //  STREAM
    public static long digPowStream(int n, int p) {

        String sn = String.valueOf(n);
        Integer sum = IntStream.range(0, sn.length()).map(i-> (int) Math.pow(sn.charAt(i)-48,p+i)).sum();
        return sum%n==0 ? sum/n : -1;
    }

}
