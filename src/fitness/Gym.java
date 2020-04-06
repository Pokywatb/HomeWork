package fitness;


import java.time.LocalDate;
import java.time.LocalTime;

public class Gym {
    private String name = "зал";
    private TrainZone trainZone;
    private SwimZone swimZone;
    private GroupZone groupZone;


    public void close() {
        trainZone.close();
        swimZone.close();
        groupZone.close();
    }

    public void toTrain(Subscription sub, Visitor newVisitor) {
        if ((sub.getRegDate().isBefore(LocalDate.now()) || sub.getRegDate().isEqual(LocalDate.now())) && (sub.getEndDate().isAfter(LocalDate.now()) || sub.getEndDate().isEqual(LocalDate.now()))) {
            if (sub instanceof FullSub || sub instanceof DaySub || sub instanceof OneTimeSub) {
                sub.access();
                if (sub.access() == true) {
                    trainZone.addVisitorTrain(newVisitor);
                }
            } else {
                System.out.println("Нет допуска в зону.");
            }

        }
        else {
            System.out.println("Абонемент не действителен");
        }
    }

    public void toSwim (Subscription sub, Visitor newVisitor) {
        if ((sub.getRegDate().isBefore(LocalDate.now()) || sub.getRegDate().isEqual(LocalDate.now())) && (sub.getEndDate().isAfter(LocalDate.now()) || sub.getEndDate().isEqual(LocalDate.now()))) {
            if (sub instanceof FullSub || sub instanceof OneTimeSub) {
                sub.access();
                if (sub.access() == true) {
                    trainZone.addVisitorTrain(newVisitor);
                }
            } else {
                System.out.println("Нет допуска в зону.");
            }

        }
        else {
            System.out.println("Абонемент не действителен");
        }
    }

    public void toGroup (Subscription sub, Visitor newVisitor) {
        if ((sub.getRegDate().isBefore(LocalDate.now()) || sub.getRegDate().isEqual(LocalDate.now())) && (sub.getEndDate().isAfter(LocalDate.now()) || sub.getEndDate().isEqual(LocalDate.now()))) {
            if (sub instanceof FullSub || sub instanceof DaySub) {
                if (sub.access() == true) {
                    trainZone.addVisitorTrain(newVisitor);
                }
            } else {
                System.out.println("Нет допуска в зону.");
            }

        }
        else {
            System.out.println("Абонемент не действителен");
        }
    }
}

