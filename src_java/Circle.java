import java.util.*;

/**
 * Class Circle
 *
 * Représente un cercle géométrique.
 * Hérite de Shape.
 *
 * Propriétés spécifiques :
 *  - radius : rayon du cercle
 *
 * Implémente la méthode draw() pour dessiner le cercle (ici simulation par print).
 */
public class Circle extends Shape {

  //
  // Fields
  //

  private int radius;
  
  //
  // Constructors
  //
  public Circle () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of radius
   * @param newVar the new value of radius
   */
  public void setRadius (int newVar) {
    radius = newVar;
  }

  /**
   * Get the value of radius
   * @return the value of radius
   */
  public int getRadius () {
    return radius;
  }

  public Shape draw() {
    System.out.println("Drawing a circle with radius " + radius);
    return this;
  }

  //
  // Other methods
  //

  /**
   * @return String
   */
  public String toString(){
    return "Circle [radius=" + radius + "]";
  }


}
