package att;

public class LetterOperations {

	// Letter classından olusturulan nesnelerde karakter ve degerlerin tutulması

	Character[] alphabet = { 'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
			'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z' };

	public Letter[] createNewAlphabet() {

		Letter[] letters = new Letter[this.alphabet.length];
		int value = 0;

		for (int i = 0; i < this.alphabet.length; i++) {

			value = i;

			letters[i] = new Letter();
			letters[i].letter = this.alphabet[i];
			letters[i].value = value + 1;
		}
		return letters;
	}
}
