package usuario;

public class PeliculaPendiente {

  Pelicula pelicula;
  double minutoreproduccion;

  public PeliculaPendiente(Pelicula pelicula, double minutoreproduccion) {
    this.pelicula = pelicula;
    this.minutoreproduccion = minutoreproduccion;
  }

  public boolean pendiente() {
    return pelicula.getDuracion() > minutoreproduccion;
  }

  public Pelicula getPelicula() {
    return pelicula;
  }

  public double getMinutoreproduccion() {
    return minutoreproduccion;
  }

  public int getId() {
    return pelicula.getId();
  }
}
