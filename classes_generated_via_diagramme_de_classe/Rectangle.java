
import java.util.*;


/**
 * Class Rectangle
 */
public class Rectangle extends Shape {

  //
  // Fields
  //

  private int length;
  private int width;
  
  //
  // Constructors
  //
  public Rectangle () { };
  
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

  /**
   * Set the value of width
   * @param newVar the new value of width
   */
  public void setWidth (int newVar) {
    width = newVar;
  }

  /**
   * Get the value of width
   * @return the value of width
   */
  public int getWidth () {
    return width;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String toString()
  {
  }


}
