package Codewars.Java;

import Utils.Print;

import java.util.Arrays;

public class SumSubArray {

    public static void main(String[] args) {
        Print.o(solution(new int[]{1,0,-3,1}));
    }

    public static int solution(int[] arr){
        int n = arr.length-1;
        int m=0;
        for(int i=0;i<n;i++){
            for(int j=n;j>=i;j--){
               int tm=Arrays.stream(Arrays.copyOfRange(arr, i, j+1)).parallel().reduce(0, (a,b)-> a+b);
               m = tm > m ? tm:m;
            }
        }
        return m;
    }
}
