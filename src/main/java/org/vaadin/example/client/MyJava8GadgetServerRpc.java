package org.vaadin.example.client;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

public interface MyJava8GadgetServerRpc extends ServerRpc {

    // TODO: example API
    public void clicked(MouseEventDetails mouseDetails);
    
}
