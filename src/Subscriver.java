public class Subscriver implements Observer{

    private String nome;

    public Subscriver(String nome) {
        this.nome = nome;
    }

    @Override
    public void notify(String note) {
        System.out.println(nome + ": " + note);
    }

    public String getNome() {
        return nome;
    }
}
