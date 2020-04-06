package fitness;

import java.time.LocalDate;
import java.time.LocalTime;

abstract class Subscription {
    private String name = "абонемент";
    private LocalDate regDate;
    private LocalDate endDate;
    private Visitor visitor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    abstract boolean access();
}
