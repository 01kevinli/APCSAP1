//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover first = new LetterRemover("I am Sam I am",'a');
		out.println(first);
		LetterRemover snd = new LetterRemover("ssssssssxssssesssssesss",'s');
		out.println(snd);
		LetterRemover thd = new LetterRemover("qwertyqwertyqwerty",'a');
		out.println(thd);
		LetterRemover fthw = new LetterRemover("abababababa",'b');
		out.println(fthw);
		LetterRemover sx = new LetterRemover("abaababababa",'x');
		out.println(sx);
		
		
											
	}
}