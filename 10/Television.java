/**
 * Television
 */
public class Television {
  private String brand;
  private double screenSize;

  Television(String brand, double screenSize)
  {
    this.brand      = brand;
    this.screenSize = screenSize;
  }

  public void setBrand(String brandVar)
  {
    this.brand = brandVar;
  }

  public double getScreenSize()
  {
    return screenSize;
  }
  
  public String toString()
  {
    return "Brand Name: " + this.brand + "\n" + "Screen Size: " + this.screenSize + "\n";
  }

  public double calcResolution(double d)
  {
    return d*screenSize;
  }
}