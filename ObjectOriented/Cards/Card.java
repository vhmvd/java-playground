/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmn2
 */
public class Card {
  private String face;
  private String suit;
  
  public Card(String cardFace, String cardSuit)
  {
    face = cardFace;
    suit = cardSuit;
  }
  
  public String getFace()
  {
    return face;
  }
  
  public String getSuit()
  {
    return suit;
  }
  
  public String toString()
  {
    return face + " of " + suit;
  }
}
