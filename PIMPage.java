package orangehrmpom;

import org.openqa.selenium.*;
import java.util.List;

public class PIMPage {
    WebDriver driver;

    By addEmployeeBtn = By.xpath("//a[text()='Add Employee']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");
    By employeeListMenu = By.xpath("//a[text()='Employee List']");
    By nameCells = By.xpath("//div[@class='oxd-table-body']//div[@role='row']//div[3]");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee(String fName, String lName) {
        driver.findElement(addEmployeeBtn).click();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(saveBtn).click();
    }

    public void goToEmployeeList() {
        driver.findElement(employeeListMenu).click();
    }

    public boolean verifyEmployee(String fullName) {
        List<WebElement> names = driver.findElements(nameCells);
        for (WebElement e : names) {
            if (e.getText().equalsIgnoreCase(fullName)) {
                System.out.println(fullName + " - Name Verified");
                return true;
            }
        }
        return false;
    }
}

