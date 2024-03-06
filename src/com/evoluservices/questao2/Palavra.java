package com.evoluservices.questao2;

public class Palavra {

    private String word;

    public Palavra() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isPalindrome(String word) {
        String reverse = "";
        int length = word.length();

        for (int i = (length - 1); i >= 0 ; i--) {
            reverse += word.charAt(i);
        }

        return word.equalsIgnoreCase(reverse);
    }
}
