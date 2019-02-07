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

public class ReadDynamicTables extends TestBaseSetup {

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

	public static void writeToFile(String location, String wcontent) throws IOException {
		// Create File In D: Driver.
		String TestFile = location;
		File FC = new File(TestFile);// Created object of java File class.
		FC.createNewFile();// Create file.

		// Writing In to file.
		// Create Object of java FileWriter and BufferedWriter class.
		FileWriter FW = new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write(wcontent); // Writing In To File.
		BW.newLine();// To write next string on new line.
		BW.write("This Is Second Line."); // Writing In To File.
		BW.close();
	}

	public static void readTableData(String browser, String url, String xpt1, String xpt2) {

		initialization(browser);
		getUrl(url);

		

		// Creating a list of type WebElement to store all the Link elements in to it.
		WebElement table1 = driver.findElement(By.xpath(xpt1));
		List<WebElement> tvalues = table1.findElements(By.xpath(xpt2));
		int count = tvalues.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String runs = tvalues.get(i).getText();
			System.out.println(runs);
		}
	}

	// Main Method
	public static void main(String[] args) throws IOException {
		// ExtractWebPageData("chrome",
		// "https://www.softwaretestingo.com/infosys-selenium-interview-faq/",
		// "//*[@id='genesis-content']/article/div/ul/li");

		readTableData("chrome", "https://www.cricbuzz.com/profiles/1413/virat-kohli", "//*[@id='playerProfile']/div[2]/div[2]/div", "//*[@class='text-right']|//*[@class='cb-plyr-tbody text-right']");
		
		// writeToFile("C:\\Users\\shaikh.mohammad.rafi", "qtext");

	}

}
