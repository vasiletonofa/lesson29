package exceptions;

public class Numbers {

    public void dividedBy(int value) {

        if(value == 0) {
            throw new IllegalArgumentException("Nu putem aveam valoarea 0");
        }

    }

}
