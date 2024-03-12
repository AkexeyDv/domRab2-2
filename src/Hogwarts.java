import java.util.Objects;

public abstract class Hogwarts {
    private final int magic;
    private final int trasgessionOfDistance;

    public Hogwarts(int magic, int trasgessionOfDistance) {
        this.magic = magic;
        this.trasgessionOfDistance = trasgessionOfDistance;
    }

    public int getMagic() {
        return magic;
    }

    public int getTrasgessionOfDistance() {
        return trasgessionOfDistance;
    }
}




