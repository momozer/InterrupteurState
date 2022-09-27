package com.java.beans;

public class InterrupteurOnState extends State {

    @Override
    public String allumer() {
        return "deja allumer";
    }
    public InterrupteurOnState(Interrupteur interrupteur) {
        super(interrupteur);
    }
    @Override
    public String eteidre() {
        interrupteur.setState(new InterrupteurOffState(interrupteur));
        return "éteindre";
    }

    @Override
    public String toString() {
        return "InterrupteurOnState{}";
    }


}
