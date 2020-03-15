package homework1;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        int[] newArr;
        newArr = new int[12];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = ((int) (Math.random() * 20) - 10);
        }
        Arrays.sort(newArr);
        int sum = 0;

        for (int i = 0; i < newArr.length; i++) {

            sum += newArr[i];
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println((double)sum / 12 + " " + "Среднее значение");

        System.out.println(newArr[0] + " " + "Наименьшее значение");
        System.out.println(newArr[11] + " " + "Наибольшее значение");


    }
}
