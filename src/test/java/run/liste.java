package run;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import commonClass.Usability;

public class liste extends Usability implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		System.out.println("Test Failed" +" "+ result.getName());
		this.driver=((Usability)result.getInstance()).driver;
		 Date dt= new Date();
			String timeStamp= dt.toString().replace(" ", "_").replace(":","_");
			File shots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(shots,new File("C:\\Users\\sumer\\eclipse-workspace\\Practice\\Pictures\\Failed\\"+timeStamp+".png") );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}

	
}
