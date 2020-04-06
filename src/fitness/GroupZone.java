package fitness;

public class GroupZone {
    private String name = "Групповые";
    private Visitor[] groupVisitors = new Visitor[20];

    public Visitor[] getGroupVisitors() {
        return groupVisitors;
    }

    public void setGroupVisitors(Visitor[] groupVisitors) {
        this.groupVisitors = groupVisitors;
    }

    public void addVisitorGroup(Visitor newVisitor) {
        for (int i = 0; i < groupVisitors.length; i++) {
            if (groupVisitors[i] == null) {
                groupVisitors[i] = newVisitor;
                break;
            } else {
                System.out.println("Все места заняты");
            }
        }
    }

    public void close() {
        for (int i = 0; i < groupVisitors.length; i++) {
            if (groupVisitors[i] != null) {
                groupVisitors[i] = null;
            }
        }
        System.out.println("Посетители покинули групповые занятия");
    }
}
