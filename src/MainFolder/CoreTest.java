package MainFolder;

import org.openqa.selenium.By;

public class CoreTest extends WebBrowserLaunch {


    public static void Test() throws InterruptedException {

        //WebBrowserLaunch Test = new WebBrowserLaunch();

        Driver.driver.findElement(By.linkText("Hotels")).click();
        Thread.sleep(2000);
        Driver.driver.findElement(By.linkText("Flights")).click();
        Thread.sleep(2000);
        Driver.driver.findElement(By.linkText("Cars")).click();
        Thread.sleep(2000);
        Driver.driver.findElement(By.linkText("Blog")).click();
    }
}
