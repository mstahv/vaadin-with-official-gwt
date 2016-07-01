package org.vaadin.example.client;

import com.google.gwt.user.client.ui.Label;

public class MyJava8GadgetWidget extends Label {
    
    public static final String CLASSNAME = "myjava8gadget";
    
    public MyJava8GadgetWidget() {
        // setText("MyJava8GadgetWidget sets the text via MyJava8GadgetConnector using MyJava8GadgetState");
        setStyleName(CLASSNAME);
    }
    
}
