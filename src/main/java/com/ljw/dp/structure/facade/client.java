package com.ljw.dp.structure.facade;

public class client {
    public static void main(String[] args) {

        NetworkAccessFacade nfa = new NetworkAccessFacade();
        nfa.communicate();
    }
}
