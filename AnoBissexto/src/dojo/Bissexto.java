package dojo;

public class Bissexto {

	public static boolean definePrimo(int ano) {
		boolean resposta = false;
		if(ano%4 == 0) {
			if(ano%100 == 0) {
				if(ano%400 == 0) {
					resposta = true;
				}else {
					resposta = false;
				}
			}else {
				resposta = true;
			} 
		}else { 
			resposta = false; 
		}
		return resposta;
	}

}
