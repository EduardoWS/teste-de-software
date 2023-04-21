package terceiro_periodo.exercicioBoliche;

import java.util.regex.Pattern;

public class Boliche2 {
	
	public boolean jogadas(String j) {
		String padraoRegex = "^[0-9X\\-\\/]{21}$";
		
		if (Pattern.matches(padraoRegex, j)) return true;
		
		return false;
	}
	

}
