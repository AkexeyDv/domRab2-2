public class Ravenclaw extends Hogwarts{
    private int Intelligence;//ум
    private int wisdom; //мудрость
    private int wit;//остроумие
    private int creativity;//таорчество

    public Ravenclaw(int magic, int trasgessionOfDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magic, trasgessionOfDistance);
        Intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
}
