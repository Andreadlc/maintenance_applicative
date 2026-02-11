
import java.util.*;

/**
 * Class Point
 *
 * Représente un point 2D dans l'espace.
 * Hérite de Shape pour unifier le polymorphisme avec les autres formes.
 *
 * Propriétés spécifiques :
 *  - pos_x : coordonnée x
 *  - pos_y : coordonnée y
 *
 * Implémente draw() pour dessiner le point (affiche coordonnées).
 */
public class Point extends Shape {

  //
  // Fields
  //

  private int pos_x;
  private int pos_y;
  
  //
  // Constructors
  //
  public Point () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of pos_x
   * @param newVar the new value of pos_x
   */
  public void setPos_x (int newVar) {
    pos_x = newVar;
  }

  /**
   * Get the value of pos_x
   * @return the value of pos_x
   */
  public int getPos_x () {
    return pos_x;
  }

  /**
   * Set the value of pos_y
   * @param newVar the new value of pos_y
   */
  public void setPos_y (int newVar) {
    pos_y = newVar;
  }

  /**
   * Get the value of pos_y
   * @return the value of pos_y
   */
  public int getPos_y () {
    return pos_y;
  }

  public Shape draw() {
    System.out.println("Drawing point at (" + pos_x + ", " + pos_y + ")");
    return this;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String toString(){
    return "Point [x=" + pos_x + ", y=" + pos_y + "]";
  }


}
