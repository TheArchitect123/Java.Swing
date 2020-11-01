package com.dg.client.components.frames;

import javax.swing.JFrame;
import com.dg.client.view_models.LoginViewModel;

import eu.lestard.easydi.EasyDI;

public class ApplicationShell extends JFrame {
	private EasyDI mainiOCContainer;
	
	public ApplicationShell(){
		if(mainiOCContainer == null) //initialize the iOC Container if it does not yet exist
			mainiOCContainer = new EasyDI();

		registerViewModels();
		registerServices();
		setUpDatabase();
	}

	public void registerViewModels() {

		//Register all the view models related to the business logic
		
		mainiOCContainer.markAsSingleton(LoginViewModel.class);
	}

	public void registerServices() {

	}

	public void setUpDatabase() {

	}
}
