public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor;//честь
    private int bravery;//храбрость


    public Gryffindor(int magic, int trasgessionOfDistance,
                      int nobility, int honor, int bravery) {
        super(magic, trasgessionOfDistance);
        this.nobility=nobility;
        this.honor=honor;
        this.bravery=bravery;
    }
}
