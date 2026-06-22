public abstract class Abelha {
    private String nome;
    private int idade;

    public Abelha(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void executarAtividade();
    public abstract double calcularConsumo();
    public abstract TipoAbelha getTipo();


}
