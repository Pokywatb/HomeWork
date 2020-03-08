package HomeWork1;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] newArr;
        newArr = new int[12];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = ((int) (Math.random() * 20) - 10);

        }
        System.out.println(Arrays.toString(newArr));

        for (int i = 0; i < newArr.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[i] + newArr[j] == 7) {

                    System.out.println(newArr[i] + " " + newArr[j]);
                    break;
                }
                break; // если убрать этот break должен выдавать все пары чисел дающие 7
            }

        }


    }
}
