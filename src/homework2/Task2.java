package homework2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String str1 = " Предложения  ";
        String[] strings = str1.split("\\s");
        String str2 = "x";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > str2.length()){
                str2 = strings[i];
            }

        }
        System.out.println(str2);
    }
}
