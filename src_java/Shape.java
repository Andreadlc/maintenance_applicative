

/**
 * Class Shape
 *
 * <<abstract>>
 * 
 * Classe de base abstraite pour toutes les formes géométriques.
 * Définit les propriétés communes :
 *  - id : identifiant unique
 *  - fill : si la forme est remplie
 *  - thickness : épaisseur du contour
 *  - rotation : angle de rotation
 * 
 * Fournit une méthode abstraite draw() que toutes les sous-classes doivent implémenter.
 * Fournit également un toString() générique.
 */

import java.util.*;
abstract public class Shape {

  //
  // Fields
  //

  private int id;
  private boolean fill;
  private float thickness;
  private double rotation;
  
  //
  // Constructors
  //
  public Shape () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of fill
   * @param newVar the new value of fill
   */
  public void setFill (boolean newVar) {
    fill = newVar;
  }

  /**
   * Get the value of fill
   * @return the value of fill
   */
  public boolean getFill () {
    return fill;
  }

  /**
   * Set the value of thickness
   * @param newVar the new value of thickness
   */
  public void setThickness (float newVar) {
    thickness = newVar;
  }

  /**
   * Get the value of thickness
   * @return the value of thickness
   */
  public float getThickness () {
    return thickness;
  }

  /**
   * Set the value of rotation
   * @param newVar the new value of rotation
   */
  public void setRotation (double newVar) {
    rotation = newVar;
  }

  /**
   * Get the value of rotation
   * @return the value of rotation
   */
  public double getRotation () {
    return rotation;
  }

  //
  // Abstract methods
  //

  /**
   * Draw the shape
   * @return Shape
   */
  public abstract Shape draw();

  //
  // Other methods
  //

  /**
   * @return String
   */
  public String toString(){

    return "Unknown shape";
  }


}
