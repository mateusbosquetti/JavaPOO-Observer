import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

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
                    s.notify(ANSI_GREEN+nome+  ": Update" + ANSI_RESET);
                }
            }
        } else {
            for (Subscriver s: subscrivers) {
                s.notify(ANSI_RED + nome+": Erro" + ANSI_RESET);
            }
        }


    }



}
