package com.ljw.dp.structure.facade;

public class NetworkAccessFacade {

    private Comm comm = new Comm();
    private  Cache cache = new Cache();
    private  Interceptor interceptor = new Interceptor();
    private Converter converter = new Converter();

    public void communicate() {
        cache.cache();
        comm.send("data");
        comm.receive();
        interceptor.intercept();
        converter.convert();
    }
}
