package com.ljw.dp.structure.cor;

public class ContentTypeHandler implements HandlerChain {

    String contentType;
    public HandlerChain next;

    public ContentTypeHandler(String contentType) {
        this.contentType = contentType;
    }


    @Override
    public String addHandler(String inputHeader) {
        String output = inputHeader + "\nContent type: "+contentType;
        if(next == null){
            return output;
        }else {
            return next.addHandler(output);
        }
    }
}
