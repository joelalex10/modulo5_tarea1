package activities;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class RelojTabActivity {
    public Button addNewTimeZone = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Ciudades\"]"));

    public boolean isCityDisplayed(String nameCity){
        Label taskLabel = new Label(By.xpath("//android.widget.TextView[@text='"+nameCity+"']"));
        return taskLabel.isControlDisplayed();
    }
}
