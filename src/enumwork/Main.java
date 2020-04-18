package enumwork;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Position[] positions = Position.values();
        System.out.println(Arrays.toString(positions));

        List list = new List();
        User user = new User();
        list.add(user);
    }






}

enum Position {
    PEASANT, LORD, KNIGHT
}