package fitness;

import java.time.LocalDate;

public class Visitor {
    private String name = "Василий";
    private String surname = "Алибабаевич";
    private LocalDate birthDate = LocalDate.of(1988, 04, 04) ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
