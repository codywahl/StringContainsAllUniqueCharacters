import java.util.Vector;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author cwahl
 *
 */
public class StringContainsAllUniqueCharacters {
	private static final int ASCII_CHARACTER_COUNT = 128;
	private static final String WELCOME_MESSAGE = "--    ASCII unique, printable character string analyzer.   --\n--Checks if all unique ASCII characters are used--";
	private static final String INPUT_QUESTION = "Please enter a string to examine: ";
	private static final String ENTER_ANOTHER_STRING_QUESTION = "Would you like to enter another string? y/n: ";

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = false;
		
		System.out.println(StringContainsAllUniqueCharacters.WELCOME_MESSAGE);
		
		do{
			System.out.println(StringContainsAllUniqueCharacters.INPUT_QUESTION);

			String input = "";
			Vector<Integer> charVector = new Vector<Integer>();
			
			input = scanner.nextLine();

			if(input.length() < StringContainsAllUniqueCharacters.ASCII_CHARACTER_COUNT)
			{
				System.out.println("There were only " + input.length() + " characters in that string. There are " + StringContainsAllUniqueCharacters.ASCII_CHARACTER_COUNT + " unique, printable ASCII characters.");
			}
			else
			{
				for (int i = 0; i < input.length(); i++)
				{
					int intValueOfChar = (int)input.charAt(i);
					
					if(intValueOfChar >= 0 && intValueOfChar <= 127)
					{
						if(!charVector.contains(intValueOfChar))
						{
							charVector.add(intValueOfChar);
						}
					}
				}
				
				if(charVector.size() == StringContainsAllUniqueCharacters.ASCII_CHARACTER_COUNT)
				{
					System.out.println("All 128 unique ASCII characters were found in your string!");
				}
				else
				{
					System.out.println("Only " + charVector.size() + "/128 unique ASCII characters were found in your string.");
				}
			}
			
			boolean validInput = false;
			
			do
			{
				System.out.print(StringContainsAllUniqueCharacters.ENTER_ANOTHER_STRING_QUESTION);
				
				scanner = new Scanner(System.in);
				input = scanner.nextLine();
				
				if(input.equalsIgnoreCase("y"))
				{
					validInput = true;
					keepRunning = true;
				}
				else if (input.equalsIgnoreCase("n"))
				{
					validInput = true;
					keepRunning = false;
				}
			}while(!validInput);
		}while (keepRunning);
		
		System.out.println("Exiting...");
		
		scanner.close();
	}

}
