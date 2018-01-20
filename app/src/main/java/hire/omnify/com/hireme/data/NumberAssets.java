package hire.omnify.com.hireme.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilkumar on 20/01/18.
 */

public class NumberAssets {


    private static final List<Integer> randomNumArray = new ArrayList<Integer>() {{
        add(32);
        add(42);
        add(21);
        add(19);
        add(68);
        add(54);
        add(39);
        add(57);
        add(98);
        add(91);
        add(31);
        add(16);
        add(88);
        add(76);
        add(66);
        add(17);
        add(62);
        add(38);
        add(20);
        add(12);
    }};


    private static final List<Integer> sortedNumArray = new ArrayList<Integer>() {{
        add(62);
        add(40);
        add(11);
        add(15);
        add(78);
        add(50);
        add(79);
        add(51);
        add(73);
        add(99);
        add(51);
        add(66);
        add(38);
        add(77);
        add(60);
        add(57);
        add(22);
        add(18);
        add(70);
        add(43);
    }};

    public static List<Integer> getRandomNumArray() {
        return randomNumArray;
    }

    public static List<Integer> getSortedNumArray() {
        return sortedNumArray;
    }

}
