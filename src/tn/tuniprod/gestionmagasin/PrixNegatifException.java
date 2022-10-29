package tn.tuniprod.gestionmagasin;

public class PrixNegatifException extends Exception {
    public PrixNegatifException() {
    }

    public PrixNegatifException(String message) {
        super(message);
    }
}
