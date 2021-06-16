package reproductores;

public interface Reproductor {

  boolean play(int idVideo, double minutoInicio);
  void stop();

  void registerOnPlay(PlayListener playListener);
  void registerOnStop(StopListener stopListener);
  void registerOnFinish(FinishListener finishListener);

}
