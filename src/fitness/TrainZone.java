package fitness;

public class TrainZone {
    private String name = "Тренажеры";
    private Visitor[] trainVisitors = new Visitor[20];

    public Visitor[] getTrainVisitors() {
        return trainVisitors;
    }

    public void setTrainVisitors(Visitor[] trainVisitors) {
        this.trainVisitors = trainVisitors;
    }

    public void addVisitorTrain(Visitor newVisitor) {
        for (int i = 0; i < trainVisitors.length; i++) {
            if (trainVisitors[i] == null) {
                trainVisitors[i] = newVisitor;
                break;
            } else {
                System.out.println("Все места заняты");
            }
        }
    }

    public void close() {
        for (int i = 0; i < trainVisitors.length; i++) {
            if (trainVisitors[i] != null) {
                trainVisitors[i] = null;
            }
        }
        System.out.println("Посетители покинули тренажерный зал");
    }
}
