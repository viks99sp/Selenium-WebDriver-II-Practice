package com.pages;

import testframework.PropertiesManager;
import testframework.core.BaseWebPage;

public class MainPage extends BaseWebPage {

    public MainPage(String pageSpecificUrl) {
        super(pageSpecificUrl);
    }

    @Override
    public String getBasePageUrl() {
        return PropertiesManager.getConfigProperties().getProperty("jiraLoginUrl");
    }
}
