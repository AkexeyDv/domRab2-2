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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magic == hogwarts.magic && trasgessionOfDistance == hogwarts.trasgessionOfDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magic, trasgessionOfDistance);
    }
}




