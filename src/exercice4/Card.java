package exercice4;

public class Card {
	
	 private int rank;
	    private int suit;

	    public Card(int rank, int suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	    public int getRank() {
	        return rank;
	    }

	    public void setRank(int rank) {
	        this.rank = rank;
	    }

	    public int getSuit() {
	        return suit;
	    }

	    public void setSuit(int suit) {
	        this.suit = suit;
	    }

	    @Override
	    public String toString() {
	        return "Exercise2.Card {" +
	                "rank=" + rank +
	                ", suit=" + suit +
	                '}';
	    }

	public static void main(String[] args) {
		
		
		Deck deck = new Deck();
        Card card1 = new Card(Deck.SEVEN, Deck.DIAMONDS);
        Card card2 = new Card(Deck.THREE, Deck.CLUBS);
        Card card3 = new Card(Deck.KING, Deck.SPADES);

        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);

        deck.displayCards();

	}

}
