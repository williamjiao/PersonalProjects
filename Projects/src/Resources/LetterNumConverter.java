package Resources;
import java.util.HashMap;
import java.util.ArrayList;
public class LetterNumConverter {

	public static HashMap<Integer, String> NUMSANDLETTERS = new HashMap<Integer, String>();
	public static HashMap<String, Integer> LETTERSANDNUMS = new HashMap<String, Integer>();

	static
	{
		NUMSANDLETTERS.put(new Integer(1), "a");
		NUMSANDLETTERS.put(new Integer(2), "b");
		NUMSANDLETTERS.put(new Integer(3), "c");
		NUMSANDLETTERS.put(new Integer(4), "d");
		NUMSANDLETTERS.put(new Integer(5), "e");
		NUMSANDLETTERS.put(new Integer(6), "f");
		NUMSANDLETTERS.put(new Integer(7), "g");
		NUMSANDLETTERS.put(new Integer(8), "h");
		NUMSANDLETTERS.put(new Integer(9), "i");
		NUMSANDLETTERS.put(new Integer(10), "j");
		NUMSANDLETTERS.put(new Integer(11), "k");
		NUMSANDLETTERS.put(new Integer(12), "l");
		NUMSANDLETTERS.put(new Integer(13), "m");
		NUMSANDLETTERS.put(new Integer(14), "n");
		NUMSANDLETTERS.put(new Integer(15), "o");
		NUMSANDLETTERS.put(new Integer(16), "p");
		NUMSANDLETTERS.put(new Integer(17), "q");
		NUMSANDLETTERS.put(new Integer(18), "r");
		NUMSANDLETTERS.put(new Integer(19), "s");
		NUMSANDLETTERS.put(new Integer(20), "t");
		NUMSANDLETTERS.put(new Integer(21), "u");
		NUMSANDLETTERS.put(new Integer(22), "v");
		NUMSANDLETTERS.put(new Integer(23), "w");
		NUMSANDLETTERS.put(new Integer(24), "x");
		NUMSANDLETTERS.put(new Integer(25), "y");
		NUMSANDLETTERS.put(new Integer(0), "z");
		
		LETTERSANDNUMS.put("a", new Integer(1));
		LETTERSANDNUMS.put("b",new Integer(2));
		LETTERSANDNUMS.put("c",new Integer(3));
		LETTERSANDNUMS.put("d",new Integer(4));
		LETTERSANDNUMS.put("e",new Integer(5));
		LETTERSANDNUMS.put("f",new Integer(6));
		LETTERSANDNUMS.put("g",new Integer(7));
		LETTERSANDNUMS.put("h",new Integer(8));
		LETTERSANDNUMS.put("i",new Integer(9));
		LETTERSANDNUMS.put("j",new Integer(10));
		LETTERSANDNUMS.put("k",new Integer(11));
		LETTERSANDNUMS.put("l",new Integer(12));
		LETTERSANDNUMS.put("m",new Integer(13));
		LETTERSANDNUMS.put("n",new Integer(14));
		LETTERSANDNUMS.put("o",new Integer(15));
		LETTERSANDNUMS.put("p",new Integer(16));
		LETTERSANDNUMS.put("q",new Integer(17));
		LETTERSANDNUMS.put("r",new Integer(18));
		LETTERSANDNUMS.put("s",new Integer(19));
		LETTERSANDNUMS.put("t",new Integer(20));
		LETTERSANDNUMS.put("u",new Integer(21));
		LETTERSANDNUMS.put("v",new Integer(22));
		LETTERSANDNUMS.put("w",new Integer(23));
		LETTERSANDNUMS.put("x",new Integer(24));
		LETTERSANDNUMS.put("y",new Integer(25));
		LETTERSANDNUMS.put("z",new Integer(0));

	}
	public static int letterToNum(String letter)
	{
		return LETTERSANDNUMS.get(letter);
	
	}
	public static String numToLetter(int num)
	{
		return NUMSANDLETTERS.get(new Integer(num));
	}
	public static ArrayList<Integer> stringToNums(String toTranslate)
	{
		toTranslate = toTranslate.toLowerCase();
		ArrayList<Integer> returnInts = new ArrayList<Integer>();
		for(int i = 0; i < toTranslate.length(); i++)
		{
			if("abcdefghijklmnopqrstuvwxyz".indexOf(toTranslate.substring(i, i+1)) >= 0)
				returnInts.add(letterToNum(toTranslate.substring(i, i+1)));
				
		}
		return returnInts;
	}
	public static String numsToString(ArrayList<Integer> nums)
	{
		String returnString = "";
		for(int numIndex : nums)
			returnString += numToLetter(new Integer(numIndex));
		return returnString;
	}
	public static String frameShift(String original, int shiftNum)
	{
		ArrayList<Integer> numList = stringToNums(original);
		for(int i = 0; i < numList.size(); i++)
			numList.set(i, (numList.get(i) + shiftNum) % 26);
		return numsToString(numList);
	}
	public static ArrayList<String> returnAllShifts(String original)
	{
		ArrayList<String> returnList = new ArrayList<String>();
		for(int i = 0; i < 26; i++)
			returnList.add(frameShift(original, i));
		return returnList;
	}
	
	public static void printAllShifts(String original)
	{
		ArrayList<String> returnList = returnAllShifts(original);
		for(String shift : returnList)
			System.out.println(shift);
	}
	public static String frameShiftKeyLetter(String original, String keyLetter)
	{
		return frameShift(original, letterToNum(keyLetter));
	}
	public static String vigenere(String original, String key)
	{
		String returnString = "";
		for(int i = 0; i < original.length(); i++)
		{
			original = original.toLowerCase();
			if("abcdefghijklmnopqrstuvwxyz".indexOf(original.substring(i, i+1)) >= 0)
				returnString += frameShiftKeyLetter(original.substring(i, i+1), key.substring(i % key.length(), i % key.length() + 1));
		}
		return returnString;
	}
	public static void printVigeneres(String original, String key)
	{
		ArrayList<String> keyShifts = returnAllShifts(key);
		for(String keyShift : keyShifts)
			System.out.println(vigenere(original, keyShift));
		
	}
	public static void printCribs(String original, String guess)
	{
		printVigeneres(original.substring(0, guess.length()), guess);
	}
}

