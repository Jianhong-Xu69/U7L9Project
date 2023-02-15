import java.util.ArrayList;
import java.util.Arrays;

public class FrontDoor {
    public static void main(String[] args) {
        int[] test = {0, 124,543,76,2,1,50,643,735,1,23,6};
        printAll(test);
        SelectionSort.sortArray(test);
        printAll(test);
        System.out.println("--------------------------------------------");
        ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(22,3,4,5,36,236,23,6,236,64,57,4,2,6, 8,56));
        printAll(test2);
        SelectionSort.sortArrayList(test2);
        printAll(test2);
    }

    public static void printAll(int[] arr){
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
    public static void printAll(ArrayList<Integer> arr){
        for (Integer integer : arr) {
            System.out.print(integer + ", ");
        }
        System.out.println();
    }
}