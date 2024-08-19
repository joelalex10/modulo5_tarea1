package controls;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

import java.time.Duration;
import java.util.List;

public class ListViewControl extends Control {

    public ListViewControl(By locator) {
        super(locator);
    }

    public void clickItemByText(String text) {
        int maxScrolls = 5; // Número máximo de scrolls para intentar encontrar el elemento
        boolean itemFound = false;

        for (int i = 0; i < maxScrolls; i++) {
            try {
                this.findControl();
                WebElement item = Session.getInstance().getDevice().findElement(By.xpath(this.locator.toString().replace("By.xpath: ", "") + "//*[contains(@text, '" + text + "')]"));
                item.click();
                itemFound = true;
                break;
            } catch (Exception e) {
                scrollDown();
            }
        }

        if (!itemFound) {
            throw new RuntimeException("El elemento con texto '" + text + "' no se encontró después de hacer scroll.");
        }
    }

    public void scrollDown() {
        TouchAction<?> touchAction = new TouchAction<>((PerformsTouchActions) Session.getInstance().getDevice());

        // Obtener el tamaño de la pantalla
        int width = Session.getInstance().getDevice().manage().window().getSize().width;
        int height = Session.getInstance().getDevice().manage().window().getSize().height;

        // Definir los puntos para el scroll
        int startX = width / 2;
        int startY = (int) (height * 0.8);
        int endY = (int) (height * 0.2);

        touchAction
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }
}
