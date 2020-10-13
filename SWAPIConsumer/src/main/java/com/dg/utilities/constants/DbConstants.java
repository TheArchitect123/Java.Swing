package com.dg.utilities.constants;

import java.io.FileNotFoundException;

import com.dg.utilities.helpers.FileHelper;

public final class DbConstants {
	public static String databasePath() { 
		String databasePathResult = "";
		try {databasePathResult = FileHelper.getDataDirectory().getAbsolutePath().concat("SWAPI.db3");
		}
		catch (FileNotFoundException fileException) {
			//Write some entries into the Logger Service

		}

		catch (Exception otherException) {

			//If any error occurs here besides a missing file exception then make sure to log the results, and propogate an exception to the client to handle
			throw otherException;
		}

		return databasePathResult;
	}
}
