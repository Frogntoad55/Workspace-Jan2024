//Taye Mansour 1/15/24 Pick#Game
package ch1waa1;

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		System.out.println("Pick a number 1-10");
		JOptionPane.showMessageDialog(null,"The number is "+
				(1 + (int)(Math.random() * 10)));

	}

}
