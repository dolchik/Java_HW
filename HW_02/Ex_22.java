// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package Java_HW.HW_02;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.logging.FileHandler;

public class Ex_22 {
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(Ex_22.class.getName());
        FileHandler fh = new FileHandler("logJavaHw21.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort array");
        int[] sortArr = {122, -6, 23, 25, -150, 10};
        printArr(sortArr);
        System.out.println("\n");
        bubbleSort(sortArr);
        printArr(sortArr);
    }

}