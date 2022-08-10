// Copyright© by Fin

public class Generics<S, I, D> {

    S varString;
    I varInteger;
    D varDouble;

    public Generics() {
        System.out.println("Still null:");
        System.out.println("StringObject: " + getStringObject());
        System.out.println("IntegerObject: " + getIntegerObject());
        System.out.println("DoubleObject: " + getDoubleObject());
        System.out.println();
    }

    // Getter
    public S getStringObject() {
        return varString;
    }

    public I getIntegerObject() {
        return varInteger;
    }

    public D getDoubleObject() {
        return varDouble;
    }

    // Setter
    public void setStringObject(S varString) {
        this.varString = varString;
    }

    public void setIntegerObject(I varInteger) {
        this.varInteger = varInteger;
    }

    public void setDoubleObject(D varDouble) {
        this.varDouble = varDouble;
    }
}