package Codewars.Java.unc;

import Utils.Print;

import java.util.Arrays;

/// FAILED / UNCOMPLETED
public class StripComments {

    public static void main(String[] args) {
        Print.o(solution("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
        Print.o('=');
        Print.o(solution("a #b\nc\nd $e f g", new String[] { "#", "$" }));
        Print.o('=');
        Print.o(solution("a #b \nc \nd $e f g ", new String[] { "#", "$" }));
    }

    public static String solution(String text, String[] commentSymbols){
        String r =""+text;
        int n=r.length();
        int start=-1;
        for(int i=0;i<n;i++){
            String c =""+r.charAt(i);
            if(Arrays.stream(commentSymbols).filter(s->s.equals(c)).count()>0) start = i;
            if("\n".equals(c)) {
                if(start>0){
                    while (r.charAt(start - 1) == ' ') start--;
                    r = r.substring(0, start) + r.substring(i);
                    n = r.length();
                    i = start;
                    start = -1;
                }else{
                    int temp_pos=i;
                    while (r.charAt(temp_pos - 1) == ' ') temp_pos--;
                    r = r.substring(0, temp_pos) + r.substring(i);
                    n = r.length();
                }
            }
        }
        if( start!=-1) {
            while(r.charAt(start-1)==' ') start--;
            r = r.substring(0, start);
            n= start;

        }
        while(r.charAt(n-1)==' ') n--;
        return r.substring(0,n);
    }


}
