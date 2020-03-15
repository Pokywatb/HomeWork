package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Введите число больше 3");
        int n = one.nextInt();
        if (n <= 3) {
            System.out.println("Введено неверное число, повторите ввод");

        } else {
            int[] newArr = new int[n];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = ((int) (Math.random() * n));

            }
            System.out.println(Arrays.toString(newArr));
            int countEven = 0;
            for (int i = 0; i < newArr.length; i++) {

                if (newArr[i] % 2 == 0) {
                    countEven++;
                }

            }
            int c = 0;
            int[] newArr2 = new int[countEven];
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] % 2 == 0) {
                    newArr2[c] = newArr[i];
                    c++;
                }
            }
            System.out.println(Arrays.toString(newArr2));

        }
    }
}
