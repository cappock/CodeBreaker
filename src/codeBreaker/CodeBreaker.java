package codeBreaker;

import java.util.ArrayList;


public class CodeBreaker {
	
	
	private ArrayList<Integer> numToGuess;
	
	public static void main(String[] args) {
		
	}
	
	public CodeBreaker(int num) {
		numToGuess = new ArrayList<Integer>();
		numToGuess.add(num/1000 % 10);
		numToGuess.add(num/100 % 10);
		numToGuess.add(num/10 % 10);
		numToGuess.add(num % 10);
	}
	
	public CodeBreaker() {
		numToGuess = new ArrayList<Integer>();
		numToGuess.add(1);
		numToGuess.add(2);
		numToGuess.add(3);
		numToGuess.add(4);
	}
	
	
	
	public String confirmar(int[] r) {
		String respuesta = "";
		String countEmpty = "";
		if(r.length != 4) {
			return "El array debe ser de 4 digitos";
		}
 
		for(int i = 0 ; i < r.length; i++ ) {
			switch (i) {
			case 0:
				if(r[i]==numToGuess.get(0)) {
					respuesta="X"+respuesta;
				}else if(numToGuess.contains(r[i])){
					respuesta =respuesta + "_";
				}else {
					countEmpty += " ";
				}
				break;
			case 1:
				if(r[i]==numToGuess.get(1)) {
					respuesta= "X"+respuesta;
				}else if(numToGuess.contains(r[i])){
					respuesta =respuesta + "_";
				}else {
					countEmpty += " ";
				}
				break;
			case 2:
				if(r[i]==numToGuess.get(2)) {
					respuesta="X"+respuesta;
				}else if(numToGuess.contains(r[i])){
					respuesta =respuesta + "_";
				}else {
					countEmpty += " ";
				}
				break;
			case 3:
				if(r[i]==numToGuess.get(3)) {
					respuesta="X"+respuesta;
				}else if(numToGuess.contains(r[i])){
					respuesta =respuesta + "_";
				}else {
					countEmpty += " ";
				}
				break;
			}			
		}
		
		respuesta = respuesta + countEmpty;
		return respuesta;
	}

}
