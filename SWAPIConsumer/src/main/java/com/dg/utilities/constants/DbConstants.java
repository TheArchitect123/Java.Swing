package com.dg.utilities.constants;

import com.dg.utilities.helpers.FileHelper;

public final class DbConstants {
	public static String databasePath = FileHelper.getDataDirectory().getAbsolutePath().concat("SWAPI.db3");
}
