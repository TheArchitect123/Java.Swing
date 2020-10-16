package com.dg.client.components.frames;

import javax.swing.JFrame;
import eu.lestard.easydi.EasyDI;

public class ApplicationShell extends JFrame {
	private EasyDI _mainiOCContainer;
	
	public ApplicationShell(){
		if(_mainiOCContainer == null) //initialize the iOC Container if it does not yet exist
			_mainiOCContainer = new EasyDI();

		initializeViewModels();
		initializeServices();
		setUpDatabase();
	}

	public void initializeViewModels() {

		//Register all the view models related to the business logic
	}

	public void initializeServices() {

	}

	public void setUpDatabase() {

	}
	
	
	//Getters & Setters
	public EasyDI getApplicationiOCContainer() {
		return _mainiOCContainer;
	}
}
