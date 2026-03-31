public class Moottori.java implements Runnable{
  private boolean jatka=true;
  //some code
  public void run(){
    //Nyt toimii
    while (jatka){
      Thread.sleep(1);
      Tee jotain
      muutakin
        muutakinkin....
    }
  }
}
