
import java.util.*;

/**
 * Class Polygone
 *
 * Représente un polygone défini par une liste de points.
 * Hérite de Shape.
 *
 * Propriétés spécifiques :
 *  - points : liste de Point formant le polygone
 *
 * Implémente draw() pour dessiner le polygone (affiche nombre de points).
 */
public class Polygone extends Shape {

  //
  // Fields
  //

  private ArrayList<Point> points;
  
  //
  // Constructors
  //
  public Polygone () { };
  
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
    System.out.println("Drawing a polygon with " + points.size() + " points");
    return this;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String toString(){
    return "Polygone [points=" + points.size() + "]";
  }


}
