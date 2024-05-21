package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SuggestionEngineTest {

    @Test
    public void testSuggestionForSpecificInput() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String specificInput = "specific";

        List<String> suggestions = suggestionEngine.getSuggestions(specificInput);

        assertFalse(suggestions.isEmpty(), "Suggestions for specific input should not be empty.");
    }

    @Test
    void testSingleWordInput() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String singleWordInput = "banana";
        assertFalse(suggestionEngine.getSuggestions(singleWordInput).isEmpty(),
                "Suggestions for a single-word input should not be empty.");
    }

    @Test
    void testMultipleWordsInput() {
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        String multipleWordsInput = "yellow delicious banana";
        assertFalse(suggestionEngine.getSuggestions(multipleWordsInput).isEmpty(),
                "Suggestions for a multiple-words input should not be empty");
    }
}
