package OwnDatatype;// Copyright© by Fin

public class QueryValue<A, B, C> {
    A valueA;
    B valueB;
    C valueC;

    public QueryValue() {
    }

    public void add(A valueA, B valueB, C valueC) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
    }

    public String get() {
        return valueA + ", " + valueB + ", " + valueC;
    }

    public A getValueA() {
        return this.valueA;
    }

    public B getValueB() {
        return this.valueB;
    }

    public C getValueC() {
        return this.valueC;
    }
}