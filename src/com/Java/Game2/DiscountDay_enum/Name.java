package com.Java.Game2.DiscountDay_enum;

enum Name {
    Ivan("Код менеджера - А205"),
    Petr("Код менеджера - А218"),
    Marina("Код менеджера - А195");

    private String code;

    Name(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}