package com.calculatorTest.nick;

import org.junit.Test;
import com.calculator.nick.Systembolaget;

import static org.junit.jupiter.api.Assertions.*;

public class SystembolagetTest {

    Systembolaget bolaget = new Systembolaget();


    @Test
    public void givenTooYoungAgeWithoutAdult_WhenAskingToEnterTheSystembolaget_ThenReturnFalse(){
        int age = 16;
        boolean inCompanyOfAParent = false;
        boolean isBringingADog = false;
        assertFalse(bolaget.isAbleToEnterSystembolaget(age, inCompanyOfAParent, isBringingADog));
    }
    @Test
    public void givenTooYoungAgeWithAdult_WhenAskingToEnterTheSystembolaget_ThenReturnTrue(){
        int age = 16;
        boolean inCompanyOfAParent = true;
        boolean isBringingADog = false;
        assertTrue(bolaget.isAbleToEnterSystembolaget(age, inCompanyOfAParent, isBringingADog));
    }
    @Test
    public void givenAnAdultWithADog_WhenAskingToEnterTheSystembolaget_ThenReturnFalse(){
        int age = 25;
        boolean inCompanyOfAParent = false;
        boolean isBringingADog = true;
        assertFalse(bolaget.isAbleToEnterSystembolaget(age, inCompanyOfAParent, isBringingADog));
    }

}
