public class Pyramid {
  private int sides;
  private double length, width, height;
  static String name = "Pyramid";
  static String par = "sides, length, width, height";

  Pyramid(int sides, double length, double width, double height) {
    this.sides = sides;
    this.length = length;
    this.width = width;
    this.height = height;
  }

  boolean nonnegative() {
    if (sides > 0 && length > 0 && width > 0 && height > 0) {
      return true;
    } else {
      return false;
    }
  }

  double calculateVolume() {
    double volume = (length * width * height) / 3.0;
    return volume;
  }

  double calculateSurface() {
    double surface = (length * width) + (length * (Math.sqrt((Math.pow(width / 2.0, 2)) + Math.pow(height, 2)))) + (width * Math.sqrt((Math.pow(length / 2.0, 2)) + Math.pow(height, 2)));
    return surface;
  }

  double calculateBaseArea() {
    double base = length * width;
    return base;
  }

  double calculateLateralSurface() {
    double lateral = (length * (Math.sqrt((Math.pow(width / 2.0, 2)) + Math.pow(height, 2)))) + (width * Math.sqrt((Math.pow(length / 2.0, 2)) + Math.pow(height, 2)));
    return lateral;
  }
}

// currently only works for rectagular pyramids