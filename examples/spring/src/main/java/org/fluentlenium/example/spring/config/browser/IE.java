package org.fluentlenium.example.spring.config.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IE implements IBrowser {

    @Override
    public Capabilities getBrowserCapabilities() {
        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.destructivelyEnsureCleanSession();
        return internetExplorerOptions;
    }

    @Override
    public String getDriverExecutableName() {
        return "IEDriverServer";
    }

    @Override
    public String getDriverSystemPropertyName() {
        return "webdriver.ie.driver";
    }
}
