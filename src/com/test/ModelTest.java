package com.test;

import com.company.Model;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by potaychuk on 28.04.2016.
 */
public class ModelTest {

    @Test
    public void testSideOfSquareNotNull() throws Exception {
        Model model = new Model();
        double a = model.sideOfSquare(0);
        assertNotNull(a);
     }

    @Test(expected = IllegalArgumentException.class)
    public void testSideOfSquareInvalidInput() throws Exception {
        Model model = new Model();
        double a = model.sideOfSquare(-50);
    }

    @Test
    public void testMinSideNotNull() throws Exception {
        Model model = new Model();
        int a = model.minSide(45);
        assertNotNull(a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinSideInvalidInput() throws Exception {
        Model model = new Model();
        int a = model.minSide(-50);
    }

}