package homework1;

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        int[][] newArr = new int[5][8];
        for (int i = 0; i < newArr.length ; i++) {
            for (int j = 0; j < newArr[i].length ; j++) {
                newArr[i][j] = ((int) (Math.random() * 188) - 99);
            }

        }
        for (int i = 0; i <= 4 ; i++) {
            Arrays.sort(newArr[i]);
            System.out.println(Arrays.toString(newArr[i]));
        }

        int max = -99;
        for (int i = 0; i <= 4 ; i++) {
            if (newArr[i][7] > max)
            max = newArr[i][7];

        }
        System.out.println(max);

    }
}
