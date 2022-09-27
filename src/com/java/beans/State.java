package com.java.beans;

public abstract class State {

    public abstract String allumer();
    public abstract String eteidre();

    public Interrupteur interrupteur;

    public State(Interrupteur interrupteur) {
        this.interrupteur = interrupteur;
    }
}
