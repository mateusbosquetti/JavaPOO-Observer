import java.util.List;

public class Maquina1 extends Publisher{

    private String nome;

    public Maquina1(List<Subscriver> subscrivers, String nome) {
        super(subscrivers);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
