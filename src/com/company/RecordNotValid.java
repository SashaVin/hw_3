package com.company;

public class RecordNotValid extends RuntimeException{

    public RecordNotValid(String message){
        super(message);
    }
}