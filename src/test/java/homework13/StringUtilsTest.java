package homework13;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    @DisplayName("Verifying that string is blank")
    void isBlankTest() {
        String str = " ";
        boolean result = StringUtils.isBlank(str);

        assertTrue(result, "String " + str + " isn't blank");
    }

    @Test
    @DisplayName("Verifying that first string equals to the second string")
    void equalsTest() {
        String firstStr = "Some value";
        String secondStr = "Some value";
        boolean result = StringUtils.equals(firstStr, secondStr);

        assertTrue(result, "First string: " + firstStr + ", isn't equals to the second string: " + secondStr);
    }

    @Test
    @DisplayName("Verifying that string contains character ignore case")
    void containsCharacterTest() {
        String str = "I thought love was only true in fairytales";
        boolean result = StringUtils.containsIgnoreCase(str, "Love");

        assertTrue(result);
    }

    @Test
    @DisplayName("Verifying that string isn't contains character")
    void containsNoneCharacterTest() {
        String str = "There is a house in New Orleans";
        boolean result = StringUtils.containsNone(str, 'y', 'b');

        assertTrue(result);
    }

    @Test
    @DisplayName("Verifying that string ends with specific value")
    void stringEndsWithTest() {
        String str = "It's a pretty good crowd for a Saturday";
        boolean result = StringUtils.endsWith(str, "Saturday");

        assertTrue(result);
    }

    @Test
    @DisplayName("Verifying that substring value equals with test value")
    void substringEqualsTest() {
        String str = "Bill, I believe this is killing me";
        String substring = StringUtils.substring(str, 8, 15);

        assertEquals("believe", substring);
    }

    @Test
    @DisplayName("Verifying that sentences is not equals after one word replaced")
    void replaceWordTest() {
        String str = "I don't believe that anybody feels the way I do about you now";
        String strWithReplacedWord = StringUtils.replace(str, "anybody", "nobody");

        assertNotEquals(str, strWithReplacedWord, "Sentences are the same");
    }

    @ParameterizedTest
    @ValueSource(strings = {"street", "beast", "peace"})
    @DisplayName("Verifying that tested words isn't ends with the specific suffix")
    void isNotTheSameEndsTest(String str) {
        boolean result = StringUtils.endsWith(str, "iss");

        assertFalse(result, "The word: " + str + ", ends with \"iss\" suffix");
    }

    @Test
    @DisplayName("Verifying that abbreviate length is as expected")
    void abbreviateTest() {
        String str = "Wheel in the sky keeps on turning";
        String abbreviate = StringUtils.abbreviate(str, 19);

        assertEquals(19, abbreviate.length());
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad", "good", "nice"})
    @DisplayName("Verifying that the last character of the string is deleted")
    void lastCharDeletingTest(String str) {
        String strWithoutLastChar = StringUtils.chop(str);
        boolean result = StringUtils.endsWith(strWithoutLastChar, str.substring(str.length() - str.length() / 2));

        assertFalse(result);
    }

}