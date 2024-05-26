package homework13;

import org.example.lesson14.blackjack.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BlackJackTest {

    @Test
    @DisplayName("Check that hand isn't empty after adding a card")
    void isNotEmptyHandTest() {
        var hand = new BlackJackHand();
        var card = new Card(Suit.SPADES, Rank.JACK);
        hand.addCard(card);
        int sizeOfHand = hand.getCards().size();

        assertEquals(1, sizeOfHand, "There are more than one item in the hand");
    }

    @Test
    @DisplayName("Check that the card value is equal to the added card value")
    void cardValueTest() {
        var hand = new BlackJackHand();
        Card card = new Card(Suit.DIAMONDS, Rank.JACK);
        hand.addCard(card);

        assertEquals(card, hand.getCards().get(0), "Card values are different");
    }

    @Test
    @DisplayName("Check that the value biggest then 21 is busted")
    void isBustedTest() {
        boolean result = false;
        var hand = new BlackJackHand();
        var firstCard = new Card(Suit.SPADES, Rank.KING);
        var secondCard = new Card(Suit.CLUBS, Rank.QUEEN);
        var thirdCard = new Card(Suit.HEARTS, Rank.TEN);
        List<Card> cards = Arrays.asList(firstCard, secondCard, thirdCard);

        for (Card c : cards) {
            hand.addCard(c);
        }

        if (hand.getValue() > 21) {
            result = hand.isBusted();
        }
        assertTrue(result, "Sum of values = " + hand.getValue() + ", that less than 21");
    }


    @Test
    @DisplayName("Check that 21 is blackjack")
    void isBlackjackTest() {
        boolean result = false;
        var hand = new BlackJackHand();
        var firstCard = new Card(Suit.SPADES, Rank.KING);
        var secondCard = new Card(Suit.CLUBS, Rank.ACE);
        List<Card> cards = Arrays.asList(firstCard, secondCard);

        for (Card c : cards) {
            hand.addCard(c);
        }

        if (hand.getValue() == 21) {
            result = hand.isBlackJack();
        }

        assertTrue(result, "Sum of values = " + hand.getValue() + ", that less than 21");
    }

    @Test
    @DisplayName("Check that pip cards have value of they numbers")
    void pipCardsTest() {
        var hand = new BlackJackHand();
        var cardTwo = new Card(Suit.SPADES, Rank.TWO);
        var cardThree = new Card(Suit.SPADES, Rank.THREE);
        var cardFour = new Card(Suit.SPADES, Rank.FOUR);
        var cardFive = new Card(Suit.SPADES, Rank.FIVE);
        var cardSix = new Card(Suit.SPADES, Rank.SIX);
        var cardSeven = new Card(Suit.SPADES, Rank.SEVEN);
        var cardEight = new Card(Suit.SPADES, Rank.EIGHT);
        var cardNine = new Card(Suit.SPADES, Rank.NINE);
        var cardTen = new Card(Suit.SPADES, Rank.TEN);

        List<Card> cards = Arrays.asList(cardTwo, cardThree, cardFour, cardFive, cardSix, cardSeven, cardEight, cardNine, cardTen);
        int value = 2;
        for (Card c : cards) {
            hand.addCard(c);
            assertEquals(value, hand.getValue(), "Value " + hand.getValue() + " of " + hand.getCards() + " does not equals to: " + value);
            hand.getCards().removeFirst();
            value += 1;
        }
    }

    @Test
    @DisplayName("Check that face cards have value = 10")
    void faceCardsTest() {
        var hand = new BlackJackHand();
        var jack = new Card(Suit.SPADES, Rank.JACK);
        var queen = new Card(Suit.SPADES, Rank.QUEEN);
        var king = new Card(Suit.SPADES, Rank.KING);

        List<Card> cards = Arrays.asList(jack, queen, king);
        for (Card c : cards) {
            hand.addCard(c);
        }

        int oneCardValue = hand.getValue() / hand.getCards().size();
        int handValue = hand.getValue();

        assertEquals(10, oneCardValue, "One card value: " + oneCardValue + " is different from 10");
        assertEquals(10 * hand.getCards().size(), handValue, "Hand value must be" + 10 * hand.getCards().size() + " , but actual it's: " + handValue);
    }

    @Test
    @DisplayName("Check that ace after first has value = 1")
    void moreThanOneAceTest() {
        var hand = new BlackJackHand();
        var firstCard = new Card(Suit.CLUBS, Rank.ACE);
        var secondCard = new Card(Suit.HEARTS, Rank.ACE);
        hand.addCard(firstCard);
        hand.addCard(secondCard);
        var secondAceValue = hand.getValue() - 11;

        assertEquals(1, secondAceValue, "Second ace has value: " + secondAceValue + ", that biggest than 1");
    }

}