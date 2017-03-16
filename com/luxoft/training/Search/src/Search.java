import java.util.ArrayList;

/**
 * Created by isavchuk on 16.03.2017.
 */
public class Search {
    public static void main(String[] args) {



    }


    public static int naiveSearch_0 (int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public int naiveSearch_1 (int[] array, int key){
        int[] testArray = new int[array.length+1];
        testArray[array.length+1] = key;
        int i = 0;
        while (testArray[i] != key){
            i++;
        }
        if (i != testArray.length){
            return i;
        }
        return -1;
    }

    public int naiveSearch_2 (ArrayList<int> list, int key){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public int naiveSearch_3 (ArrayList<int> list, int key){
        list.add(key);
        int i = 0;
        while (list.get(i) != key) {
            i++;
        }
        list.remove(list.size()-1);
        if ( i != list.size()) {
            return i;
        }
        return -1;
    }

}


