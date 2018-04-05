/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * DemoHelper.java
 * Copyright (C) 2018 University of Waikato, Hamilton, NZ
 */

package com.musicg.demo;

import java.io.File;

/**
 * Helper class for demos.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 */
public class DemoHelper {

	/**
	 * Checks whether the directory exists.
	 *
	 * @param dir   the directory to check
	 * @return      true if directory exists
	 */
	public static boolean dirExists(String dir) {
		File file = new File(dir);
		return file.exists() && file.isDirectory();
	}

	/**
	 * Checks whether the file exists.
	 *
	 * @param f     the file to check
	 * @return      true if file exists
	 */
	public static boolean fileExists(String f) {
		File file = new File(f);
		return file.exists() && !file.isDirectory();
	}

	/**
	 * Returns the demo directory with the audio samples.
	 *
	 * @return      the directory
	 */
	public static String getDemoDirectory() {
		String dir = "src/site/resources/audio";
		if (dirExists(dir))
			return dir;
		dir = "audio";
		if (dirExists(dir))
			return dir;
		throw new IllegalStateException("Failed to determine directory for sample audio files!");
	}

	/**
	 * Returns the demo output directory.
	 *
	 * @return      the directory
	 */
	public static String getOutputDirectory() {
		return "out";
	}
}
