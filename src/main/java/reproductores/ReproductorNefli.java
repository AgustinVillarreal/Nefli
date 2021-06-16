package reproductores;

import usuario.PeliculaPendiente;

public class ReproductorNefli {

  public static Reproductor reproductor;
  public static ReproductorNefli instance;

  public ReproductorNefli(Reproductor reproductor) {
    this.reproductor = reproductor;
  }

  public static void initInstance(Reproductor reproductor) {
    instance = new ReproductorNefli(reproductor);
  }

  public static ReproductorNefli getInstance() {
    if (instance == null){
      throw new RuntimeException("instance was forgotten to be initialized");
    }
    return instance;
  }

  public void retomar(PeliculaPendiente pelicula) {

  }

  public void reproducir(int id, double minutoreproduccion) {
    reproductor.play(id, minutoreproduccion);
  }
}
