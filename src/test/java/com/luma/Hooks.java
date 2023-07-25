package com.luma;

import com.luma.propertyreader.PropertyReader;
import com.luma.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends Utility {

    @Before
    public void setup() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
