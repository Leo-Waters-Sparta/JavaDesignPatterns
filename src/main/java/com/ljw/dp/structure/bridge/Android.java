package com.ljw.dp.structure.bridge;

public class Android implements PhoneOS
{

    @Override
    public void upload(String data) {
        System.out.println("Android uploading data: " + data);
    }

    @Override
    public void download(String data) {
        System.out.println("Android downloading data: " + data);
    }

    @Override
    public void display(String data) {
        System.out.println("Android displaying data: " + data);
    }
}
