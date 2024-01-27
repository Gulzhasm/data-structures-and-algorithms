package leetcode.hackerRank.task;

import java.util.Arrays;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        // Given: String s = "the quick brown fox and the quick blue hare.";
        // print "the quick brown fox and blue hare."

        String s = "the quick brown fox and the quick blue hare.";
        Arrays.asList(s.split("\\s")).stream().distinct().forEach(x -> System.out.print(x + " "));

        List<String> words = List.of(s.split("\\s"));
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!result.toString().contains(word)) {
                result.append(word).append(" ");
            }
        }
        System.out.print(result + " ");
    }

}


    /*

    WebDriver webDriver = new ChromeDriver();

    List<String> actualHeaders = new ArrayList<>();
    By tableHeaders = By.xpath("//th[text()='id']/..");

    public List<WebElement> getTableHeaders() {
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
 */


