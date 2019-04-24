package com.zhaoyanblog.junit.test;


import com.zhaoyanblog.junit.AloneRunner;
import com.zhaoyanblog.junit.AloneWith;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(AloneRunner.class)
@AloneWith(JUnit4.class)
public class JunitAloneTest {
    @Test
    public void test() {
        StaticClass.staticNum++;
        Assert.assertEquals(1, StaticClass.staticNum);
    }
}
