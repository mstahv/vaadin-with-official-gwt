package org.vaadin.example;

import org.vaadin.example.client.MyJava8GadgetClientRpc;
import org.vaadin.example.client.MyJava8GadgetServerRpc;
import org.vaadin.example.client.MyJava8GadgetState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.AbstractComponent;

public class MyJava8Gadget extends AbstractComponent {
    
    private MyJava8GadgetServerRpc rpc = new MyJava8GadgetServerRpc() {
        private int clickCount = 0;
        
        public void clicked(MouseEventDetails mouseDetails) {
            // nag every 5:th click using RPC
            if (++clickCount % 5 == 0) {
                getRpcProxy(MyJava8GadgetClientRpc.class).alert(
                        "Ok, that's enough!");
            }
            // update shared state
            getState().text = "You have clicked a lambda powered client side widget " + clickCount + " times";
        }
    };
    
    public MyJava8Gadget() {
        registerRpc(rpc);
    }
    
    @Override
    public MyJava8GadgetState getState() {
        return (MyJava8GadgetState) super.getState();
    }
}
