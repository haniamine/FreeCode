package Codewars.Java.unc;

import Utils.Print;

//// CODE WARS - Human Readable Time - 5 kyu
//// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java ////
public class HumanTime {

    public static void main(String[] args) {
        Print.o(solution(0) );
        Print.o(solution(5) );
        Print.o(solution(60));
        Print.o(solution(86399));
    }
    public static String solution(int n) {
        return String.format("%02d %02d %02d",n/3600,(n%3600)/60,n%60);
    }

}