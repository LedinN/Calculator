package com.calculator.nick;

public class Systembolaget {

    public boolean isAbleToEnterSystembolaget(int age, boolean inCompanyOfAParent, boolean isBringingADog){
        if ((age >= 20 || inCompanyOfAParent) && !isBringingADog) {
            return true;
        } else {
            return false;
        }
    }
}
