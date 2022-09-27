package com.java.Main;

import com.java.beans.Interrupteur;
import com.java.beans.InterrupteurOffState;
import com.java.beans.InterrupteurOnState;
import com.java.beans.UI;

public class Main {
    public static void main(String[]args){
        Interrupteur interrupteur = new Interrupteur();
        UI appli = new UI(interrupteur);

        appli.init();
    }
}
