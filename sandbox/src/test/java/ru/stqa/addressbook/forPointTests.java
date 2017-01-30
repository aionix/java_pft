package ru.stqa.addressbook;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Артем on 09.01.2017.
 */
public class forPointTests {


    @Test
    void checkCoordinates(){
        double expected = 4.0;
        double actual = Point.distance(new Point(1,5), new Point(1,1));
        Assert.assertEquals(actual, expected);
    }
    @Test
    void checkCoordinates2(){
        double expected = 2.8284271247461903;
        double actual = Point.distance(new Point(3,3), new Point(1,1));
        Assert.assertEquals(actual, expected);
    }
    @Test
    void checkCoordinates3(){
        double expected = 1.0;
        double actual = Point.distance(new Point(2,5), new Point(2,6));
        Assert.assertEquals(actual, expected);
    }
}
