package UI_Elements;

import MainFolder.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StarGradeItemsFilter{

    public StarGradeItemsFilter ()
    {

        PageFactory.initElements(Driver.driver, this);

    }

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button:nth-child(3)")

    public WebElement StarsBar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(1) > div > ins")

    public WebElement OneStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(3) > div > ins")

    public WebElement TwoStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(5) > div > ins")

    public WebElement ThreeStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(7) > div > ins")

    public WebElement FourStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(9) > div > ins")

    public WebElement FiveStar;

}

