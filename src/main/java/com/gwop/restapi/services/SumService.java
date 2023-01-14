package com.gwop.restapi.services;

public class SumService {

    private int numberOne;

    private int numberTwo;

    public SumService(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public Integer sumNumbers() {
        return this.numberOne + this.numberTwo;
    }
}
