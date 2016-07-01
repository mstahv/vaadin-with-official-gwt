package org.vaadin.example.client;

import org.vaadin.example.MyJava8Gadget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.vaadin.client.MouseEventDetailsBuilder;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.ui.Connect;

@Connect(MyJava8Gadget.class)
public class MyJava8GadgetConnector extends AbstractComponentConnector {
    
    private MyJava8GadgetServerRpc rpc = RpcProxy.create(MyJava8GadgetServerRpc.class, this);
    
    public MyJava8GadgetConnector() {
        registerRpc(MyJava8GadgetClientRpc.class, (MyJava8GadgetClientRpc) (String message) -> {
            // TODO: Do something useful
            Window.alert(message);
        });

        // Yes, with GWT 2.8 we can use Lambda expressions and Java 8
        getWidget().addClickHandler((ClickEvent event) -> {
            final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                    .buildMouseEventDetails(event.getNativeEvent(),
                            getWidget().getElement());
            rpc.clicked(mouseDetails);
        });
    }
    
    @Override
    public MyJava8GadgetWidget getWidget() {
        return (MyJava8GadgetWidget) super.getWidget();
    }
    
    @Override
    public MyJava8GadgetState getState() {
        return (MyJava8GadgetState) super.getState();
    }
    
    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);

        // TODO: do something useful
        final String text = getState().text;
        getWidget().setText(text);
    }
}
