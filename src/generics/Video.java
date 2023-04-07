package generics;

public class Video {

    String denumire;

    public Video(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return denumire;
    }
}
