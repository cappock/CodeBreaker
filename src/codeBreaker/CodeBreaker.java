package codeBreaker;

import java.util.ArrayList;


public class CodeBreaker {

	public static void main(String[] args) {
	}
	
	public String confirmar(int[] r) {
		String respuesta = "";
		
		if(r.length != 4) {
			return "El array debe ser de 4 digitos";
		}
 
		ArrayList<Integer> num = new ArrayList<Integer>(); 
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);

		for(int i = 0 ; i < r.length; i++ ) {
			switch (i) {
			case 0:
				if(r[i]==num.get(0)) {
					respuesta=respuesta+" X";
				}else if(num.contains(r[i])){
					respuesta =respuesta + " _";

				}
				break;
			case 1:
				if(r[i]==num.get(1)) {
					respuesta=respuesta+" X";
				}else if(num.contains(r[i])){
					respuesta =respuesta + " _";
				}
				break;
			case 2:
				if(r[i]==num.get(2)) {
					respuesta=respuesta+" X";
				}else if(num.contains(r[i])){
					respuesta =respuesta + " _";
				}
				break;
			case 3:
				if(r[i]==num.get(3)) {
					respuesta=respuesta+" X";
				}else if(num.contains(r[i])){
					respuesta =respuesta + " _";
				}
				break;
			}			
		}
		return respuesta;
	}

}
