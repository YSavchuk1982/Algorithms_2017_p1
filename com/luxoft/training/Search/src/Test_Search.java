import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by isavchuk on 16.03.2017.
 */
public class Test_Search {
    int[] array = new int[11];
    ArrayList<int> list = new ArrayList<int>();
    Integer result = null;

    @Before
    public void setUp() throws Exception {
        array = new int[]{19, 12, 1, 0, 7, 9, 2, 35, 3, 91, 2};
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void naiveSearch_0() throws Exception {
        assertNotNull(Search.naiveSearch_0(array, 0));
    }

    @Test
    public void naiveSearch_1() throws Exception {

    }

    @Test
    public void naiveSearch_2() throws Exception {

    }

    @Test
    public void naiveSearch_3() throws Exception {

    }

}