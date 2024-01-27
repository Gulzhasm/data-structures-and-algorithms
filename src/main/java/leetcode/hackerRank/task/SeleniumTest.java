package leetcode.hackerRank.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumTest {
    WebDriver webDriver = new ChromeDriver();

    List<String> actualHeaders = new ArrayList<>();
    By tableHeaders = By.xpath("//th[text()='id']/..");

 /*   public List<WebElement> getTableHeaders() {
        //TODO find elements of grid headers
        return null;
    }

    public void getTableHeadersText() {
        //TODO get headers element text
    }

    public boolean validateTableHeadersPresence(List<String> expectedHeaders) {
        //TODO assert actual headers text vs expected headers text
        return false;
    }
}

*/
    public List<WebElement> getTableHeaders() {
        return webDriver.findElements(tableHeaders);
    }

    public void getTableHeadersText() {
        for (WebElement header : getTableHeaders()) {
            actualHeaders.add(header.getText());
        }
    }

    public boolean validateTableHeadersPresence(List<String> expectedHeaders) {
        return actualHeaders.equals(expectedHeaders);
    }

}
