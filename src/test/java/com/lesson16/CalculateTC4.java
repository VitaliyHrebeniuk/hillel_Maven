package com.lesson16;

import com.lesson16Task.Calculate;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculateTC4 {
    private Calculate calc = new Calculate();
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }

    @DataProvider
    public Object[][] summLocalData() {
        return new Object[][]{
                {5, calc.sum(2, 3)},
                {0, calc.sum(0, 0)},
                {0, calc.sum(-2, 2)},
                {10000, calc.sum(3000, 7000)},
        };
    }

    @Test(dataProvider = "summLocalData", groups = "summLocalData")
    public void sum(int rezult, int sumDigit) {
        assertEquals(rezult, sumDigit);
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("@AfterGroups");
    }
}

