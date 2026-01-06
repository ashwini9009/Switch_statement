package switch_statements;

public class Vowel_consonant {

	public static void main(String[] args) {
		char ch='z';
		
		switch(ch)
		{
		case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : 
		case 'A' : case 'E' : case 'I' : case 'O' : case 'U' :
			System.out.println("Vowel "+ch);
			break;
			default:
				System.out.println("Consonant");
			
		}

	}

}
