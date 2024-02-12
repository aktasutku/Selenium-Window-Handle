import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Aliexpress {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aliexpress.us/");
    }

    @Test
    public void searchProduct() throws InterruptedException {

        String searchItemText = "phone";
        WebElement searchBox = driver.findElement(By.id("search-words"));
        searchBox.sendKeys(searchItemText);

        WebElement searchButton = driver.findElement(By.className("search--submit--2VTbd-T"));
        searchButton.click();

        Thread.sleep(2000);

        //WIndow handle when there is cookies and unexpected popups

//        //Find the section that opened bottom part of the window -> like accept all cookies or popup sections
//        String mainWindowsHandle = driver.getWindowHandle();
//        for (String windowhandle : driver.getWindowHandles()) {
//            if (!windowhandle.equals(mainWindowsHandle)) {
//                driver.switchTo().window(windowhandle);
//                break;
//            }
//        }
//
//
//        //Click on top section
//        WebElement popupCloseBtn = driver.findElement(By.className("pop-close-btn"));
//        popupCloseBtn.click();
//
//        //Get back to main windows
//        driver.switchTo().window(mainWindowsHandle);

        WebElement reviewsFilter = driver.findElement(By.xpath("(//span[@class='checkbox--icon--4FTXRwP'])[10]"));
        reviewsFilter.click();

    }
}
