package com.java.beans;

public class InterrupteurOffState  extends State{

    @Override
    public String allumer() {
        interrupteur.setState(new InterrupteurOnState(interrupteur));
        return "allumer";
    }

    @Override
    public String eteidre() {
        return "deja éteint";
    }

    @Override
    public String toString() {
        return "InterrupteurOffState{}";
    }

    public InterrupteurOffState(Interrupteur interrupteur) {
        super(interrupteur);
    }
}
