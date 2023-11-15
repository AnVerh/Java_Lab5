package Lab5;

import java.util.ArrayList;
import java.util.Collections;

public interface SentenceMember {

    static void findLongestPalindrome(ArrayList<SentenceMember> allMembers) {

        ArrayList<Object> lettersAndPunctuation = new ArrayList<>();
        ArrayList<Object> longestPalindrome = new ArrayList<>();
        for (SentenceMember member : allMembers) {
            if(member instanceof Word){
                for(Letter letter : ((Word) member).getLetters()){
                    lettersAndPunctuation.add(letter.toString().toLowerCase());
                }
            }
            else{lettersAndPunctuation.add(member);}
        }
        int n = lettersAndPunctuation.size();
        for(int i=0; i < n; i++){
            for(int k = i+1; k<n; k++){

                ArrayList<Object> originalOrder = new ArrayList<>();
                addElements(lettersAndPunctuation, originalOrder, i, k);
                ArrayList<Object> reversedOrder = new ArrayList<>(originalOrder);
                Collections.reverse(reversedOrder);
                if(originalOrder.equals(reversedOrder)) {
                    if(originalOrder.size()>longestPalindrome.size()){
                        longestPalindrome.clear();
                        longestPalindrome = originalOrder;
                    }

                }

            }
        }
        System.out.println("Longest Palindrome found in text: "+ palindromeString(longestPalindrome));

    }
    private static void addElements(ArrayList<Object> source, ArrayList<Object> destination, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            destination.add(source.get(i));
        }
    }

    private static String palindromeString(ArrayList palindromeArray){
        String palindrome = "";
        for(Object element : palindromeArray){
            palindrome+=element.toString();
        }
        return palindrome;
    }

}


