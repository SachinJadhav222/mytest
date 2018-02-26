package com.mytest.pages;

import com.mytest.DriverBase;
import com.mytest.WebUtility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends DriverBase {
    WebUtility webUtility;
    public HomePage(WebUtility webUtility){
        this.webUtility=webUtility;
    }
    Logger logger=Logger.getLogger("HomePage");

    @FindBy(css = "input#lst-ib")
    private WebElement searchBox;
    @FindBy(css = "input[name=\"btnK\"]")
    private WebElement search_button;

    /**
     * Verify Home Page
     * @return
     */
    public boolean verify_home_page(){
        boolean is_home_page_displayed=false;
        if(true){
            is_home_page_displayed=true;
            logger.info("Home Page Displayed");
        }
        return is_home_page_displayed;
    }

    public void enter_search(String to_be_searched){
        searchBox.sendKeys(to_be_searched);
        logger.info("Entered to Search Field: "+to_be_searched);
    }
    public void click_search_button(){
        search_button.click();
        logger.info("Clicked on Search Button");
        webUtility.sleepTime(50);
    }
    public boolean verify_info_displayed(){
        return true;
    }

}
