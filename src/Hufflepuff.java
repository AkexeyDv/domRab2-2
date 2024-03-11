import java.util.Objects;

public class Hufflepuff extends Student {
    private final int hardWork; //трудолюбие
    private final int loyal;//верность
    private final int honest;//честность

    public Hufflepuff(int magic, int trasgessionOfDistance, String name, String surname, int hardWork, int loyal, int honest) {
        super(magic, trasgessionOfDistance, name, surname);
        this.hardWork = hardWork;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void characteristic() {
        System.out.println(getName() + " " + getSurname());
        System.out.println("Имеет следующие навыки:");
        System.out.println("Магия: " + getMagic() + ", трансгрессия: " + getTrasgessionOfDistance());
        System.out.println("Обучается на факультете Пуффендуй и обладает следующими характеристиками: ");
        System.out.println("Трудолюбие: " + getHardWork() + ", верность: " + getLoyal() +
                ", честность: " + getHonest());
    }
    public int sumProperty(){
        return getHardWork()+getLoyal()+getHonest();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardWork == that.hardWork && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardWork, loyal, honest);
    }
}
