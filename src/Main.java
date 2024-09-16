import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Subscriver gestor = new Subscriver("Gestor");
        Subscriver operdador = new Subscriver("Operador");
        Subscriver painel = new Subscriver("Painel de Controle");

        List<Subscriver> subscrivers = List.of(gestor, operdador, painel);

        Maquina1 maquina1 = new Maquina1(subscrivers, "Maquina1");
        Maquina1 maquina2 = new Maquina1(subscrivers, "Maquina2");
        Maquina1 maquina3 = new Maquina1(subscrivers, "Maquina3");
        Maquina1 maquina4 = new Maquina1(subscrivers, "Maquina4");


        while (true){
            Thread.sleep(5000);
            maquina1.notifySubscriver(maquina1.getNome());
            maquina2.notifySubscriver(maquina2.getNome());
            maquina3.notifySubscriver(maquina3.getNome());
            maquina4.notifySubscriver(maquina4.getNome());
        }
    }
}
