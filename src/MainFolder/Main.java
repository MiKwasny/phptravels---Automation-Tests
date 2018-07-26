package MainFolder;

public class Main {

    public static void main(String[] args){

        try{

            WebBrowserLaunch.Launch();

            //TitleCheck.TitleChecking("PHPTRAVELS | Travel Technology Partner");

            //Actions.GoToLoginPage();

            //Actions.FillLoginForm(Config.Credentials.Valid.Username, Config.Credentials.Valid.Password);
//
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
//            System.out.println("Test completed.. for now ");
//
//            Thread.sleep(6000);


            //Driver.driver.quit();

//            PickHomeSearchBarOptions.HotelSearchBar.HotelOrLocation("istanbul", 1, 1);
//            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckIn(2019, "Feb", 16);
//            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckOut(2020, "Aug", 25);
//            PickHomeSearchBarOptions.HotelSearchBar.AdultAndChildrenNumber(3,2);
//            PickHomeSearchBarOptions.HotelSearchBar.HotelSearch();

            Actions.FlightsBarClick();
            PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportFrom("Warsaw", 1);
            PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportDeparture("Athens", 2);
            PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
            PickHomeSearchBarOptions.FlightsSearchBar.OneWay();
            PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
            PickHomeSearchBarOptions.FlightsSearchBar.PickClass("Economy");
            PickHomeSearchBarOptions.FlightsSearchBar.DepartDate(2018, "Aug", 20);
            PickHomeSearchBarOptions.FlightsSearchBar.ReturnDate(2018, "Aug", 25);
            PickHomeSearchBarOptions.FlightsSearchBar.NumberOfQuests(2,1,1);
            PickHomeSearchBarOptions.FlightsSearchBar.ConfirmQuests();
            PickHomeSearchBarOptions.FlightsSearchBar.SearchBy();

            //Actions.ToursBarClick();
            //PickHomeSearchBarOptions.ToursSearchBar.SearchByListingOrCityName("Dubai", 1, 1);






        }

        catch(Exception meh){
            System.out.println("System ERROR");
            System.exit(-1);
        }




    }
}