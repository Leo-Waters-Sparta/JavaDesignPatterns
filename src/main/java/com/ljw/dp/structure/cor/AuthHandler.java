package com.ljw.dp.structure.cor;

public class AuthHandler implements HandlerChain {

    String token;
    public HandlerChain next;

    public AuthHandler(String token) {
        this.token = token;
    }


    @Override
    public String addHandler(String inputHeader) {
        String output = inputHeader + "\nAuth: "+token;
        if(next == null){
            return output;
        }else {
            return next.addHandler(output);
        }
    }
}
