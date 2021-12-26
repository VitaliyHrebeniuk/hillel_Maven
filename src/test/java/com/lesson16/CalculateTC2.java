package com.lesson16;

import com.lesson16Task.Calculate;
import org.testng.annotations.*;

public class CalculateTC2 {
    private Calculate calc = new Calculate();

    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("@BeforeMethod");
    }

    @Test(groups = "numbersUpTo100")
    public void testSum2(){
        if(calc.sum(10,20) == 30){
            System.out.println("testSUM<100 - PASS");
        }else{
            System.out.println("testSUM<100 - FAIL");
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
