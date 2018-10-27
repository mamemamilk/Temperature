package com.example.temperature.model;

public class Body {
    private double Tem;
    public Body(double Tem){
        this.Tem=Tem;
    }
    public double getResult_ctof(){
        return ((1.8)*this.Tem)+32;
    }
    public double getResult_ftoc(){
        return (0.56)*(this.Tem-32);
    }
}
