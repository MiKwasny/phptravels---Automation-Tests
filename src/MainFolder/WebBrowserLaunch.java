package MainFolder;


public class WebBrowserLaunch extends Main {



    public static void Launch(){
        System.setProperty("webdriver.gecko.driver", "D:\\JavaEverything\\drivers\\geckodriver.exe");
        String appUrl = "http://www.phptravels.net/";
        Driver.driver.get(appUrl);
        //Driver.driver.manage().window().maximize();
        //String Title = Driver.driver.getTitle();
        //System.out.println("Actual title is " + Title);

    }

}