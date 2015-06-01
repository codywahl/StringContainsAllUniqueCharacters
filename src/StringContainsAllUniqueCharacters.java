import java.util.Vector;

/**
 * 
 */

/**
 * @author cwahl
 *
 */
public class StringContainsAllUniqueCharacters {
	private static final int ASCII_CHARACTER_COUNT = 128;
	private static final String WELCOME_MESSAGE = "--    ASCII unique character string analyzer.   --\n--Checks if all unique ASCII characters are used--";
	private static final String INPUT_QUESTION = "Please enter a string to examine: ";
	private static final String ENTER_ANOTHER_STRING_QUESTION = "Would you like to enter another string? y/n: ";

	public static void main(String[] args) 
	{
		boolean keepRunning = false;
		
		do{
			String input = "";
			Vector<Character> charVector = new Vector<Character>();
			
			System.out.println(StringContainsAllUniqueCharacters.WELCOME_MESSAGE);
			System.out.print(StringContainsAllUniqueCharacters.INPUT_QUESTION);
			input = System.console().readLine();
			
			if(input.length() < 128)
			{
				System.out.println("There were only " + input.length() + " characters in that string. There are 128 unique ASCII characters.");
			}
			else
			{		
				for (int i = 0; i < input.length(); i++)
				{
					if(!charVector.contains(input.charAt(i)))
					{
						charVector.add(input.charAt(i));
					}
				}
				
				if(charVector.size() == 128)
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
				System.out.print()
			}while(!validInput);
			
			
		}while (keepRunning);
	}

}
