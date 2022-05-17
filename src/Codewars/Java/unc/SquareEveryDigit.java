package Codewars.Java.unc;

import Utils.Print;

import java.util.Arrays;
import java.util.stream.IntStream;

//// CODE WARS
//// https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java ////
public class SquareEveryDigit {

    public static void main(String[] args) {
        Print.o(solution(89) );
        Print.o(solution(9119));
    }
    public static long solution(int n) {
        String r = "";
        while(n!=0){
            r=((long)Math.pow(n%10,2))+r;
            n=n/10;
        }
        return r.length() == 0 ? 0 : Long.parseLong(r);
    }

}