import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartCss {
    WebDriver wd;
    @Test
    public void startCssLocators(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        WebElement el1=wd.findElement(By.id("root"));
        WebElement el2=wd.findElement(By.tagName("a"));
        WebElement el3=wd.findElement(By.className(""));
        WebElement el4=wd.findElement(By.linkText("LOGIN"));
        WebElement el5=wd.findElement(By.partialLinkText("LOG"));
    }
}