package HomeWork1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = one.nextInt();
        int b = two.nextInt();
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        System.out.println(a + b);

    }
}
