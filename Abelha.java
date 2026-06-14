//classe mãe abstrata que vai servir de estrutura com seus atributos para as outras abelhas
public abstract class Abelha {
    private String nome;  // Mantém privado!
    private int idade;    // Mantém privado!

    public Abelha(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Adicione estes Getters para permitir a leitura controlada:
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public abstract void executarAtividade();
    public abstract double calcularConsumo();
}
