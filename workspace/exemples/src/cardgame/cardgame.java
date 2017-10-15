package cardgame;
public class cardgame
{
    static class TheCard
    {
        // Java getter & setter
        private String CardName;
        private int CardRank;
        private int Chosen;

        public TheCard(int rank, String name)
        {
            this.CardName = name;
            this.CardRank = rank;
            this.Chosen = 0;
        }
    }


    @SuppressWarnings("null")
    private static TheCard[] BuildDeck()
    {
        TheCard[] TheDeck = null;
        String[] Cards =  {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] Suits = {"Spades","Hearts","Diamonds","Clubs"};
        int[] Rank = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        int cardnumber = 0;
        for (int i = 0; i < Cards.length; i++)
        {
            for (int j = 0; j < Suits.length; j++)
            {
                String deckcard = Cards[i];
                String suitcard = Suits[j];
                String cardname = deckcard + "-" + suitcard;
                TheDeck[cardnumber] = new TheCard(Rank[i], cardname);
                cardnumber++;
            }
        }
        return TheDeck;
    }
    private static TheCard GetRandomCard(TheCard[] OrderedDeck)
    {
        TheCard thecard;
        int random = (int) (51*Math.random ());
        thecard = OrderedDeck[random];
        if (thecard.Chosen == 0 )       // if available...
        {
            thecard.Chosen = 1;         // mark it taken...
            return thecard;
        }
        else
        {
            return GetRandomCard(OrderedDeck);
        }
    }

    public static void main(String args[])
    {
        TheCard[] OrderedDeck = BuildDeck();
        System.out.println ("Welcome, Prepare for War!");
        int decksize = OrderedDeck.length;
        int player1wincount = 0;
        int player2wincount = 0;
        int tiecount = 0;
        for (int cardcount = 0; cardcount < decksize;)
        {
            TheCard Player1 = GetRandomCard(OrderedDeck);
            cardcount++;
            TheCard Player2 = GetRandomCard(OrderedDeck);
            cardcount++;
            System.out.println ("Player 1's card is: " + Player1.CardName);
            System.out.println ("Player 2's card is: " + Player2.CardName);
            if (Player1.CardRank > Player2.CardRank)
            {
                System.out.println("Player 1 wins this hand");
                player1wincount++;
            }
            if (Player1.CardRank < Player2.CardRank)
            {
                System.out.println("Player 2 wins this hand");
                player2wincount++;
            }
            if (Player1.CardRank == Player2.CardRank)
            {
                System.out.println("Player 1 and Player 2 played the same valued card");
                tiecount++;
            }
        }
        System.out.println ("Player 1 won " + String.valueOf(player1wincount) + " hands");
        System.out.println ("Player 1 won " + String.valueOf(player2wincount) + " hands");
        System.out.println ("There were " + String.valueOf(tiecount) + " ties");
    }
}
