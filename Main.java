import java.util.regex.*;
import javax.swing.JOptionPane;

import java.util.Scanner;
public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the pattern to match:");  // ex:  ^((100)|(\d{1,2}(\.\d*)?))%$  for percentage pattern
		String pattern = scanner.nextLine();
		System.out.println("Enter the string to match:");  // ex for true: 20%, 18.3%, 100%, ex for false: 50, 101%
		String text = scanner.nextLine();
		try {
			Pattern pt = Pattern.compile(pattern);
			Matcher mt = pt.matcher(text);
			boolean result = mt.matches();
			System.out.print("The string matches to the pattern: " + result);
			JOptionPane.showMessageDialog(null, result? "match":"no match","result", result? JOptionPane.INFORMATION_MESSAGE:JOptionPane.ERROR_MESSAGE);
		}catch(java.util.regex.PatternSyntaxException e) {
			JOptionPane.showMessageDialog(null,"This is an invalid pattern!", "Invalid pattern", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
