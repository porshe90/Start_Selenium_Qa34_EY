import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tesst_1 {

    WebDriver wd;

    @Test
    public void start1(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.navigate().to("https://trello.com");
        //wd.navigate().back();
        //.navigate().forward();
        wd.close();
        wd.quit();
    }
    @Test
    public void start2(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.navigate().to("https://trello.com");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.close();
        wd.quit();
    }
    @Test
    public void start3(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.navigate().to("https://trello.com");

        //open login form
        WebElement login;
        login.click();
        //fill in login form
        WebElement emailTextbox;
        emailTextbox.click();
        emailTextbox.clear();
        emailTextbox.sendKeys("");
        //confirm email
        WebElement confirmLoginButton;
        confirmLoginButton.click();
        //fill in  password
        WebElement passwordTextbox;
        passwordTextbox.click();
        passwordTextbox.clear();
        passwordTextbox.sendKeys("");
        //click login button
        WebElement logButton;
        logButton.click();
    }
}
