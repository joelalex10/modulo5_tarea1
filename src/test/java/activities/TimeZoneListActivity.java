package activities;

import controls.ListViewControl;
import org.openqa.selenium.By;

public class TimeZoneListActivity {
    public ListViewControl listViewControl = new ListViewControl(By.xpath("//android.widget.ListView[@resource-id=\"com.transsion.deskclock:id/cities_list\"]"));
}
