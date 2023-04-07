package streams;

import generics.Carte;

import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public void call() {

        List<Carte> carti = new ArrayList<>();
        carti.add(new Carte("Carte unu programare"));
        carti.add(new Carte("Carte doi roman"));
        carti.add(new Carte("Carte trei comedie "));
        carti.add(new Carte("Carte patru roman"));
        carti.add(new Carte("Carte cinci comedie"));


       List<Carte> cartiRomane =  carti.stream()
               .filter(a -> a.denumire.contains("roman"))
               .map(c -> new Carte(c.denumire.toUpperCase()))
               .peek(c -> System.out.println(c))
               .collect(Collectors.toList());

    }
}
