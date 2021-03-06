package selenium.functions.java.methods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.functions.java.base.TestBaseSetup;

public class GetQuestionsList extends TestBaseSetup {

	public static void ExtractWebPageData(String browser, String url, String xpath) {

		initialization(browser);
		getUrl(url);
		List<WebElement> questions = driver.findElements(By.xpath(xpath));

		int count = questions.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {

			String qText = questions.get(i).getText();
			System.out.println(qText);

		}
	}

	// Main Method
	public static void main(String[] args) throws IOException {
		ExtractWebPageData("chrome", "https://www.softwaretestingo.com/infosys-selenium-interview-faq/",
				"//*[@id='genesis-content']/article/div/ul/li");

	}

}
