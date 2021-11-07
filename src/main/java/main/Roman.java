package main;

public class Roman {
	
	public Roman() {
		
	}
	
	/**
	 * Converts an Arabic number into a Roman number.
	 * 
	 * @param arabicNumber The Arabic number to convert.
	 * @return The corresponding Roman number as String.
	 */

	public static String toRoman(int arabicNumber) {

		if(arabicNumber == 1)
			return "I";

		if(arabicNumber < 4)
			return "I".concat(toRoman(arabicNumber--));


		// TODO implement this method incrementally using TDD
		return "";
	}
}
