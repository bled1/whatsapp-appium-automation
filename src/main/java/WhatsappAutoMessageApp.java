
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.windows.WindowsDriver;

public class WhatsappAutoMessageApp {
  private static WindowsDriver driver = null;
  public static void main(String[] args) throws IOException {

    //Runtime.getRuntime().exec("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe", null, new File("C:\\Program Files\\Windows Application Driver"));

    Desktop.getDesktop().open(new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe"));

    DesiredCapabilities capabilities = new DesiredCapabilities();
    // get app ID from powershell using Get-StartApps
    capabilities.setCapability("app", "5319275A.WhatsAppDesktop_cv1g1gvanyjgm!App");
    driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    //AutomationId	SearchQueryTextBoxvAutomationId	TitleAutomationId	TextBoxAutomationId	RightButton

    driver.findElementByAccessibilityId("SearchQueryTextBox").sendKeys("dishepujt");
    driver.findElementByAccessibilityId("Title").click();
    driver.findElementByAccessibilityId("TextBox").sendKeys(GetQuotes.getRandomQuote());
    driver.findElementByAccessibilityId("RightButton").click();

    Runtime.getRuntime().exec("taskkill /F /IM WinAppDriver.exe");
    //driver.quit();

  }
}
