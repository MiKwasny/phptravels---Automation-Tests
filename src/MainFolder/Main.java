package MainFolder;

import org.junit.Before;
import org.junit.Test;

public class Main {

    @Before

    public void TestInitiation() {

        WebBrowserLaunch.Launch();
    }

    @Test

    public void LoginTest() {

        try {

            TitleCheck.TitleChecking("PHPTRAVELS | Travel Technology Partner");
            Actions.GoToLoginPage();
            Actions.FillLoginForm(Config.Credentials.Valid.Username, Config.Credentials.Valid.Password);

        } catch (Exception e) {

        }
    }

    @Test

    public void HotelModuleSearchTest() {


        PickFilters.HotelPageFilters.StarGrade.FiveStar();
        PickFilters.HotelPageFilters.Amenities.BarLounge();
        PickFilters.HotelPageFilters.Amenities.Spa();
        PickFilters.HotelPageFilters.PropertyTypes.Hotel();
        PickFilters.HotelPageFilters.PriceRange.LeftPriceBarMove(10);
        PickFilters.HotelPageFilters.PriceRange.RightPriceBarMove(40);
        PickFilters.HotelPageFilters.SearchHotel();
    }

    @Test

    public void CarsModuleSearchTest() {

        Actions.ClickCarsButton();
        PickFilters.CarsPageFilters.AirPortPickUp.Yes();
        PickFilters.CarsPageFilters.StarGrade.ThreeStar();
        PickFilters.CarsPageFilters.CarTypes.Standard();
        PickFilters.CarsPageFilters.PriceRange.LeftPriceBarMove(10);
        PickFilters.CarsPageFilters.PriceRange.RightPriceBarMove(50);
        PickFilters.CarsPageFilters.CarsSearch();
    }

    @Test

    public void ToursModuleSearchTest() {

        Actions.ClickToursButton();
        PickFilters.ToursPageFilters.StarGrade.FourStar();
        PickFilters.ToursPageFilters.TourTypes.Family();
        PickFilters.ToursPageFilters.PriceRange.LeftPriceBarMove(20);
        PickFilters.ToursPageFilters.PriceRange.RightPriceBarMove(10);
    }

    @Test

    public void FlightsModuleSearchTest() {


        Actions.ClickFlightsButton();

        PickFilters.FlightsPageFilters.NonStop();
        PickFilters.FlightsPageFilters.Transit();
    }

    @Test

    public void HotelBarTest() {

        try {

            PickHomeSearchBarOptions.HotelSearchBar.HotelOrLocation("istanbul", 1, 1);
            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckIn(2019, "Feb", 16);
            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckOut(2020, "Aug", 25);
            PickHomeSearchBarOptions.HotelSearchBar.AdultAndChildrenNumber(3, 2);
            PickHomeSearchBarOptions.HotelSearchBar.HotelSearch();


        } catch (Exception e) {

        }
    }

    @Test
    public void FlightBarTest() {

        try {

            Actions.FlightsBarClick();
            PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportFrom("Warsaw", 1);
            PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportDeparture("Athens", 2);
            PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
            PickHomeSearchBarOptions.FlightsSearchBar.OneWay();
            PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
            PickHomeSearchBarOptions.FlightsSearchBar.PickClass("Economy");
            PickHomeSearchBarOptions.FlightsSearchBar.DepartDate(2018, "Aug", 20);
            PickHomeSearchBarOptions.FlightsSearchBar.ReturnDate(2018, "Aug", 25);
            PickHomeSearchBarOptions.FlightsSearchBar.NumberOfQuests(2, 1, 1);
            PickHomeSearchBarOptions.FlightsSearchBar.ConfirmQuests();
            PickHomeSearchBarOptions.FlightsSearchBar.SearchBy();

        } catch (Exception e) {

        }
    }

    @Test
    public void ToursBarTest() {

        Actions.ToursBarClick();
        PickHomeSearchBarOptions.ToursSearchBar.SearchByListingOrCityName("Dubai", 1, 1);
        PickHomeSearchBarOptions.ToursSearchBar.TourDate(2019, "Jul", 20);
    }


}






