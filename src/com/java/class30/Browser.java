package com.java.class30;

class Browser {
    void openIncognitoWindow (){
        System.out.println("CTRL + T");
    }
}

class Chrome extends Browser{
    void openIncognitoWindow (){
        System.out.println("CTRL + Shift + N");

    }
}
class FireFox extends Browser{
    void openIncognitoWindow (){
        System.out.println("CTRL + Shift + P");
    }
}
