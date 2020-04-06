package fitness;

public class SwimZone {
    private String name = "Бассейн";
    private Visitor[] swimVisitors = new Visitor[20];

    public Visitor[] getSwimVisitors() {
        return swimVisitors;
    }

    public void setSwimVisitors(Visitor[] swimVisitors) {
        this.swimVisitors = swimVisitors;
    }

    public void addVisitorSwim(Visitor newVisitor) {
        for (int i = 0; i < swimVisitors.length; i++) {
            if (swimVisitors[i] == null) {
                swimVisitors[i] = newVisitor;
                break;
            } else {
                System.out.println("Все места заняты");
            }
        }
    }

    public void close() {
        for (int i = 0; i < swimVisitors.length; i++) {
            if (swimVisitors[i] != null) {
                swimVisitors[i] = null;
            }
        }
        System.out.println("Посетители покинули бассейн");
    }
}
