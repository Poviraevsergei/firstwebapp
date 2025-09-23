package com.tms.solid.I.bad;

public class PhotoCamera implements Devicable{
    @Override
    public void print() {
        //логика печати !!!!
    }

    @Override
    public void makePhoto() {
        //логика создания фото
    }

    @Override
    public void sendMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
