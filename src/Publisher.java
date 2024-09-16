import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    private List<Subscriver> subscrivers;

    public Publisher(List<Subscriver> subscrivers) {
        this.subscrivers = subscrivers;
    }

    public void addSubscriver(Subscriver subscriver){
        subscrivers.add(subscriver);
    }

    public void removeSubscriver(Subscriver subscriver){
        subscrivers.remove(subscriver);
    }

    public void notifySubscriver(String nome){

        int valor = (int)(Math.random() * 101);

        if (valor > 50){
            for (Subscriver s: subscrivers) {
                if (s.getNome().equals("Painel de Controle")){
                    s.notify(nome+ ": Update");
                }
            }
        } else {
            for (Subscriver s: subscrivers) {
                s.notify(nome+ ": Erro");
            }
        }


    }



}
