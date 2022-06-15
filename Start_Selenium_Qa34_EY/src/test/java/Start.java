import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Start {
    WebDriver wd;
    public void start(){
        wd=new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.navigate().back();

        wd.quit();
    }

    @Test
    public void firstTest(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        //open form--> click login button
        WebElement loginTab=wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        //fill valid email
        WebElement emailTextBox=wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("noa@gmail.com");
        //fill valid password
        WebElement passwordTextBox=wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Nnoa12345$");
        //click login button
        WebElement loginButton=wd.findElement(By.cssSelector("button"));
        loginButton.click();
        // Assert
    }


    @Test
    public void firstTestRegister(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        //open form--> click login button
        WebElement loginTab=wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        //fill valid email
        WebElement emailTextBox=wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("porshe90_2@gmail.com");
        //fill valid password
        WebElement passwordTextBox=wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Porshe9012345$");
        //click register button
        WebElement registerButton =wd.findElement(By.cssSelector("div.login_login__3EHKB :nth-child(5)"));
        registerButton.click();
        // Assert
    }
}
