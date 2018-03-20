package sortersTesterClasses;

import dataGenerator.DataGenerator;
import sorterClasses.BubbleSortSorter;

public class EnteroSorterTester {        
        public static void main(String[] args) {

        DataGenerator generator = new DataGenerator(10);
        Integer[] data = generator.generateData(); 
        Entero[] testArray = new Entero[10]; 


        for (int i = 0; i < 10; i++) {
            testArray[i] = new Entero(data[i]);
            System.out.println(data[i]);
        }


        BubbleSortSorter<Entero> sorter = new BubbleSortSorter<>();
                sorter.sort(testArray, null);

            
}
}