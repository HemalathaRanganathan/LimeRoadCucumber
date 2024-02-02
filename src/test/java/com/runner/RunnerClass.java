package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Public\\Jdk\\LimeRoad\\src\\test\\java\\com\\feature\\Limeroad.feature",
                 glue = "com.step",
                 monochrome = true,
                 dryRun = false,
                 strict = true,
                 tags= "@Regression",
                 

                 plugin = {"pretty",
		                   "html:Report/lime.html",
		                  "json:Rep/limeroad.json",
		                   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunnerClass extends BaseClass {
	@BeforeClass
	public static void browserLaunch() {
		launchBrowser("chrome");
	}
	

}
