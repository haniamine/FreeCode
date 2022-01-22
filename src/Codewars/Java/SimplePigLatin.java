package Codewars.Java;

import Utils.Print;

import java.util.Arrays;
import java.util.stream.Collectors;


//// CODE WARS
//// 5 kyu- Simple Pig Latin
//// https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java ////
public class SimplePigLatin {

    public static void main(String[] args) {
        Print.o(solution("Pig latin is cool"));
        Print.o(solution("Hello world ! a"));
        Print.o(solution("The quick brown fox jumps over the lazy dog"));
        Print.o(solution("Temporary o"));
    }

    public static String solution(String str){

        return Arrays.stream(str.split(" "))
                .map(w -> w.substring(1)+w.charAt(0)+(w.charAt(0)>='A' && w.charAt(0)<='z'?"ay":""))
                .collect(Collectors.joining(" "));
    }

    // BEST SOLUTIONS
    public String check(String str){
        return Arrays.stream(str.split(" "))
                .map(word->word.length() > 1 || Character.isLetter(word.charAt(0)) ? word.substring(1) + word.charAt(0) + "ay" : word)
              //  .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
