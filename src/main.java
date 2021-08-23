import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args)
	{
		String name =JOptionPane.showInputDialog("Enter your name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));	
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		String food =JOptionPane.showInputDialog("What's your favoriate food?");
		JOptionPane.showMessageDialog(null,  "Hello " + name );
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");	
		JOptionPane.showMessageDialog(null,  "Your favoriate food is: " + food );
		
		
	}	
}
