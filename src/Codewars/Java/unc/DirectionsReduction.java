package Codewars.Java.unc;

import Utils.Print;

import java.util.*;

//// CODE WARS
//// https://www.codewars.com/kata/550f22f4d758534c1100025a ////

public class DirectionsReduction {

    public static void main(String[] args) {
        Print.stringArray(solution(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
        Print.stringArray(bestSolution(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
        Print.stringArray(solution(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        Print.stringArray(bestSolution(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }

    //W<->E or S<->N
    public static String[] solution(String[] arr){

        HashMap op = new HashMap<>();
        op.put("NORTH", "SOUTH");
        op.put("SOUTH", "NORTH");
        op.put("WEST", "EAST");
        op.put("EAST", "WEST");

        arr = Arrays.stream(arr).map(s->s.toUpperCase()).toArray(String[]::new);
        int n = arr.length;
        int i =0;
        while (i!=n-1){
            int next = i+1;
            while(next<n && arr[next]==null) next++;
            if(arr[i] != null && next<n && arr[i].equals(op.get(arr[next]))) {
                arr[i]=null;
                arr[next]=null;
                i=0;
            }
            else i++;
        }
        return Arrays.stream(arr).filter(s->s!=null).toArray(String[]::new);
    }

    // BEST
    public static String[] bestSolution(String[] arr) {

        HashMap<String,String> op = new HashMap<>();
        op.put("NORTH", "SOUTH");
        op.put("SOUTH", "NORTH");
        op.put("WEST", "EAST");
        op.put("EAST", "WEST");

        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            if(stack.size() == 0) {
                stack.push(direction);
                continue;
            }
            final String lastElement = stack.lastElement();

            if (direction.equals(op.get(lastElement))) {
                stack.pop(); }
            else { stack.push(direction); }

        }
        return stack.stream().toArray(String[]::new);
    }

}
