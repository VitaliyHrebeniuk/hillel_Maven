package com.lesson16;
import com.lesson16Task.Calculate;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculateTC1 {
    private Calculate calc = new Calculate();

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("@BeforeMethod");
    }

    @Test(groups = "numbersUpTo10")
    public void testSum1(){
        if(calc.sum(2,3) == 5){
            System.out.println("testSUM<10 - PASS");
        }else{
            System.out.println("testSUM<10 - FAIL");
        }
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("@AfterMethod");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("@AfterGroups");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("@AfterClass");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite");
    }

}
