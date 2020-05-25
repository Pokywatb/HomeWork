package lambdaTask;

import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleLambda {
    public static void main(String[] args) {
        Operation eq = (a, b) -> a.equals(b);

        System.out.println(Equaliser.equalise("werf", "ERTG", eq));

    }
}

interface Operation{
    boolean execute(String a, String b);
}

class Equaliser {
    public static boolean equalise (String a, String b, Operation operation) {return operation.execute(a, b);}







}
//TODO: Задача 2
// дан Predicate condition и две Function ifTrue, ifFalse (принимает на вход условие и две функции).
// Написать метод getFunction, который вернет новую Function, возвращающую результат работы функции ifTrue,
// если condition == true, и наоборот.