package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAppTest {
    @Test
    void string_ShouldReturnIsPalindromeTrue_WhenCalled() {
        boolean expected = true;
        boolean actual = StringApp.isPalindrome("Was it a car or a cat I saw");
        assertEquals(expected,actual, "print isPalindrome -> true");
    }
    @Test
    void string_ShouldReturnIsPalindromeFalse_WhenCalled() {
        boolean expected = false;
        boolean actual = StringApp.isPalindrome("I saw a cat");
        assertEquals(expected,actual, "print isPalindrome -> false");
    }
    @Test
    void string_ShouldReturnNumberOfConsonants_WhenCalled() {
        int expected = 6;
        int actual = StringApp.numberOfConsonants("It's my life!");
        assertEquals(expected,actual, "print number of consonants (\"It's my life!\") -> 6");
    }
    @Test
    void string_ShouldReturnNumberOfVowels_WhenCalled() {
        int expected = 3;
        int actual = StringApp.numberOfVowels("It's my life!");
        assertEquals(expected,actual, "print number of vowels (\"It's my life!\") -> 3");
    }
    @Test
    void string_ShouldReturnNumberOfSearchWord_WhenCalled() {
        long expected = 2;
        long actual = StringApp.numberOfWords("It's my life it's now or never.", "it's");
        assertEquals(expected,actual, "print number of (\"it's\") -> 2");
    }
}
