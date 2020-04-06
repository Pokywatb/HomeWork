package fitness;

import java.time.LocalTime;

public class OneTimeSub extends Subscription implements CanSwim, CanTrain {
    private LocalTime beginSub = LocalTime.of(8, 00);
    private LocalTime endSub = LocalTime.of(22, 00);
    LocalTime currentTime = LocalTime.now();

    @Override
    public boolean access() {
        if (currentTime.isAfter(beginSub) && currentTime.isBefore(endSub)) {
            System.out.println("Клиент допущен");
            return true;
        } else {
            System.out.println("Зал закрыт");
            return false;
        }
    }
}
