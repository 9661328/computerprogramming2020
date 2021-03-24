public class Polyhedron {
  private double edge;
  static String name = "Polyhedron";
  static String par = "edge";

  Polyhedron(double edge) {
    this.edge = edge;
  }

  boolean nonnegative() {
    if(edge > 0) {
      return true;
    } else {
      return false;
    }
  }

  // methods
}