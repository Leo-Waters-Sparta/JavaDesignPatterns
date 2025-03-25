package com.ljw.dp.structure.bridge;

public class Facebook implements App {

    private PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }
    @Override
    public void runApp() {
        os.upload("Facebook upload data");
        os.download("Facebook upload download");
        os.display("Facebook display data");
    }
}
