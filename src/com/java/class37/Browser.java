package com.java.class37;

public interface Browser {

    void closeBrowser ();
    public void openIncognito();

    // Interface is used when we need to have a contract to the parent class.
    // As many as we want
    // implement the rule of the contract that you want to be followed

}
interface WebBrowser extends Browser {
    void closeBrowser();
    void openIncognito();

}
interface MobileBrowser extends Browser {
    void supportRotation();

}



class Chrome implements Browser, MobileBrowser, WebBrowser{

    @Override
    public void closeBrowser() {

    }

    @Override
    public void openIncognito() {

    }

    @Override
    public void supportRotation() {

    }
}
