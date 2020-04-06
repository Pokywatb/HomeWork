package fitness;

import java.time.LocalTime;

public class DaySub extends Subscription implements CanGroup, CanTrain {
    private LocalTime beginSub = LocalTime.of(8, 00);
    private LocalTime endSub = LocalTime.of(16, 00);
    private LocalTime currentTime = LocalTime.now();

    @Override
    public boolean access() {
        if (currentTime.isAfter(beginSub) && currentTime.isBefore(endSub)) {
           System.out.println("Клиент допущен");
            return true;
        } else {
            System.out.println("Неподходящее время");
            return false;
        }

    }
}
