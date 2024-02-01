package OOP.seminar1;

import java.time.LocalDate;

public class Bird extends Animal {
    private int wingCount;

    public Bird(String name, LocalDate birthday, Illness illness, int wingCount) {
        super(name, birthday, illness);
        this.wingCount = wingCount;
    }
}
