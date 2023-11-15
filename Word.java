package Lab5;

public class Word implements SentenceMember {
//    private String wordString;
    private Letter[] letters;

    public Word(String wordString){
        letters = new Letter[wordString.length()];
        for(int i=0; i<wordString.length(); i++){
            letters[i] = new Letter(wordString.charAt(i));
        }
    }
    public Word(Letter[] letters){
        this.letters = letters;
    }
    @Override
    public String toString(){
        StringBuilder wordString = new StringBuilder();
        for(Letter letter : letters){
            wordString.append(letter);
        }

        return wordString.toString();
    }
    public Letter[] getLetters(){
        return letters;
    }
}
