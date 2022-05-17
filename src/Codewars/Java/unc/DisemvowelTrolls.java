package Codewars.Java.unc;

import Utils.Print;

import java.util.stream.Collectors;

public class DisemvowelTrolls {

    public static void main(String[] args) {
        Print.o(solution("text"));
        Print.o(solution("abcdeg"));
        Print.o(solution("The quick brown fox jumps over the lazy dog"));
        Print.o(solution("abcdefghijklmnopqrstuvwxyz"));
        Print.o(solution("abcdefghijklmnopqrstuvwxyzxx"));
    }

    public static String solution(String str){
        return str.chars().mapToObj(i -> (char) i).filter(value -> "AEIOUaeiou".indexOf(value) == -1).map(String::valueOf).collect(Collectors.joining())    ;
    }

}
