package generics;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaGenerica<E> {

    List<E> date = new ArrayList<>();

    public void add(E element) {
       date.add(element);
    }

    public void afisareContinut() {
        for(int i = 0; i< date.size(); i++) {
            E element = date.get(i);
            System.out.println(element);
        }
    }
}
