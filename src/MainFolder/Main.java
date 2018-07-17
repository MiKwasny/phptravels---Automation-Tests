package MainFolder;

public class Main {

    public static void main(String[] args)throws InterruptedException {

        try{

            WebBrowserLaunch.Launch();

            TitleCheck.TitleChecking("PHPTRAVELS | Travel Technology Partner");

            Actions.GoToLoginPage();

            Actions.FillLoginForm(Config.Credentials.Valid.Username, Config.Credentials.Valid.Password);

            Thread.sleep(2000);

            Actions.ClickHotelsButton();

            System.out.println("Test completed.. for now ");
        }

        catch(Exception meh){
            System.out.println("System ERROR");
            System.exit(-1);
        }




    }
}
