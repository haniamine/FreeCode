package Codewars.Java.unc;

import Utils.Print;

import java.util.HashMap;

public class Panagram {

    public static void main(String[] args) {
        Print.o(solution("text"));
        Print.o(solution("abcdeg"));
        Print.o(solution("The quick brown fox jumps over the lazy dog"));
        Print.o(solution("abcdefghijklmnopqrstuvwxyz"));
        Print.o(solution("abcdefghijklmnopqrstuvwxyzxx"));
    }

    public static boolean solution(String sentence){
        if(sentence.length()<26) return false;
        HashMap<Character, Integer> c = new HashMap<>();
        for(int i = 0; i < sentence.length(); i++){
            if(Character.isLetter(sentence.charAt(i))) c.put(Character.toLowerCase(sentence.charAt(i)),1);
        }
        Print.o(c.keySet().size());
        return c.keySet().size()==26;
    }

    // BEST SOLUTION
    public boolean check(String sentence){
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
