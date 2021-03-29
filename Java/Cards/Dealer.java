import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * Dealer
 */
public class Dealer {

  public static void main(String[] args) {
    ArrayList<Card> cardsList = new ArrayList<Card>();

    for(int i=2; i<11; i++)
    {
      cardsList.add(new Card("" + i, "Hearts"));
      cardsList.add(new Card("" + i, "Spades"));
      cardsList.add(new Card("" + i, "Club"));
      cardsList.add(new Card("" + i, "Diamond"));
    }

    JOptionPane.showMessageDialog(null, "A pair\n" + cardsList.get(0) + ", " + cardsList.get(1));

    JOptionPane.showMessageDialog(null, "2 pairs\n" + cardsList.get(7) + ", " + cardsList.get(5) + "\n" + cardsList.get(11) + ", " + cardsList.get(10));

    JOptionPane.showMessageDialog(null, "3 of a kind\n" + cardsList.get(18) + ", " + cardsList.get(17) + ", " + cardsList.get(16));
  }
}