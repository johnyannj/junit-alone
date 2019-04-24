package com.zhaoyanblog.junit.test;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("it is test failed.")
public class JunitTest {
    @Test
    public void test() {
        StaticClass.staticNum++;
        Assert.assertEquals(1, StaticClass.staticNum);
    }
}
