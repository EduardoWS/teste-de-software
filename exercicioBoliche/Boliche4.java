package terceiro_periodo.exercicioBoliche;

import java.util.regex.Pattern;

public class Boliche4 {
	
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
	
	
	
	public int calculaX(int i, String pontuacao) {
		int total = 0;
		for (int j = i; j < 19; j++) {
			if (pontuacao.charAt(j+2) == 'X') {
				total = total +10;
			}
			else {
				char c = pontuacao.charAt(j+2);
				total = total + Character.getNumericValue(c);
				break;
			}
			j++;
		}
		
		//System.out.println("total: " + (total+10));
		return total;
	}
	
	
	
	
	public int computaPlacar(String pontuacao) {
		int pontuacaoTotal = 0;
	    //int bonus = 1;
	    for (int i = 0; i < pontuacao.length(); i++) {
	    	System.out.println(pontuacaoTotal);
	        char c = pontuacao.charAt(i);
	        if (Character.isDigit(c)) {
	        	if (i < 20 && pontuacao.charAt(i+1) != '/') {
	        		pontuacaoTotal += Character.getNumericValue(c);
	        	}
	        	
	            if (i>1 && i % 2 == 0 && pontuacao.charAt(i - 1) == '/') {	// Se for par E a jogada anterior for /
	                pontuacaoTotal += Character.getNumericValue(c);
	                
	            }
	            
	            //if ( i > 1 && pontuacao.charAt(i - 2) == 'X' ) {
                    //pontuacaoTotal += Character.getNumericValue(c);
                    //bonus = 1;
                    
                //}
	            
	            
	            
	            
	            
	            
	            
	        } else if (c == 'X') {
	            pontuacaoTotal += 10 + calculaX(i, pontuacao);
	            
	            if (i < 19) {
	                //if (pontuacao.charAt(i - 2) == 'X') {
	                    //pontuacaoTotal += 10;
	                    //bonus = 2;
	                    
	                    
	                    
	                //}
	                if (pontuacao.charAt(i - 1) == '/') {
	                    pontuacaoTotal += 10;
	                    
	                }
	                
	                
	                
	                
	            } else if (i == 19) {
	                pontuacaoTotal += 20;
	                
	            } else if (i == 20) {
	                pontuacaoTotal += 10;
	                
	            }
	            

	        } else if (c == '/') {
	            pontuacaoTotal += 10;
	            
               
	        } 
	        
	    }
	    //System.out.println(pontuacaoTotal);
	    return pontuacaoTotal;
	}

}
