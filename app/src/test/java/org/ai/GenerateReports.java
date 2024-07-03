package org.ai;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class GenerateReports{

public static void main(String[] args) {
    System.out.println("=============Allure Reports===================");
}
@Test

    @Epic("validating the Login credentials")
    @Feature("With valid username and password")
    @Story("Verifying the tests with valid credentials")
    @Severity(SeverityLevel.BLOCKER)
public  void test1(){
    System.out.println("TC1 is pass");
}
@Test
@Epic("validating the Login invalid credentials")
@Feature("With invalid username and password")
@Story("Verifying the tests with invalid credentials")
@Severity(SeverityLevel.BLOCKER)
public void test2(){
    Assert.assertTrue(false);   
    System.out.println("TC2 is fail");
}
@Test
//@Feature("using valid username and invalid password")
public  void test3(){
    System.out.println("TC3 is pass");
}
@Test
@Severity(SeverityLevel.CRITICAL)
@Description("This is a product defect")
public void test4(){
    Assert.assertTrue(false);   
    System.out.println("TC4 is fail");
}
@Test
public  void test5(){
    System.out.println("TC5 is pass");
}
@Test
@Severity(SeverityLevel.MINOR)
public void test6(){
    Assert.assertTrue(false);   
    System.out.println("TC6 is fail");
}
@Test
@Severity(SeverityLevel.TRIVIAL)
public  void test7(){
    System.out.println("TC7 is pass");
}
@Test
public void test8(){
    Assert.assertTrue(false);   
    System.out.println("TC89 is fail");
}
@Test(invocationCount=5)
public  void test9(){
    System.out.println("TC9 is pass");
}
@Test
public void test10(){
    Assert.assertTrue(false);   
    System.out.println("T10 is fail");
}
@Test()

public  void test11(){
    System.out.println("TC11 is pass");
}
@Test()
public void test12(){
    Assert.assertTrue(true);   
    System.out.println("TC12 is pass");
}
@Test
public  void test13(){
    System.out.println("TC13 is pass");
}
@Test()
public void test14(){
    Assert.assertTrue(true);   
    System.out.println("TC14 is true");
}
@Test
public  void test15(){
    System.out.println("TC15 is pass");
}
@Test()
public void test16(){
    Assert.assertTrue(false);   
    System.out.println("TC16 is fail");
}
@Test

public  void test17(){
    System.out.println("TC17 is pass");
}
@Test()
public void test18(){
    Assert.assertTrue(true);   
    System.out.println("TC18 is true");
}
@Test

public  void test19(){
    System.out.println("TC17 is pass");
}
@Test

public  void test20(){
    System.out.println("TC17 is pass");
}
@Test

public  void test21(){
    System.out.println("TC17 is pass");
}










}