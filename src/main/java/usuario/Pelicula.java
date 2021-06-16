package usuario;

public class Pelicula {

  String nombre;
  int id;
  double duracion;

  public Pelicula(String nombre, int id, double duracion) {
    this.nombre = nombre;
    this.id = id;
    this.duracion = duracion;
  }

  public double getDuracion() {
    return duracion;
  }

  public int getId() {
    return id;
  }
}
