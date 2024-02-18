package coursera.hashing;

import java.util.Date;

public final class Transaction implements Comparable<Transaction> {
    private final String who;
    private final Date when;
    private final double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + who.hashCode();
        hash = 31 * hash + when.hashCode();
        hash = 31 * hash + ((Double) amount).hashCode();
        return hash;
    }

    //modular hashing -> correct version, get the object's hashcode and make it positive and then modulo
    private int hash(Object key, int M){//
        return (key.hashCode() & 0x7fffffff) % M;
    }

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }
}
