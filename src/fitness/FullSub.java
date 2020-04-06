package fitness;

import java.time.LocalTime;

public class FullSub extends Subscription implements CanTrain, CanGroup, CanSwim {
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
