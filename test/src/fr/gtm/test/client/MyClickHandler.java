package fr.gtm.test.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

public class MyClickHandler implements ClickHandler {

	@Override
	public void onClick(ClickEvent event) {
		Button btn = (Button) event.getSource();
		
		Window.alert("Hello "+btn.getText()); // passer la class et récupérer via un getter!
	}

}
