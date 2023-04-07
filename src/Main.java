import com.sun.org.apache.xpath.internal.operations.Bool;
import exceptions.InvalidAgeException;
import exceptions.Numbers;
import exceptions.Person;
import generics.*;
import interfete.Expresie;
import interfete.ExpresieAdevarata;
import streams.StreamExample;

import javax.naming.InvalidNameException;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//        Numbers numbers = new Numbers();
//
//        try {
//            numbers.dividedBy(0);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            numbers.dividedBy(0);
//        }
//        catch(IllegalArgumentException e) {
//            System.out.println(e);
//        }


//        try {
//            Person person = new Person();
//
//            person.setAge(2);
//            person.setFirstName("");
//            person.setFirstName("");
//
//        } catch (NullPointerException  error) {
//            System.out.println(error.getMessage());
//        } catch (InvalidNameException error) {
//            System.out.println(error.getMessage());
//        } catch (InvalidAgeException error) {
//            System.out.println(error.getMessage());
//        }
//
//        try {
//            Person person = new Person();
//
//            person.setAge(2);
//            person.setFirstName("");
//            person.setFirstName("");
//
//        } catch (NullPointerException | InvalidNameException | InvalidAgeException error) {
//            System.out.println(error.getMessage());
//        }

//        error = InvalidNameException;
//
//        if(error == InvalidNameException) {
//        if(error == InvalidNameException || error == InvalidAgeException || error == InvalidNameException) {
//            System.out.println(error.getMessage());
//        }
//
//        if(error == InvalidNameException) {
//            System.out.println(error.getMessage());
//        }
//
//        if(error == InvalidNameException) {
//            System.out.println(error.getMessage());
//        }


//        Biblioteca biblioteca = new Biblioteca();
//
//        biblioteca.addCarte(new Carte("Carte numarul unu"));
//        biblioteca.addCarte(new Carte("Carte numarul doi"));
//
//        biblioteca.addZiar(new Ziar("Ziarul unu"));
//        biblioteca.addZiar(new Ziar("Ziarul doi"));
//
//        biblioteca.addVideo(new Video("Video unu"));
//        biblioteca.addVideo(new Video("Video doi"));
//
//
//        biblioteca.afisareContinutCarti();
//        biblioteca.afisareContinutZiare();
//        biblioteca.afisareContinutVideo();


//        BibliotecaGenerica<Carte> bibliotecaGenerica = new BibliotecaGenerica<>();
//
//        bibliotecaGenerica.add(new Carte("Carte numarul unu"));
//        bibliotecaGenerica.add(new Carte("Carte numarul doi"));
//
//        bibliotecaGenerica.afisareContinut();
//
//        BibliotecaGenerica<Ziar> bibliotecaGenericaZiar = new BibliotecaGenerica<>();
//
//        bibliotecaGenericaZiar.add(new Ziar("Ziarul unu"));
//
//        bibliotecaGenericaZiar.afisareContinut();


//        StreamExample streamExample = new StreamExample();
//        streamExample.call();


        Expresie expresieAdevarata = new ExpresieAdevarata();

        expresieAdevarata.apply(2 == 2);


        Expresie<Integer> expresie9 = new ExpresieAdevarata<>();

        expresie9.apply(2);


        Expresie<String> expresie8 = new ExpresieAdevarata<>();

        System.out.println(expresie8.apply("S"));


        Expresie<Boolean> expresie = new Expresie<Boolean>() {
            @Override
            public boolean apply(Boolean expresie) {
                return false;
            }
        };

        Expresie<Integer> expresie6 = new Expresie<Integer>() {
            @Override
            public boolean apply(Integer expresie) {
                return expresie == 2;
            }
        };

        System.out.println(expresie6.apply(2));

        Expresie<Boolean> expresieLambda = (Boolean exp) ->  exp == true;
        Expresie<Integer> expresieLambda2 = (Integer exp) ->  exp == 2;
        Expresie<String> expresieLambda3 = (exp) -> exp.contains("ABC");

        expresieLambda.apply(new Boolean(true));

        boolean raspuns = expresieLambda2.apply(new Integer(2)); // true

        Predicate<Boolean> predicate =  (a) ->  a;
        Predicate<Integer> predicate2 =  (a) ->  a == 2;
        Predicate<String> predicate3 =  (a) ->  a.contains("abc");

        System.out.println(predicate.test(true));
        System.out.println(predicate2.test(2));
        System.out.println(predicate3.test("abc"));

        System.out.println(expresie.apply(2 == 3));

    }
}