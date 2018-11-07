import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    private void setUp() {


        WebDriver driver = new ChromeDriver();
    }


    public static void main(String[] args) {
        System.setProperties("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();


    }
}

//@FindBy(id = "idOfYourElement")
//private WebElement myLocator;
