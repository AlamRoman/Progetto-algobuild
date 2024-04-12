package main;

import model.Exceptions;
import model.Components.ComponentDeclaration;
import model.Components.ComponentEnd;
import model.Components.ComponentStart;
import model.Components.Condition;

public class Main {

	public static void main(String[] args) {
		Condition C = new Condition(null, "cia1o", "==", "cia1o");
		try {
			System.out.println(C.resolve());
		} catch (Exceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}