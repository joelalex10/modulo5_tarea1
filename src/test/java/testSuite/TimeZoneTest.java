package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeZoneTest extends TestBase{
    @Test
    public void verifyCreateNewTimeZone(){
        //String nameTask = "cato" + new Date().getTime();
        String nameCity = "Andorra";
        deskClockActivity.tabBar.selectTabByIndex(2);
        relojTabActivity.addNewTimeZone.clickControl();
        timeZoneListActivity.listViewControl.clickItemByText(nameCity);
        Assertions.assertTrue(relojTabActivity.isCityDisplayed(nameCity));

    }
}
