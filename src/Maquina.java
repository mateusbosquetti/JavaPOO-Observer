import java.util.List;

public class Maquina extends Publisher{

    private String nome;

    public Maquina(List<Subscriver> subscrivers, String nome) {
        super(subscrivers);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
