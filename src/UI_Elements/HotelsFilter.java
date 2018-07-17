package UI_Elements;

import MainFolder.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelsFilter {

    public HotelsFilter ()
    {

        PageFactory.initElements(Driver.driver, this);

    }


    //Price Range

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button:nth-child(5)")

    public WebElement PriceRangeBar;



    //Property Types

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button:nth-child(7)")

    public WebElement PropertyTypesBar;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(3) > div > ins")

    public WebElement Apartment;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(5) > div > ins")

    public WebElement Hotel;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(7) > div > ins")

    public WebElement GuestHouse;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(9) > div > ins")

    public WebElement Motel;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(11) > div > ins")

    public WebElement Residence;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(13) > div > ins")

    public WebElement Resort;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(15) > div > ins")

    public WebElement TimeShare;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(17) > div > ins")

    public WebElement ExtendedStay;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(19) > div > ins")

    public WebElement Villa;

    //Amenities

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button.collapsebtn.last.go-text-right")

    public WebElement CollapseAmenitiesBar;

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button.collapsebtn.last.go-text-right.collapsed")

    public WebElement OpenAmenitiesBar;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(3) > div > ins")

    public WebElement AirportTransport;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(5) > div > ins")

    public WebElement BusinessCenter;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(7) > div > ins")

    public WebElement DisabledFacilities;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(9) > div > ins")

    public WebElement NightClub;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(11) > div > ins")

    public WebElement LaundryService;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(13) > div > ins")

    public WebElement Restaurant;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(15) > div > ins")

    public WebElement WifiInternet;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(17) > div > ins")

    public WebElement BarLounge;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(19) > div > ins")

    public WebElement SwimmingPool;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(21) > div > ins")

    public WebElement InsideParking;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(23) > div > ins")

    public WebElement ShuttleBusService;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(25) > div > ins")

    public WebElement FitnessCenter;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(27) > div > ins")

    public WebElement Spa;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(29) > div > ins")

    public WebElement ChildrenActivities;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(31) > div > ins")

    public WebElement AirConditioner;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(33) > div > ins")

    public WebElement BanquetHall;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(35) > div > ins")

    public WebElement CardsAccepted;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(37) > div > ins")

    public WebElement Elevator;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(39) > div > ins")

    public WebElement PetsAllowed;

    //Search

    @FindBy(how = How.CSS, using = "#searchform")

    public WebElement FilterSearch;

}
