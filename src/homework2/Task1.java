package homework2;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "МАМА";
        String str2 = "ПАПА";
        String str3 = (str1.substring(0, str1.length()/2)) +
                (str2.substring(str2.length()/2));
        System.out.println(str3);
    }
}
