import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Subscriver gestor = new Subscriver("Gestor");
        Subscriver operdador = new Subscriver("Operador");
        Subscriver painel = new Subscriver("Painel de Controle");

        List<Subscriver> subscrivers = List.of(gestor, operdador, painel);

        Maquina maquina1 = new Maquina(subscrivers, "Maquina1");
        Maquina maquina2 = new Maquina(subscrivers, "Maquina2");
        Maquina maquina3 = new Maquina(subscrivers, "Maquina3");
        Maquina maquina4 = new Maquina(subscrivers, "Maquina4");


        while (true){
            Thread.sleep(5000);
            maquina1.notifySubscriver(maquina1.getNome());
            maquina2.notifySubscriver(maquina2.getNome());
            maquina3.notifySubscriver(maquina3.getNome());
            maquina4.notifySubscriver(maquina4.getNome());
        }
    }
}
