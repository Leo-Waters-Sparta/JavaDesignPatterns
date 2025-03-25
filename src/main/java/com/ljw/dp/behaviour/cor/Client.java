package com.ljw.dp.behaviour.cor;

public class Client {
    public static void main(String[] args) {
        AuthHandler auth= new AuthHandler("12345");
        ContentTypeHandler content= new ContentTypeHandler("text/plain");
        PayloadHandler payload= new PayloadHandler("username:bob");

        auth.next=content;
        content.next=payload;


        String withAuth = auth.addHandler("Headers with Auth");

        System.out.println(withAuth);

        String withOutAuth = content.addHandler("\nHeaders without Auth");

        System.out.println(withOutAuth);
    }
}
