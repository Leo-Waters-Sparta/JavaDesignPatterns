package com.ljw.dp.structure.bridge;

public class Instagram implements App {

    private PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }
    @Override
    public void runApp() {
        os.display("Instagram display Cached data");
        os.upload("Instagram upload data");

        os.display("Instagram display data");
    }
}
