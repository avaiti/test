package fr.gtm.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class TestEntryPoint implements EntryPoint, ClickHandler {
//public class TestEntryPoint implements EntryPoint{
	private static TextBox tb1 = new TextBox();
	@Override
	public void onModuleLoad() {
		/** Strategie 1
		 * doit être final pour être sure de la référence et qu'il ne s'agissent pas d'une autre textbox
		 */
		//final TextBox tb1 = new TextBox(); 
		
		
		Button btn = new Button("Afficher");
//		btn.getElement().setId("buttonId");

		RootPanel.get("container").add(tb1);
		RootPanel.get("container").add(btn);
		
//		btn.addClickHandler(new ClickHandler() {
//			
//			@Override
//			public void onClick(ClickEvent event) {
//				Window.alert("Hello "+tb1.getText());
//			}
//		});
		
		/** Strategie 2 **/
		btn.addClickHandler(this); 
		
		/** Strategie 3 
		 * On cree une class à part
		 * **/
//		btn.addClickHandler(new MyClickHandler()); 
		
	}

	@Override
	/** Strategie 2
	 * On deplace le wiget TextBox au niveau de la class
	 */
	public void onClick(ClickEvent event) {
		Window.alert("Hello "+tb1.getText());		
	}

	
}
