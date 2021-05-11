package att;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("baslangic");

		Letter[] letter;
		LetterOperations letterOperation = new LetterOperations();

		letter = letterOperation.createNewAlphabet();

		LetterBusiness letterBusiness = new LetterBusiness();

		Character[] alphabet = letterBusiness.letter_dictionary(3);

		for (int i = 0; i < alphabet.length; i++) {

			System.out.print(alphabet[i] + " ");
		}

		System.out.println("\n -------");

		alphabet = letterBusiness.decode(6, "abcçdefgğhıijklmnoöprsştuüvyz");

		for (int i = 0; i < alphabet.length; i++) {

			System.out.print(alphabet[i] + " ");
		}
	}
}