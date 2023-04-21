package terceiro_periodo.exercicioBoliche;

import java.util.regex.Pattern;

public class Boliche3 {
	
	public boolean jogadas(String j) {
		String padraoRegex = "^[0-9X\\-\\/]{21}$";
		
		if (Pattern.matches(padraoRegex, j)) {
			for (int i = 0; i < j.length(); i++) {
			    if (j.charAt(i) == 'X') {
			        if (i % 2 == 1) return false;
			        if (i == 18 && (j.charAt(i+1) == '-' || j.charAt(i+2) == '-')) return false;
			        if (i != 18 && j.charAt(i+1) != '-') return false;
					
			    }
			    if (j.charAt(i) == '-') {
			    	if (i % 2 == 0 && i != 20) return false;
			    	if (j.charAt(i-1) != 'X' && i != 20) return false;
			    }
			    
			    if (j.charAt(i) == '/') {
			    	if (i % 2 == 0 && i != 20) return false;
			    	if (i == 19 && j.charAt(i+1) == '-') return false;
			    }
			    
			}
			return true;
			
		}
		
		return false;
	}

}
