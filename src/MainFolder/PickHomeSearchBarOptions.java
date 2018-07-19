package MainFolder;
import UI_Elements.HomeSearchBarElements;
import UI_Elements.ModulesSearchBarsElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;

public class PickHomeSearchBarOptions {

    //public static WebDriverWait wait = new WebDriverWait(Driver.driver, 60);
    public static HomeSearchBarElements homeSearchBarElements = new HomeSearchBarElements();

    public static class HotelSearchBar{

        public static class PickDate{

            public static void CheckIn(int year, String month, int day){

                homeSearchBarElements.HotelCalendarCheckInField.click();

                Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

                //String yearAsString = Integer.toString(year);

                if (year >2018){

                    for(int i = (year - Calendar.getInstance().get(Calendar.YEAR)); i<-1 ; i--) {
                        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(yearAsString)));
                        Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > thead > tr:nth-child(1) > th.next")).click();
                    }}

                Driver.driver.findElement(By.linkText(month)).click();

                if (year <2018){

                    for(int i = (Calendar.getInstance().get(Calendar.YEAR)-year); i<-1; i--) {

                        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(yearAsString)));
                        Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > thead > tr:nth-child(1) > th.prev")).click();
                    }}

                Driver.driver.findElement(By.linkText(month)).click();

                Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

                if(day <= Calendar.getInstance().get(Calendar.DAY_OF_MONTH)){
                    String dayAsString = Integer.toString(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                    Driver.driver.findElement(By.linkText(dayAsString)).click();
                }

                else{
                    String day2AsString = Integer.toString(day);
                    Driver.driver.findElement(By.linkText(day2AsString)).click();
                }


//                public static void Year(){
//
//                }
//
//                public static void Month(){
//
//                }
//
//                public static void Day(int row, int column){
//
//                    homeSearchBarElements.HotelCalendarCheckInField.click();
//                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > tbody > tr:nth-child("+column+") > td:nth-child(r"+row+")")).click();
//                }



            }
            {






            }
        }

    }




}
