import org.junit.Before;
import org.junit.BeforeClass;

import java.util.ArrayList;

/**
 * Created by isavchuk on 16.03.2017.
 */
public class Search {
    public static void main(String[] args) {



    }



    @BeforeClass
    public void initializationTest(){
        int[] array = [19, 12, 1, 0, 7, 9, 2, 35, 3, 91, 2];
        Integer result = null;


    }



    public int naiveSearch_0 (int[] array, int key){
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

    public int naiveSearch_2 (ArrayList<int> array, int key){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public int naiveSearch_3 (ArrayList<int> array, int key){
        array.add(key);
        int i = 0;
        while (array.get(i) != key) {
            i++;
        }
        array.remove(array.size()-1);
        if ( i != array.size()) {
            return i;
        }
        return -1;
    }




}
}
