import java.util.*;
import java.util.Random;

public class ZeroM{

    // Find all the 0's
    public static ArrayList<ArrayList<Integer> > ZeroM(ArrayList<ArrayList<Integer> > orig){
        // Create a deep copy
        ArrayList<ArrayList<Integer> > copy = copyArr(orig);
        for(int i = 0; i < orig.size(); i++){
            for(int j = 0; j < orig.get(0).size(); j++){
                if(orig.get(i).get(j) == 0){
                    // Zero out the ith column and jth row
                    copy = zeroOut(copy, i, j); 
                }
            }
        }
        return copy;
    }

    // Create a deep copy of the array list
    public static ArrayList<ArrayList<Integer> > copyArr(ArrayList<ArrayList<Integer> > arr){
        ArrayList<ArrayList<Integer> > copy = new ArrayList<ArrayList<Integer> >();
        for(int i = 0; i < arr.size(); i++){
            ArrayList<Integer> tempArr = new ArrayList<Integer>();
            copy.add(tempArr);
            for(int j = 0; j < arr.get(0).size(); j++){
                copy.get(i).add(arr.get(i).get(j));
            }
        }
        return copy;
    }

    // Where we zero the ith column and jth row
    public static ArrayList<ArrayList<Integer> > zeroOut(ArrayList<ArrayList<Integer> > arr, int i, int j){
        for(int a = 0; a < arr.size(); a++){
            for(int b = 0; b < arr.get(0).size(); b++){
                if(a == i || b == j){
                    arr.get(a).set(b, 0);
                }
            }
        }
        return arr;
    }

    // Generate a new random array
    public static ArrayList<ArrayList<Integer> > generate(int size){
        ArrayList<ArrayList<Integer> > newArr = new ArrayList<ArrayList<Integer> >();

        for(int i = 0; i < size; i++){
            ArrayList<Integer> tempArr = new ArrayList<Integer>();
            newArr.add(tempArr);
            for(int j = 0; j < size; j++){
                int r = (int)(Math.random() * size);
                newArr.get(i).add(r);
            }
        }

        return newArr;
    }

    // Print the array
    public static void p(ArrayList<ArrayList<Integer> > arr){
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(0).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer> > a = generate(10);
        p(a);
        a = ZeroM(a);
        p(a);
    }
}
