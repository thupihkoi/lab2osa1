public class Valopaa implements Runnable{
  private boolean jatka;
  public void run(){
    while (jatka){
      Thread.sleep(100);
    }
  }
}
