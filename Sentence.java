package Lab5;

import java.util.ArrayList;

public class Sentence {
//    private Word[] words;
    private SentenceMember[] sentenceMembers;
    public Sentence(String sentenceString){
        String[] sentenceMemberStrings = sentenceString.split("(?=\\p{Punct} ?)| ");
        sentenceMembers = new SentenceMember[sentenceMemberStrings.length];

        for(int i=0; i<sentenceMemberStrings.length; i++){
            sentenceMembers[i] = sentenceMemberStrings[i].matches("\\p{Punct}")
                    ? new Punctuation(sentenceMemberStrings[i])
                    : new Word(sentenceMemberStrings[i]);
        }
    }

    public static void findLongestPalindrome(Sentence[] sentences) {
        ArrayList<SentenceMember> allMembers = new ArrayList<>();
        for (Sentence sentence : sentences) {
            for (SentenceMember sentenceMember : sentence.sentenceMembers) {
                allMembers.add(sentenceMember);
            }
        }
        SentenceMember.findLongestPalindrome(allMembers);
    }


    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (int i = 0; i < sentenceMembers.length ; i++) {
            sentenceString.append(sentenceMembers[i].toString());
            if (i+1 < sentenceMembers.length && sentenceMembers[i + 1] instanceof Word) {
                sentenceString.append(" ");
            }
        }

//        sentenceString.deleteCharAt(sentenceString.length() - 1);
        return sentenceString.toString();
    }
}
