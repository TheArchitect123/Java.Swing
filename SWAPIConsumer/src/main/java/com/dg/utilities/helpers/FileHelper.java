package com.dg.utilities.helpers;

import java.io.File;
import java.io.FileNotFoundException;

public final class FileHelper {
	public static File getApplicationDirectory()  { 
		return new File(System.getProperty("user.dir"));
	}

	public static File getDataDirectory() {
		return new File(getApplicationDirectory().getAbsolutePath().concat("/ApplicationData/"));
	}
}
