package de.valkotolle.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import de.valkotolle.base.Page;

public class Utilities extends Page {

	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "/target/surefire-reports/html/" + screenshotName));

	}

	@DataProvider(name="dp")
	public Object[][] getData(Method m) {

		// Tabellenblattname in Exceldatei muss mit 
		// Methodenname übereinstimmen (UC/LC egal)!! (loginTest, createAccountTest, ...
		String sheetName = m.getName();
		System.out.println("sheetName: "+sheetName);
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1]; // für jede Zeile (2,3,..) wird eine Hashtable erzeugt,
		
		// für jede Zeile ein Hashtable erzeugen
		Hashtable<String, String> table = null;
		
		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
			
			table = new Hashtable<String,String>();

			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]
				//              -------- key value -------------         ----------- data value ---------------            
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}

		}

		return data;

	}
	
	
	public static boolean isTestRunnable(String testName, ExcelReader excel){
		
		String sheetName="test_suite";
		int rows = excel.getRowCount(sheetName);
		
//		System.out.println("testName: " + testName);
		
		for(int rNum=2; rNum<=rows; rNum++){
			
			String testCase = excel.getCellData(sheetName, "TCID", rNum);
			
			if(testCase.equalsIgnoreCase(testName)){
				
				String runmode = excel.getCellData(sheetName, "Runmode", rNum);

//				System.out.println("runmode: " + runmode);
				
				if(runmode.equalsIgnoreCase("Y"))
					return true;
				else
					return false;
			}
			
			
		}
		return false;
	}
	
}
