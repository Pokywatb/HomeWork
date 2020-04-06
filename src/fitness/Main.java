package fitness;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        TrainZone trainZone = new TrainZone();
        Gym gym = new Gym("зальчик",trainZone);
        SwimZone swimZone = new SwimZone();
        GroupZone groupZone = new GroupZone();
        DaySub daySub = new DaySub();
        daySub.setVisitor(visitor);
        daySub.setRegDate(LocalDate.of(2020, 03, 07));
        daySub.setEndDate(LocalDate.of(2020,04,07));

     // trainZone.addVisitorTrain(visitor);
        //System.out.println(Arrays.toString(trainZone.trainVisitors));
       // trainZone.addVisitorTrain(visitor);
        //System.out.println(Arrays.toString(trainZone.trainVisitors));
        //System.out.println(daySub.access());
       // System.out.println(gym.toString());
       gym.toGroup(daySub, visitor);



    }
}
