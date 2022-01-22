package Codewars.Java;

import Utils.Print;

import java.util.*;
import java.util.regex.*;

public class SmileyCount {

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(";("); a.add(";}"); a.add(":-D"); a.add(":"); a.add(":---D");
        Print.o(solution(a));
        Print.o(solutionStream(a));
    }

    public static int solution(List<String> arr){
        int c =0;

        for(String s:arr){
            if(Pattern.matches("[:;][-~]?[)D]", s)) c++;
        }

        return c;
    }

    public static int solutionStream(List<String> arr){
        return (int) arr.stream().filter(s -> Pattern.matches("[:;][-~]?[)D]", s)).count();
    }

    // BEST SOLUTION
    public static int solutionMatch(List<String> arr){
        return (int) arr.stream().filter(s -> s.matches("[:;][-~]?[)D]")).count();
    }

}
