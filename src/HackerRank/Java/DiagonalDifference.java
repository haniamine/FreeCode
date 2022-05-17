package HackerRank.Java;


import Utils.Print;

import java.util.*;
import java.util.stream.IntStream;

//// Hacker Rank
//// Diagonal Difference
//// https://www.hackerrank.com/challenges/diagonal-difference/problem ////
public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> L1 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(9,8,9)
                );
        Print.o(diagonalDifference(L1)+" "+diagonalDifferenceStream(L1) );
        List<List<Integer>> L2 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        Print.o(diagonalDifference(L2)+" "+diagonalDifferenceStream(L2));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int s = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> l = arr.get(i);
            s+= l.get(n-i-1) - l.get(i);
        }

        return Math.abs(s);

    }
    // with stream
    public static int diagonalDifferenceStream(List<List<Integer>> arr) {
        return Math.abs(IntStream.range(0, arr.size()).reduce(0,(s, i)->s+arr.get(i).get(arr.size()-i-1) - arr.get(i).get(i)));

    }
}
