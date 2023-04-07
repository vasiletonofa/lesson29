package interfete;

public class ExpresieAdevarata<T> implements Expresie<T> {
    @Override
    public boolean apply(T expresie) {
        return true;
    }
}
