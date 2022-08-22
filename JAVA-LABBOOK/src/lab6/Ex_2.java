package lab6;

import java.util.HashMap;

public class Ex_2 {
	public HashMap<Character, Integer> countCharacter(char[] arr){
		HashMap<Character,Integer> countChars=new HashMap<Character, Integer>();
		for(char character: arr) {
			if(countChars.containsKey(countChars)) {
				countChars.put(character, countChars.get(countChars)+1);
			}
			else {
				countChars.put(character, 1);
			}
		}
		return countChars;
	}

	public static void main(String[] args) {
		Ex_2 ex=new Ex_2();
		char[] arr="Welcome".toCharArray();
		System.out.println(ex.countCharacter(arr));

	}

}
