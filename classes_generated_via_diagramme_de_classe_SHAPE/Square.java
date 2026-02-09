
import java.util.*;


/**
 * Class Square
 *
 * Représente un carré (spécialisation d'un rectangle).
 * Hérite de Shape.
 *
 * Propriétés spécifiques :
 *  - length : longueur du côté
 *
 * Implémente draw() pour dessiner le carré (affiche longueur du côté).
 */
public class Square extends Shape {

  //
  // Fields
  //

  private int length;
  
  //
  // Constructors
  //
  public Square () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of length
   * @param newVar the new value of length
   */
  public void setLength (int newVar) {
    length = newVar;
  }

  /**
   * Get the value of length
   * @return the value of length
   */
  public int getLength () {
    return length;
  }

  public Shape draw() {
    System.out.println("Drawing a square with length " + length);
    return this;
  }


  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String toString(){
    return "Square [length=" + length + "]";
  }


}
