package com.example.simplecalc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
@androidx.test.filters.SmallTest
public class ExampleUnitTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void powerNum() {
        double resultAdd = mCalculator.pow(2, 2);
        assertThat(resultAdd, is(equalTo(4d)));
    }

    @Test
    public void powerNum2() {
        double resultAdd = mCalculator.pow(-2, 2);
        assertThat(resultAdd, is(equalTo(4d)));
    }
    @Test
    public void powerNum3() {
        double resultAdd = mCalculator.pow(2, -2);
        assertThat(resultAdd, is(equalTo(0.25d)));
    }

    @Test
    public void powerNum4() {
        double resultAdd = mCalculator.pow(0, 3);
        assertThat(resultAdd, is(equalTo(0d)));
    }

    @Test
    public void powerNum5() {
        double resultAdd = mCalculator.pow(3, 0);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void powerNum6() {
        double resultAdd = mCalculator.pow(0, -1);
        assertThat(resultAdd, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void powerNum7() {
        double resultAdd = mCalculator.pow(-0, -2);
        assertThat(resultAdd, is(equalTo(Double.POSITIVE_INFINITY)));
    }

}