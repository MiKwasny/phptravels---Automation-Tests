package MainFolder;

public class Main {

    public static void main(String[] args){

        try{

            WebBrowserLaunch.Launch();

            TitleCheck.TitleChecking("PHPTRAVELS | Travel Technology Partner");

//            Actions.GoToLoginPage();
//
//            Actions.FillLoginForm(Config.Credentials.Valid.Username, Config.Credentials.Valid.Password);

//            Actions.ClickHotelsButton();
//
//            PickFilters.HotelPageFilters.StarGrade.FiveStar();
//            PickFilters.HotelPageFilters.Amenities.BarLounge();
//            PickFilters.HotelPageFilters.Amenities.Spa();
//            PickFilters.HotelPageFilters.PropertyTypes.Hotel();
//            PickFilters.HotelPageFilters.PriceRange.LeftPriceBarMove(10);
//            PickFilters.HotelPageFilters.PriceRange.RightPriceBarMove(40);
//            PickFilters.HotelPageFilters.SearchHotel();
//
//            Thread.sleep(6000);
//
//            Actions.ClickCarsButton();
//
//            PickFilters.CarsPageFilters.AirPortPickUp.Yes();
//            PickFilters.CarsPageFilters.StarGrade.ThreeStar();
//            PickFilters.CarsPageFilters.CarTypes.Standard();
//            PickFilters.CarsPageFilters.PriceRange.LeftPriceBarMove(10);
//            PickFilters.CarsPageFilters.PriceRange.RightPriceBarMove(50);
//            PickFilters.CarsPageFilters.CarsSearch();
//
//            Thread.sleep(6000);
//
//            Actions.ClickToursButton();
//
//            PickFilters.ToursPageFilters.StarGrade.FourStar();
//            PickFilters.ToursPageFilters.TourTypes.Family();
//            PickFilters.ToursPageFilters.PriceRange.LeftPriceBarMove(20);
//            PickFilters.ToursPageFilters.PriceRange.RightPriceBarMove(10);
//
//            Thread.sleep(6000);
//
//            Actions.ClickFlightsButton();
//
//            PickFilters.FlightsPageFilters.NonStop();
//            PickFilters.FlightsPageFilters.Transit();
//
//            Thread.sleep(6000);

            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckIn(2022, "Feb", 22);

            System.out.println("Test completed.. for now ");

            Thread.sleep(6000);

            Driver.driver.quit();
        }

        catch(Exception meh){
            System.out.println("System ERROR");
            System.exit(-1);
        }




    }
}
