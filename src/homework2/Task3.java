package homework2;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "Ехал Грека через реку";
        String str2 = "рек";
        int b = 0;// подсчет вхождений
        int c = 0;
        for (int i = 0; i > -1 ; i++) {
            c = str1.indexOf(str2, i);
            if (c > 0){//т.к. если символ не встречается - возвращает -1
                b++;
                i = c; // приравниваем переменные, чтобы следующая проверка началась с места окончания предыдущей.

            }
        }
        System.out.println(b);




    }

}
