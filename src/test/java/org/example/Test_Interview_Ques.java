package org.example;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;



public class Test_Interview_Ques
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/selenium");

//---------------------------------------------------------------------------------------
//        driver.get("http://demo.guru99.com/test/guru99home/");
//        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//        System.out.println("Implicit wait for 3000 second");
//        WebDriverWait wait=new WebDriverWait(driver,3000);
//        System.out.println("Explicit wait 3000 second");
//----------------------------------------------------------------------------------------
//        JavascriptExecutor jse=(JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,5000)");
//-----------------------------------------------------------------------------------------
//        String ActualTitle= driver.getTitle();
//        System.out.println(ActualTitle);
//        String ExpectedTitle="Amazon.com. Spend less. Smile more.";
//        if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
//        {
//            System.out.println("Title Matched");
//        }
//---------------------------------------------------------------------------------------
//
//        Actions action= new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
//
//        String STR = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).getCssValue("font-size");
//        System.out.println(STR);
//------------------------------------------------------------------------------------------------
//        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//        System.out.println(screenshotBase64);
//------------------------------------------------------------------------------------------------
//      WebElement drpDown=driver.findElement(By.xpath("//*[@id=\"developers-menu-toggle\"]/span/span/svg"));
//      Select dropdown = new Select(drpDown);
//      dropdown.selectByVisibleText("Support");
//------------------------------------------------------------------------------------------------
//        String Handle=driver.getWindowHandle();
//        driver.switchTo().window(Handle);
//-------------------------------------------------------------------------------------------------
//        WebElement File=driver.findElement(By.id("FileUpload"));
//        File.sendKeys("D:\\SeleniumInterview\\UploadFile.txt");
//-------------------------------------------------------------------------------------------------
//            Dimension d=new Dimension(400,600);
//            driver.manage().window().setSize(d);
//-------------------------------------------------------------------------------------------
//        ((JavascriptExecutor)driver).executeScript("window.resizeTo(400, 600)");
//
//        WebDriverWait wait=new WebDriverWait(driver, 10);
//        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//        alert.authenticateUsing(new UserAndPassword(<username>, <password>));
//--------------------------------------------------------------------------------------------




        //driver.close();
        //driver.quit();
    }
}
