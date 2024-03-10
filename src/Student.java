import java.util.Arrays;

public class Student extends Hogwarts {
    private String name;
    private Hogwarts facultet;

    public Student(int magic, int trasgessionOfDistance,
                   String name, Hogwarts facultet) {
        super(magic, trasgessionOfDistance);

        this.name = name;
        this.facultet = facultet;
    }
}
