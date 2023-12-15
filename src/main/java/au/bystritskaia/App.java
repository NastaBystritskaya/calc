package au.bystritskaia;

import au.bystritskaia.arrays.ArrayComparator;
import au.bystritskaia.extended.MyExtendedClass;
import au.bystritskaia.list.MyList;
import au.bystritskaia.pair.MyPairMap;

import java.io.DataInput;
import java.io.DataInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyPairMap<Integer, String> map = new MyPairMap<>(1, "a");
        System.out.println(map);

        Integer[] a = new Integer[] {1, 2, 3};
        Integer[] c = new Integer[] {1, 2, 5};
        String[] b = new String[] {"1", "2", "3"};
        ArrayComparator<Integer, String> arrayComparator = new ArrayComparator<>(a, b);
        System.out.println(arrayComparator.compare());

    }
}
