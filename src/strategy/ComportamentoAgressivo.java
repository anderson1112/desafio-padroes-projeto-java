package strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");

    }

    public static class Robo {
       private Comportamento comportamento;

       public void setComportamento(Comportamento comportamento) {
          this.comportamento = comportamento;
       }
       public void mover() {
          comportamento.mover();
       }
    }
}
