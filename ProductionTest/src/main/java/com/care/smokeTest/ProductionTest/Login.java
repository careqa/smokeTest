//Login Test
package com.care.smokeTest.ProductionTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Login 
{
 public static void main( String[] args )
 {
             // System.out.println( "Hello World!" );
                 
             // objects and variables instantiation
             WebDriver driver = new FirefoxDriver();
             String appUrl = "https://www.care.com/login";
             
             // Wait for elements of webpage
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
             // launch the firefox browser and open the application url
             driver.get(appUrl);
             
             // maximize the browser window
             driver.manage().window().maximize();
             
               // declare and initialize the variable to store the expected title of the webpage.
                      String expectedTitle = "Member Login - Care.com";
             
               // fetch the title of the web page and save it into a string variable
                      String actualTitle = driver.getTitle();
             
               // compare the expected title of the page with the actual title of the page and print the result
                      if (expectedTitle.equals(actualTitle))
                      {
                             System.out.println("Verification Successful - The correct title is displayed on the web page.");
                      }
                      else
                      {
                             System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
                      }
             
               // enter a valid username in the email textbox
                      WebElement username = driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[4]/form/div[1]/div/input"));
                      username.clear();
                      username.sendKeys("psubbarao+demo1@care.com");
             
               // enter a valid password in the password textbox
                      WebElement password = driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[4]/form/div[2]/input"));
                      password.clear();
                      password.sendKeys("test1234");
             
               // click on the Sign in button
                      WebElement SignInButton = driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[4]/form/button"));
                      SignInButton.click();
             
               // Check Login
                      
               // Check Logout
                      
               // close the web browser
                      driver.close();
                      System.out.println("Test script executed successfully.");
             
               // terminate the program
                      System.exit(0);

 }
}
