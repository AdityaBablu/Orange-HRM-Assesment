package orangehrmpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage {
    WebDriver driver;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By logoutDropdown = By.className("oxd-userdropdown-tab");
    By logoutBtn = By.xpath("//a[text()='Logout']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPIM() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(pimMenu)).click().perform();
    }

    public void logout() {
        driver.findElement(logoutDropdown).click();
        driver.findElement(logoutBtn).click();
    }
}

