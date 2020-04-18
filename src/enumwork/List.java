package enumwork;

import java.util.Arrays;
import java.util.Scanner;

public class List {
    User[] peasant = new User[3];
    User[] lord = new User[3];
    User[] knight = new User[3];


    public void add(User user) {
        System.out.println(Arrays.toString(peasant));
        System.out.println(Arrays.toString(lord));
        System.out.println(Arrays.toString(knight));
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        System.out.println("Введите имя и первую букву должности");
        user.setFulName(one.nextLine());
        String pos = two.nextLine();
        if (pos.startsWith("P")) {
            user.setPosition(Position.PEASANT);
            for (int i = 0; i < peasant.length; i++) {
                if (peasant[i] == null) {
                    peasant[i] = user;
                    break;
                }
            }

        }
        else if (pos.startsWith("L")){
            user.setPosition(Position.LORD);
            for (int i = 0; i < lord.length; i++) {
                if (lord[i] == null) {
                    lord[i] = user;
                    break;
                }
            }

        }
        else if (pos.startsWith("K")){
            user.setPosition(Position.KNIGHT);
            for (int i = 0; i < knight.length; i++) {
                if (knight[i] == null) {
                    knight[i] = user;
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(peasant));
        System.out.println(Arrays.toString(lord));
        System.out.println(Arrays.toString(knight));

    }
}
