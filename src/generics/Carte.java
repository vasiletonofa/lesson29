package generics;

public class Carte {
    public String denumire;

    public Carte(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return denumire;
    }
}
