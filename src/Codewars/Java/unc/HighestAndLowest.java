package Codewars.Java.unc;

import Utils.Print;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//// CODE WARS
//// https://www.codewars.com/kata/550f22f4d758534c1100025a ////

public class HighestAndLowest {
    public static void main(String[] args) {
        Print.o(solution("1 2 3 4 5")+" - 5 1");
        Print.o(solution("1 2 -3 4 5")+" - 5 -3");
        Print.o(solution("1 9 3 4 -5")+" - 9 -5");
    }

    public static String solution(String str){
        Arrays.asList(str.split(" ")).stream().mapToInt(Integer::parseInt).summaryStatistics();
        int h = Arrays.asList(str.split(" ")).stream().map(Integer::valueOf).reduce(Integer::max).get();
        int l = Arrays.asList(str.split(" ")).stream().map(Integer::valueOf).reduce(Integer::min).get();
        return h + " " + l;
    }


}
