package utils;

import org.openqa.selenium.By;


public interface Locators {

    public interface Authorization {
        By nameInputLoc = input(Ids.AUTH.NAME);
        By passwordInputLoc = input(Ids.AUTH.PASSWORD);
        By enterBtnLoc = buttonName(Ids.AUTH.ENTER);
    }

    static By input(String attribute) {return By.xpath("input[id='" + attribute + "']");}
    static By buttonName(String attribute) {return By.xpath("button[name='" + attribute + "']");}
}