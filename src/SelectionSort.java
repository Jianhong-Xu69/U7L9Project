import java.util.ArrayList;

public class SelectionSort {

    public static void sortArray (int[] original){
        for (int i = 0; i < original.length; i++) {
            int minimum = original[i];
            int temp = i;
            for (int j = i; j < original.length; j++) {
                if (original[j] < minimum){
                    minimum = original[j];
                    temp = j;
                }
            }
            original[temp] = original[i];
            original[i] = minimum;
        }
    }

    public static void sortArrayList (ArrayList<Integer> original){
        for (int i = 0; i < original.size(); i++) {
            int minimum = original.get(i);
            int temp = i;
            for (int j = i; j < original.size(); j++) {
                if (original.get(j) < minimum){
                    minimum = original.get(j);
                    temp = j;
                }
            }
            original.set(temp, original.get(i));
            original.set(i, minimum);
        }
    }
}
