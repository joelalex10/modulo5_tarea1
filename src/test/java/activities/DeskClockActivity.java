package activities;

import controls.Button;
import controls.Label;
import controls.TabBarControl;
import org.openqa.selenium.By;

public class DeskClockActivity {

    public TabBarControl tabBar = new TabBarControl(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.transsion.deskclock:id/tabs']/android.widget.LinearLayout"));

}
