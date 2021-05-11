package att;

public class LetterBusiness {

	Letter[] letter;
	LetterOperations letterOperation = new LetterOperations();

	// letter_dictionary fonksiyonu otelenmis yeni alfabe olusturur
	public Character[] letter_dictionary(int value) {
		int i = 0;
		letter = letterOperation.createNewAlphabet();
		Character[] newAlphabetArray = new Character[letter.length];

		while (i < letter.length) {

			if (value > newAlphabetArray.length) {

				value = value % newAlphabetArray.length;
			}

			if (value < letter.length) {
				newAlphabetArray[i] = letter[value].letter;
			} else {
				value = 0;
				continue;
			}
			i++;
			value++;
		}
		return newAlphabetArray;
	}

	// encode fonksiyonu matematiksel islemi
	public Character[] encode(int value, String str) {

		int i = 0;

		char[] strToChrArray = new char[str.length()];
		letter = letterOperation.createNewAlphabet();

		for (i = 0; i < str.length(); i++) {
			strToChrArray[i] = str.charAt(i);
		}

		i = 0;

		Character[] newAlphabetArray = new Character[strToChrArray.length];

		if (value > letter.length) {

			value = value % letter.length;
		}

		while (i < strToChrArray.length) {

			int letterValueIndex = 0;

			for (int j = 0; j < letter.length; j++) {

				if (strToChrArray[i] == letter[j].letter) {

					letterValueIndex = letter[j].value;
				}

			}

			if (letterValueIndex + value > letter.length) {

				newAlphabetArray[i] = letter[(letterValueIndex + value) % newAlphabetArray.length - 1].letter;
			} else {

				newAlphabetArray[i] = letter[letterValueIndex + value - 1].letter;
			}

			i++;
		}

		return newAlphabetArray;
	}

	// decode fonksiyonu matematiksel işlemi
	public Character[] decode(int value, String str) {

		int i = 0;

		char[] strToChrArray = new char[str.length()];
		letter = letterOperation.createNewAlphabet();

		for (i = 0; i < str.length(); i++) {
			strToChrArray[i] = str.charAt(i);
		}

		i = 0;

		Character[] newAlphabetArray = new Character[strToChrArray.length];

		if (value > letter.length) {

			value = value % letter.length;
		}

		while (i < strToChrArray.length) {

			int x = 0;

			for (int j = 0; j < letter.length; j++) {

				if (strToChrArray[i] == letter[j].letter) {

					x = letter[j].value;
				}

			}

			if (x - value <= 0) {

				newAlphabetArray[i] = letter[(letter.length - Math.abs(x - value)-1)].letter;
			} else {

				newAlphabetArray[i] = letter[x - value - 1].letter;
			}

			i++;
		}

		return newAlphabetArray;
	}
}