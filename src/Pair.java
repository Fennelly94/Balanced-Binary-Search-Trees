public class Pair implements Comparable<Pair> {
	private String spanishWord;
	private String englishTranslation;

	public Pair(String spanishWord, String englishTranslation) {
		this.spanishWord = spanishWord;
		this.englishTranslation = englishTranslation;
	}

	public String getSpanishWord() {
		return spanishWord;
	}

	public String getEnglishTranslation() {
		return englishTranslation;
	}

	@Override
	public int compareTo(Pair o) {
		Pair p = (Pair) o;
		return spanishWord.compareTo(p.getSpanishWord());
	}

	// Searches for the word by looking for the Spanish word until it finds a
	// match
	// where it equals a word in the text file.
	@Override
	public boolean equals(Object obj) {
		Pair p = (Pair) obj;
		return spanishWord.equals(p.getSpanishWord());
	}

	public String toString() {
		return spanishWord + "\t" + englishTranslation;
	}

}