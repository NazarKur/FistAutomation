import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TestBase {

       public static final WebDriver driver = new ChromeDriver();



    public static void main(String[] args) {
        System.setProperties("webdriver.chrome.driver" , "src/main/resources/chromedriver");




    }
}

//@FindBy(id = "idOfYourElement")
//private WebElement myLocator;

