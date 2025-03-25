package com.ljw.dp.behaviour.cor;

public class PayloadHandler implements HandlerChain {

    String payload;
    public HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }


    @Override
    public String addHandler(String inputHeader) {
        String output = inputHeader + "\n"+payload;
        if(next == null){
            return output;
        }else {
            return next.addHandler(output);
        }
    }
}
