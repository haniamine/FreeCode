package Codewars.Java.seven;


import Utils.Print;

import java.util.stream.IntStream;


//// CODE WARS - 7 kyu
//// https://www.codewars.com/kata/51675d17e0c1bed195000001/train/java ////
public class LargestFiveDigits {

    public static void main(String[] args) {
        Print.o(solve("283910") + " " + 83910);
        Print.o(solve("1234567890") + " " + 67890);
        Print.o(solveStream("283910") + " " + 83910);
        Print.o(solveStream("1234567890") + " " + 67890);
    }


    public static int solve(String digits) {

        int m = 0;
        for (int i = 0; i <= digits.length()-5; i++) {
            m = Math.max(m,Integer.parseInt(digits.substring(i,i+5)));
        }
        return m;
    }
    public static int solveStream(String digits) {
        return IntStream.range(0,digits.length()-4).map(i->Integer.parseInt(digits.substring(i,i+5))).max().getAsInt();

    }

}
