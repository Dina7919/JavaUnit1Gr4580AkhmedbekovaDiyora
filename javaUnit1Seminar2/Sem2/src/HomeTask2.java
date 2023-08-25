import java.io.IOException;
import java.lang.System.Logger;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;
import java.util.logging.*;

public class HomeTask2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(HomeTask2.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int [] array = {2, 5, 1, -7, 3, 64, 0};
        printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        printArrayInt(newArr);
    }
    
    public static int[] listSort(int [] arr){ //[3, 5, 8, 2, 6, 1]
        for(int k = 0; k < arr.length-1; k++) { //k = 0
            for (int i = 0; i < arr.length - k-1; i++){ // i = 3 (i < 6)
                if (arr[i] > arr[i+1]) { //8 > 2
                    int temp = arr[i]; //temp = 8
                    arr[i] = arr[i+1]; // 8 = 2 [3, 5, 2, 8, 6, 1]
                    arr[i+1] = temp; // 2 = 8
                }
            }
        }
        return arr;
    }

    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
}
