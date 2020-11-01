package com.dg.client;

import javax.swing.JFrame;

//Custom Packages
import com.dg.client.components.frames.ApplicationShell;
import com.dg.utilities.constants.AppInformation;

public class Main {

	///The main shell acts as the initial shell of the application -- used as the main window to manage the entire app
	//It will handle navigation 
	private static ApplicationShell mainShell;

	private static void initializeApplicationShell() {
		mainShell = new ApplicationShell();		

		configureApplicationShell();
	}

	private static void configureApplicationShell() {
		mainShell.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Set the closing operation that happens when this frame is closed
		mainShell.setSize(500, 500);
		mainShell.setTitle(AppInformation.appname);

		//Set up the background color of this frame
		mainShell.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeApplicationShell();
	}
}

