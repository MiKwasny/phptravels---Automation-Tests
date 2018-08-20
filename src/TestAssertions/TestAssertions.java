package TestAssertions;

import MainFolder.Driver;
import org.junit.Assert;

public class TestAssertions {

        public static void FinalTourBarPageCheck() {

            String TourUrl = Driver.driver.getCurrentUrl();
            Assert.assertEquals("https://www.phptravels.net/tours/united-arab-emirates/dubai/Big-Bus-Tour-of-Dubai?date=20/07/2019&adults=2", TourUrl);
        }


    }
