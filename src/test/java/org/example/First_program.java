package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class First_program
{
    public static <WebElements> void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        WebElement element= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));

        Actions action = new Actions(driver);

        action.moveToElement(element).click().perform();

        WebElement mobile = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
        mobile.sendKeys("9315859457");

        WebElement Cont = driver.findElement( By.xpath("//*[@id=\"continue\"]"));
        Cont.click();

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
        pass.sendKeys("Deepu@123");

        WebElement signIn = driver.findElement( By.xpath("//*[@id=\"signInSubmit\"]"));
        signIn.click();

        WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys("5g hotspot wifi device");

        WebElement SearchBtn = driver.findElement( By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        SearchBtn.click();

        WebElement SearchResult = driver.findElement( By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        SearchResult.click();

        ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb1.get(1));

        WebElement AddToCart = driver.findElement( By.xpath("//*[@id=\"add-to-cart-button\"]"));
        AddToCart.click();

        WebElement GoToCart = driver.findElement( By.xpath("//*[@id=\"sw-gtc\"]/span/a"));
        GoToCart.click();

        WebElement TotalNoOfItem = driver.findElement( By.xpath("//*[@id=\"sc-subtotal-label-activecart\"]"));

        System.out.println("Total No Of Item is "+ TotalNoOfItem.getText().substring(10, 18));

        WebElement TotalAmount = driver.findElement( By.xpath("//*[@id=\"sc-subtotal-amount-activecart\"]/span"));
        System.out.println("Total Amount is "+ TotalAmount.getText());

        By mySelector = By.xpath("//*[@class='a-truncate-cut']");
        List<WebElement> myElements = driver.findElements(mySelector);
        System.out.println("Name of the Items added in cart is ");

        for(WebElement e : myElements)
        {

                System.out.println(e.getText());

        }

    }


}
