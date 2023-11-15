package Lab5;

public class Punctuation implements SentenceMember{
    private final String symbolsString;
    private static final String PUNCTUATION_VARIANTS_STRING = ",...:;\"'!?";

    public Punctuation(String symbolsString) {
        for (int i = 0; i < symbolsString.length(); i++) {
            if (!PUNCTUATION_VARIANTS_STRING
                    .contains("" + /*Character.toString(*/symbolsString.charAt(i)/*)*/)) {
                System.out.println("!!! Error, wrong argument for punctuation creation '" + symbolsString + "'.");
            }
        }
        this.symbolsString = symbolsString;
    }

    @Override
    public String toString() {
        return symbolsString;
    }
}
