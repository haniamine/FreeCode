package Codewars.Java;

import Utils.Print;

import java.util.Arrays;
import java.util.stream.Collectors;


//// CODE WARS
//// https://www.codewars.com/kata/52b7ed099cdc285c300001cd ////


public class SumInterval {

    public static void main(String[] args) {
       Print.o(solution(new int[][]{{1, 2}, {6, 10}, {11, 15}}));
       System.out.println("---------");

       Print.o(explainedSolution(new int[][]{{1, 7}, {6, 10}, {11, 15}}));
       System.out.println("---------");

       Print.o(explainedSolution(new int[][]{{1, 5}, {6, 10}, {11, 15}}));
       System.out.println("---------");

        Print.o(explainedSolution(new int[][]{{-1, 4}, {-5, -3}}));
        System.out.println("---------");

        Print.o(explainedSolution(null));
    }

    public static int solution(int[][] intervals){
        if(intervals==null)return 0;
        int n = intervals.length;
        if(n>0) intervals=Arrays.stream(intervals).sorted((a, b)-> a[0]-b[0]).toArray(int[][]::new);
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int j = i+1;
            while(j!=n && intervals[i]!=null){
                if(intervals[j]!=null && (intervals[i][1]>intervals[j][0] || intervals[i][0]>intervals[j][1]) ) {
                    intervals[i][0]=Math.min(intervals[i][0],intervals[j][0]);
                    intervals[i][1]=Math.max(intervals[i][1],intervals[j][1]);
                    intervals[j]=null;
                    j=i+1;
                }
                else j++;
            }
            sum +=intervals[i] == null ? 0 : intervals[i][1]-intervals[i][0];
        }
        return sum;
    }


    public static int explainedSolution(int[][] intervals){
        if(intervals==null)return 0;
        int n =  intervals.length;
        if(n>0) intervals=Arrays.stream(intervals).sorted((a, b)-> a[0]-b[0]).toArray(int[][]::new);
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            System.out.print("-- i= "+i+" int[i]=\t");
            Print.intArray(intervals[i]);
            int j = i+1;
            while(j!=n && intervals[i]!=null){
                System.out.print("-- j= "+j+" int[j]=\t");
                Print.intArray(intervals[j]);

                if(intervals[j]!=null && (intervals[i][1]>intervals[j][0] || intervals[i][0]>intervals[j][1]) ) {

                    intervals[i][0]=Math.min(intervals[i][0],intervals[j][0]);
                    intervals[i][1]=Math.max(intervals[i][1],intervals[j][1]);
                    intervals[j]=null;
                    System.out.println("to combined");
                    System.out.print("-- i= \t\t\t");
                    Print.intArray(intervals[i]);
                    //j += 1;
                    j=i+1;
                }
                else j++;
            }
            sum +=intervals[i] == null ? 0 : intervals[i][1]-intervals[i][0];
        }

        System.out.println("\n---    Result      ----");

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[0].length; j++) {
                if(intervals[i] != null) System.out.print(intervals[i][j] + "\t");
            }
            System.out.println();
        }

        return sum;
    }
}
