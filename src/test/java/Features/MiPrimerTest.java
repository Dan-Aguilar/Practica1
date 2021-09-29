package Features;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimerTest
{
    private static WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximiza la ventana
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void Test1() throws InterruptedException
    {
        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        inputBusqueda.click();
        inputBusqueda.sendKeys("Alexa");
        Thread.sleep(3000);
        WebElement buttonSearch = driver.findElement(By.id("nav-search-submit-button"));
        buttonSearch.click();
        Thread.sleep(2000);
        WebElement Lista = driver.findElement(By.id("a-autoid-0-announce"));
        Lista.click();
        Thread.sleep(2000);
        WebElement Seleccionar = driver.findElement(By.id("s-result-sort-select_2"));
        Seleccionar.click();
        Thread.sleep(3000);


    }

    @After
    public void tearDown() throws InterruptedException
    {
        driver.quit();
    }
}
