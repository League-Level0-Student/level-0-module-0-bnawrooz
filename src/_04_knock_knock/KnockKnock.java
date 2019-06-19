package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {

		String KnockKnock = JOptionPane.showInputDialog("What day is today");
		if (KnockKnock.equals("Tuesday")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
			String moon = JOptionPane.showInputDialog("how old is the universe?");

		if (moon.equals("14 billion")) {
			JOptionPane.showMessageDialog(null, "correct");
		} else {
		JOptionPane.showMessageDialog(null ,"wrong");
	 }
		String age = JOptionPane.showInputDialog("how old you are?");
		if (age.equals("14")||age.equals("15")) {
			JOptionPane.showMessageDialog(null, "you will get %50 dicount");
		}else {
			JOptionPane.showMessageDialog(null, "sorry we can't gave you discount");
		}
		
		
		
		
		
		
		
		
	}
}
