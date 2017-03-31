
public class CharacterCounter {

	public static void main(String[] arguments)
	{
		String[] tvShows = {
			"The Unbreakable Kimmy Schmidt",
			"Love",
			"Black Mirror",
			"The OA",
			"Stranger Things" };
		
		for (int i=0; i<tvShows.length; i++)
		{
			System.out.println(tvShows[i]);
			System.out.println(DisplayPhraseCharIndex());
			System.out.println(DisplayPhraseCharCount(GetPhraseCharCount(tvShows[i])));
		}
		
	}
	
	private static int[] GetPhraseCharCount(String show)
	{
		int[] charCount = new int[26];
		char[] letters = show.toLowerCase().toCharArray();
		
		if (show.length() != 0)
		{
			for (int i=0; i<letters.length; i++ )
			{
				char letter = letters[i];
				if ( 'a' <= letter && letter <= 'z')
				{
					charCount[letter-'a']++;
				}
			}
		}
		
		return charCount;
	}
	
	private static String DisplayPhraseCharIndex()
	{
		return " [A] [B] [C] [D] [E] [F] [G] [H] [I] [J] [K] [L] [M] [N] [O] [P] [Q] [R] [S] [T] [U] [V] [W] [X] [Y] [Z]";
	}
	
	private static String DisplayPhraseCharCount(int[] letters)
	{
		String result = "";
		
		if (letters.length != 0)
		{
			for (int i=0; i<letters.length; i++)
			{
				result += "[" + String.format("% 2d",letters[i]) + "]";
			}
		}
		
		return result;
	}
}
