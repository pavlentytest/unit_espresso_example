package ru.samsung.itschool.mdev.myapplication;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void sum() {
        Assert.assertEquals(3,calc.sum(1,2));
    }

    @Test
    public void sum2() {
        Assert.assertEquals(3,calc.sum(2,2));
    }

    @Test(expected = NullPointerException.class)
    public void test() {
        //Assert.assertThrows(null, calc.toString(null));
        Assert.assertTrue("", calc.toString(null));

    }
}