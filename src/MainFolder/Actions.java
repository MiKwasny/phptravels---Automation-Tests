package MainFolder;

import UI_Elements.LoginScenarioPost;
import UI_Elements.MenuElement;
import UI_Elements.PathToLogin;

public class Actions
{
    public static LoginScenarioPost lsPost = new LoginScenarioPost();
    public static MenuElement element = new MenuElement();
    public static PathToLogin pathToLogin = new PathToLogin();


    public static void FillLoginForm (String Username, String Password) throws InterruptedException {

        lsPost.UserNameField.sendKeys(Username);
        lsPost.PasswordField.sendKeys(Password);
        lsPost.LoginButton.click();
    }

    public static void ClickHomeButton (){

        element.HomeButton.click();

    }
    public static void ClickHotelsButton (){

        element.HotelsButton.click();
    }
    public static void ClickFlightsButton (){

        element.FlightsButton.click();

    }
    public static void ClickToursButton (){

        element.ToursButton.click();
    }
    public static void ClickCarsButton (){

        element.CarsButton.click();

    }
    public static void ClickVisaButton (){

        element.VisaButton.click();

    }
    public static void ClickOffersButton (){

        element.OffersButton.click();

    }

    public static void GoToLoginPage () throws InterruptedException {

        pathToLogin.MyAccount.click();
        Thread.sleep(2000);
        pathToLogin.LoginPage.click();
        Thread.sleep(4000);
    }



}






