package Lab5;


public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Hello");
        Word word2 = new Word(new Letter[]{
                new Letter('w'),
                new Letter('o'),
                new Letter('r'),
                new Letter('l'),
                new Letter('d')});

        System.out.println(word1.toString());
        System.out.println(word2.toString());

        Sentence s1 = new Sentence("The sunset is beautiful.");
        System.out.println(s1.toString());

        Text text1 = new Text("Fruits are healthy. Bananas are good, but apples are the best!");

        text1.findLongestPalindrome();

    }
}
