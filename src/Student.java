import java.util.Arrays;

public class Student extends Hogwarts {
    protected int magic;
    protected int transgrass;
    private String name;
    private Hogwarts facultet;

    public Student(int magic, int transgrass, String name, Hogwarts facultet) {
        this.magic = magic;
        this.transgrass = transgrass;
        this.name = name;
        this.facultet = facultet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "magic=" + magic +
                ", transgrass=" + transgrass +
                ", name='" + name + '\'' +
                ", facultet=" + facultet +
                '}';
    }
}
