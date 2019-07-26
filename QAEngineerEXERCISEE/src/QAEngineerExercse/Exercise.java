package QAEngineerExercse;

public class Exercise {

    public static void main(String[] args) {
        System.out.println(printLongestWord("The cow jumped over the moon......."));

    }
/*Estimated Time: 30-60 mins depending on experience.

1.	In the programming language of your choice create a class with a method to return the length and longest words in a sentence.
For example, “The cow jumped over the moon.” should return 6 and “jumped”.
2.	Create unit tests to test that method, reworking your code if needed.
3.	Explain any assumptions in comments.
4.	Add a README explaining how to execute your tests.
5.	Share via GitHub etc.*/
    
    //1. I split the sentence and remove dots, commas etc and store in an array
    //2. loop through array and find the longest word

public static String printLongestWord(String sentence) {

    String[] words = sentence.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
    String longestWord = words[0];
    for (int i = 0; i < words.length; i++) {
        if (longestWord.length() <= words[i].length()) {
            longestWord = words[i];

        }
    }
    return longestWord.length()+" "+ longestWord;

}


}
