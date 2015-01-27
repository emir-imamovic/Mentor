/**This program checks whether all brackets are properly closed */ 

package Mentor16012015;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {

		Stack<Character> open = new Stack<Character>();
		Stack<Character> closed = new Stack<Character>();
		String in = "( {[ ({ }) ] } )";
		String input = in.replaceAll("\\s+", "");

		int i;
		
		for (i = 0; i < input.length(); i++) {
			char s = input.charAt(i);
			if (s == '(' || s == '[' || s == '{')
				open.push(s);
		}

		i = (i) / 2;
		boolean is = true;

		for (int j = i; j < input.length(); j++) {

			if (open.peek() == '(' && input.charAt(i) != ')') {
				is = false;
				break;
			}

			if (open.peek() == '[' && input.charAt(i) != ']') {
				is = false;
				break;
			}

			if (open.peek() == '{' && input.charAt(i) != '}') {
				is = false;
				break;
			}
			open.pop();
			i++;

		}

		if (is)
			System.out.println("Match up");
		else
			System.out.println("Do not match");

	}
}
