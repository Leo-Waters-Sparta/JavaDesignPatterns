package com.ljw.dp.structure.bridge;

public class IOS implements PhoneOS
{

    @Override
    public void upload(String data) {
        System.out.println("IOS uploading data: " + data);
    }

    @Override
    public void download(String data) {
        System.out.println("IOS downloading data: " + data);
    }

    @Override
    public void display(String data) {
        System.out.println("IOS displaying data: " + data);
    }
}
