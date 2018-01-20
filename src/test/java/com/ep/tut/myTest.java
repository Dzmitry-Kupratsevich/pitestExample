package com.ep.tut;


import org.testng.Assert;
import org.testng.annotations.Test;

public class myTest {

    ForAssert forAssert = new ForAssert();

    int d = forAssert.returnInt();

    @Test
    public void myT() {
        Assert.assertTrue(2 != d);
    }
}
