package homework2;

public class Task4 {
    public static void main(String[] args) {
        //Рабочий вариант
        String string = "abba";

        StringBuilder string1 = new StringBuilder();

        string1.append(string);
        string1 = string1.reverse();
        String string3 = string1.toString();

        System.out.println(string);
        System.out.println(string1);
        System.out.println(string.equals(string3));

//          не рабочий вариант. Не могу понять почему.
        String pol = "abba";


        StringBuilder pol1 = new StringBuilder();
        StringBuilder pol2 = new StringBuilder();

        pol1.append(pol);
        pol2.append(pol);
        pol1 = pol1.reverse(); //если pol1.reverse(); заменить на pol2.reverse(); все работает

        System.out.println(pol1);
        System.out.println(pol2);
        System.out.println(pol1.equals(pol2));
    }
}
