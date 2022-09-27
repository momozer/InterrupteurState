package com.java.beans;

import java.util.ArrayList;
import java.util.List;

public class Interrupteur {
    private State state;
    private boolean playing = false;

    public Interrupteur() {
        this.state = new InterrupteurOffState(this);
        setPlaying(true);
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public State getState() {
        return state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setState(State state) {
        this.state = state;
    }
}
