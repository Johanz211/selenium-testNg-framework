package com.framwork.selenium.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumIntro
{
    public static void main(String[] args) {
        WebDriver safariDriver = new SafariDriver();
        safariDriver.get("https://www.google.com");
    }
}
