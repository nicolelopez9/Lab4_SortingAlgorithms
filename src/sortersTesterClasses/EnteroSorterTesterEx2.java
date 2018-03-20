package sortersTesterClasses;

import java.util.Arrays;

import sorterClasses.SelectionSortSorter;

public class EnteroSorterTesterEx2 {

    public static void main(String[] args){
    
    Integer[] testerArray = {5,9,20,22,20,5,4,13,17,8,22,1,3,7,11,9,10};
    System.out.println(Arrays.toString(testerArray));
    SelectionSortSorter<Integer> sorter = new SelectionSortSorter<>();
    
    
    IntegerComparator1 cmp  = new IntegerComparator1();
    sorter.sort(testerArray, cmp);
    
    System.out.println(Arrays.toString(testerArray));
    
    IntegerComparator2 cmp2 = new IntegerComparator2();
    
    sorter.sort(testerArray, cmp2);
    System.out.println(Arrays.toString(testerArray));
    }
}