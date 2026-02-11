import java.util.*;

/**
 * Class Curve
 *
 * Représente une courbe composée d'une suite de points.
 * Hérite de Shape.
 *
 * Propriétés spécifiques :
 *  - points : liste de Point composant la courbe
 *
 * Implémente draw() pour dessiner la courbe (affiche nombre de points pour simulation).
 */
public class Curve extends Shape {

  //
  // Fields
  //

  private ArrayList<Point> points;
  
  //
  // Constructors
  //
  public Curve () {};
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of points
   * @param newVar the new value of points
   */
  public void setPoints (ArrayList<Point> newVar) {
    points = newVar;
  }

  /**
   * Get the value of points
   * @return the value of points
   */
  public ArrayList<Point> getPoints () {
    return points;
  }

  public Shape draw() {
    System.out.println("Drawing a curve with " + points.size() + " points");
    return this;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String toString(){
    return "Curve [points=" + points.size() + "]";
  }


}
