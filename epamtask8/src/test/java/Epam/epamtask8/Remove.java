package Epam.epamtask8;

public class Remove {
	public String remove(String string) {
		int strLength = string.length();
		String res = string;
		
		if(strLength  == 1) {
			if(string.charAt(0) == 'A') {
				res = "";
			}
		}else if (strLength > 1) {
			if (string.charAt(0) == 'A' && string.charAt(1) == 'A') {
				res = string.substring(2, strLength);
			} else if (string.charAt(0) != 'A' && string.charAt(1) == 'A') {
				res = string.charAt(0) + string.substring(2, strLength);
			} else if (string.charAt(0) == 'A' && string.charAt(1) != 'A') {
				res = string.substring(1, strLength);
			}
		}
		return res;
	}
}
