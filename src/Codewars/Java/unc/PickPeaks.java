package Codewars.Java.unc;

import Utils.Print;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//// CODE WARS
//// 5 kyu- PickPeaks
//// https://www.codewars.com/kata/5279f6fe5ab7f447890006a7/train/java ////
public class PickPeaks {

    public static void main(String[] args) {

        //Print.o(solution(new int[]{0, 1, 2, 5, 1, 0}));
        //Print.o(solution(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3}));
        //Print.o(solution(new int[]{1, 2, 2, 2, 1}));
        //Print.o(solution(new int[]{2,1,3,1,2,2,2,2}));
        Print.o(solution(new int[]{3, 1, 9, 4, 8, -5, -2, 13, -1, 5, 5, 7, 9, 9, 16, -3, 11, 7, 6, 17, -3}));
        // 9, 8, 13, 11, 17
        // 9, 8, 13, 16, 11, 17
    }

    public static Map<String, List<Integer>> solution(int[] arr){

        List<Integer> peaks= new ArrayList<>();
        List<Integer> pos= new ArrayList<>();

        for(int i =1; i< arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<=arr[i]){
                boolean toEdge = true;
                for(int j=i;j< arr.length-1 && toEdge!=false;j++) {
                    toEdge = arr[j + 1] == arr[j];
                    if(arr[j + 1] > arr[j]){
                        toEdge=true;
                        i=j;
                        break;
                    }
                }
                if(!toEdge){
                    peaks.add(arr[i]);
                    pos.add(i);
                }
            }
        }

        Map<String, List<Integer>> posPeak = new HashMap<>();
        posPeak.put("pos",pos);
        posPeak.put("peaks",peaks);
        return posPeak;
    }


    // best
    public static Map<String,List<Integer>> getPeaks(int[] arr) {

        Map<String, List<Integer>> result = new HashMap<>();
        result.put("pos", new ArrayList<>());
        result.put("peaks", new ArrayList<>());

        int peakPos = 0; // the position of the peak
        boolean increasing = false; // test to see if the numbers keep increasing

        for (int x = 1 ; x < arr.length ; x++) {
            if (arr[x-1] < arr[x]) { // if the numbers are still increasing
                increasing = true;
                peakPos = x;
            }
            if (increasing && arr[x-1] > arr[x]) { // if it has been increasing but is not anymore
                increasing = false;
                result.get("pos").add(peakPos);
                result.get("peaks").add(arr[peakPos]);
            }
        }
        return result;
    }
}
