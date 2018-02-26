package com.mytest;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Test-Reports/Test-Report.html"},
        features = "classpath:featureFiles",
        glue = "classpath:",
        format = {"pretty", "html:target/cucumberReports/Destination"},
        tags = "@rm"
)
public class CucumberTestRunner {

    @BeforeClass
    public static void setup() throws IOException {
       new DriverBase().openBrowser();
    }

    @AfterClass
    public static void teardown() {
        new DriverBase().closeBrowser();
        Reporter.loadXMLConfig(new File("src/test/resources/extent-report-config.xml"));
        Reporter.setSystemInfo("QA Analyst :", System.getProperty("user.name"));
        Reporter.setSystemInfo("Operating System :", "Window");
        Reporter.setSystemInfo("Web Test Tool :", "Selenium WebDriver");
        Reporter.setSystemInfo("Test Browser :", "chrome");
        Reporter.setTestRunnerOutput("Test output message");
    }
}
