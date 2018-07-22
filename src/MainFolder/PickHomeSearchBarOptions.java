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
import java.util.List;

public class PickHomeSearchBarOptions {

    //public static WebDriverWait wait = new WebDriverWait(Driver.driver, 60);
    public static HomeSearchBarElements homeSearchBarElements = new HomeSearchBarElements();

    public static class HotelSearchBar{

        public static class PickDate{

            public static void CheckIn(int year, String month, int day) {

                homeSearchBarElements.HotelCalendarCheckInField.click();

                Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                int calculation = year - currentYear;

                for (int i = Math.abs(calculation); i > 0; i--) {

                    if (year >= currentYear) {

                        Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(13) > div:nth-child(2) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)")).click();
                    } else {

                        Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(13) > div:nth-child(2) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1)")).click();
                    }

                }

                for (int i = 1; i <= 12; i++) {

                    String monthName = Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).getText();

                    if (monthName.contentEquals(month)) {

                        Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).click();

                    }

                }

                Driver.driver.findElement(By.cssSelector(".dpd1")).click();

                String MyDay = Integer.toString(day);

                WebElement tBody = Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > tbody"));

                List<WebElement> columns=tBody.findElements(By.tagName("td"));

                for (WebElement cell : columns)
                {
                    if (cell.getText().equals(MyDay) && !cell.getAttribute("Class").equals("day  old"));
                    {
                        String a = cell.getAttribute("Class");
                        System.out.println(a);
                        cell.click();
                        break;

                    }
                }

            }


        } } }