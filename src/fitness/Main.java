package fitness;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Visitor visitor = new Visitor();
        TrainZone trainZone = new TrainZone();
        SwimZone swimZone = new SwimZone();
        GroupZone groupZone = new GroupZone();
        DaySub daySub = new DaySub();
        daySub.setVisitor(visitor);
        daySub.setRegDate(LocalDate.of(2020, 03, 07));
        daySub.setEndDate(LocalDate.of(2020,04,07));

      //  trainZone.addVisitorTrain(visitor);

       // gym.toGroup(daySub, visitor);

        //daySub.access();

    }
}
