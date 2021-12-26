package com.lesson16;

import com.lesson16Task.Calculate;
import org.testng.annotations.*;

public class CalculateTC3 {
    private Calculate calc = new Calculate();

    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("@BeforeMethod");
    }

    @Test(groups = "numbersUpTo1000")
    public void testSum3(){
        if(calc.sum(100,300) == 400){
            System.out.println("testSUM<1000 - PASS");
        }else{
            System.out.println("testSUM<1000 - FAIL");
        }
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("@AfterMethod");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("@AfterClass");
    }
}
