//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
 if(randomNumber == 0) {
	 JOptionPane.showMessageDialog(null, "reeeeeee");
 }
 if(randomNumber == 1) {
	 JOptionPane.showMessageDialog(null, "noooooooooo");
 }
 if(randomNumber == 2) {
	 JOptionPane.showMessageDialog(null, "ok");
 }
 if(randomNumber == 3) {
	 JOptionPane.showMessageDialog(null, "nok");
 }
 if(randomNumber == 4) {
	 JOptionPane.showMessageDialog(null, "bok");
 }
 if(randomNumber == 5) {
	 JOptionPane.showMessageDialog(null, "lok");
 }
		// 2. Repeat all the code above 10 times
 
 
		 if (randomNumber ==0) {
			 for( int i=0; i < 10; i++) {
				 JOptionPane.showMessageDialog(null, "reeee?");
			 }
		 }
		 if (randomNumber ==1) {
			 for( int i=0; i < 10; i++) {
				 JOptionPane.showMessageDialog(null, "reeee.");
			 }
		 }
		 if (randomNumber ==2) {
			 for( int i=0; i < 10; i++) {
				 JOptionPane.showMessageDialog(null, "reeee,");
			 }
		 }
		 if (randomNumber ==3) {
			 for( int i=0; i < 10; i++) {
				 JOptionPane.showMessageDialog(null, "reeee!");
			 }
		 }
		 if (randomNumber ==4) {
			 for( int i=0; i < 10; i++) {
				 JOptionPane.showMessageDialog(null, "reeee'");
			 }
		 }
		 if (randomNumber ==5) {
			 for( int i=0; i < 10; i++) {
				 JOptionPane.showMessageDialog(null, "reeeex");
			 }
		 }
		// 3. Find someone to test out your program. They will like it :)
	}
}
