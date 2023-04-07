package generics;
import java.util.*;
public class Biblioteca {

    List<Carte> carti = new ArrayList<>();
    List<Ziar> ziare = new ArrayList<>();
    List<Video> videouri = new ArrayList<>();

    public void addCarte(Carte carte) {
        carti.add(carte);
    }

    public void addZiar(Ziar ziar) {
        ziare.add(ziar);
    }

    public void addVideo(Video video) {
        videouri.add(video);
    }

    public void afisareContinutZiare() {
        for(int i = 0; i< ziare.size(); i++) {
            Ziar ziar = ziare.get(i);
            System.out.println(ziar);
        }
    }

    public void afisareContinutCarti() {
        for(int i = 0; i< carti.size(); i++) {
            Carte carte = carti.get(i);
            System.out.println(carte);
        }
    }

    public void afisareContinutVideo() {
        for(int i = 0; i< videouri.size(); i++) {
            Video video = videouri.get(i);
            System.out.println(video);
        }
    }

}
