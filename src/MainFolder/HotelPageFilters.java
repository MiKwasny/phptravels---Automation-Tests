package MainFolder;

import UI_Elements.FilterPositions;

public class HotelPageFilters
{
    public static FilterPositions hotelsFilter = new FilterPositions();

    public static void StarsBar ()
        {
            hotelsFilter.StarsBar.click();
        }

    public static void OneStar ()
    {
        hotelsFilter.OneStar.click();
    }

    public static void TwoStar ()
    {
        hotelsFilter.TwoStar.click();
    }

    public static void ThreeStar ()
    {
        hotelsFilter.ThreeStar.click();
    }

    public static void FourStar ()
    {
        hotelsFilter.FiveStar.click();
    }

    public static void FiveStar ()
    {
        hotelsFilter.FiveStar.click();
    }
}