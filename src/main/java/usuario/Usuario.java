package usuario;

import reproductores.ReproductorNefli;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {

  List<PeliculaPendiente> peliculasPendientes;

  public List<PeliculaPendiente> continuarViendo() {
    return peliculasPendientes.stream()
        .filter(peliculaPendiente -> peliculaPendiente.pendiente())
        .collect(Collectors.toList());
  }

  public void retomarPelicula(PeliculaPendiente pelicula) {
    ReproductorNefli.getInstance().reproducir(pelicula.getId(), pelicula.getMinutoreproduccion());
  }

  public void comenzarPelicula(Pelicula pelicula){
    ReproductorNefli.getInstance().reproducir(pelicula.getId(), 0);
    peliculasPendientes.add(new PeliculaPendiente(pelicula, 0));
  }

}
