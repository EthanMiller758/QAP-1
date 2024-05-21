package org.example;

import java.util.ArrayList;
import java.util.List;

public class SuggestionEngine {
    public List<String> getSuggestions(String input) {
        List<String> suggestions = new ArrayList<>();
        suggestions.add("apple");
        suggestions.add("banana");
        suggestions.add("grape");
        suggestions.add("watermelon");
        return suggestions;
    }

    public static void main(String[] args) {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String userInput = "yellow delicious banana";
        List<String> suggestions = suggestionEngine.getSuggestions(userInput);
        System.out.println("Suggestions for input: " + userInput + ":");
        for (String suggestion : suggestions) {
            System.out.println("- " + suggestion);
        }
    }
}
