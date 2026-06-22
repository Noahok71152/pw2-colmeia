class Operaria extends Abelha implements DefenderColmeia, ColetandoRecursos{
    double HorasVoo;

    public Operaria(String nome, int idade, double HorasVoo) {
        super(nome, idade);
        this.HorasVoo = HorasVoo;
    }

    @Override
    public void executarAtividade() {
        System.out.println("A abelha " + getNome() + " que e operaria esta colhendo polen");
        System.out.println("A abelha " + getNome() + " que e operaria esta defendendo a entrada");
    }

    @Override
    public double calcularConsumo() {
        double calculo = 10.0 + (this.HorasVoo * 2);
        return calculo;
    }
    @Override
    public TipoAbelha getTipo(){
        return TipoAbelha.OPERARIA;
    }
    @Override
    public void defenderColmeia(){
        System.out.println(getNome() + ": Defendendo a entrada da colmeia" );
    }
    @Override
    public void coletandoRecursos(){
        System.out.println(getNome() + ": Coletando néctar nas flores");
    }


}

class Rainha extends Abelha implements Incapacitada {
    int QtdOvos;

    public Rainha(String nome, int idade, int QtdOvos) {
        super(nome, idade);
        this.QtdOvos = QtdOvos;
    }

    @Override
    public void executarAtividade() {
        System.out.println("A Rainha " + getNome() + " esta botando ovos na colmeia");
    }

    @Override
    public double calcularConsumo() {
        return 20.0 + (this.QtdOvos * 0.01);
    }
    public TipoAbelha getTipo(){
        return TipoAbelha.RAINHA;
    }
    @Override
    public void fazerNada(){
        System.out.println(getNome() + ":  Nao possui capacidades especiais");
    }
}

class Zangao extends Abelha implements DefenderColmeia{
    int voos;

    public Zangao(String nome, int idade, int voos) {
        super(nome, idade);
        this.voos = voos;
    }

    @Override
    public void executarAtividade() {
        System.out.println("Zangao " + getNome() + " voando pra acasalar");
        System.out.println("Zangao " + getNome() + " esta defendendo a entrada");
    }


    @Override
    public double calcularConsumo() {
        return 15.0 + (this.voos * 3);
    }
    public TipoAbelha getTipo(){
        return TipoAbelha.ZANGAO;
    }
    @Override
    public void defenderColmeia(){
        System.out.println(getNome() + ": Defendendo a entrada da colmeia" );
    }
}


public class Main {
    public static void main(String[] args) {

        Abelha Operaria = new Operaria("Flora", 15, 4.0);
        Abelha Rainha = new Rainha("Aurora", 15, 40);
        Abelha Zangao = new Zangao("Zeca", 10, 10);

        System.out.println("Nome: " + Operaria.getNome());
        System.out.println("Tipo: " + Operaria.getTipo());
        System.out.println("Idade: " + Operaria.getIdade());

        Operaria.executarAtividade();
        System.out.println("Consumo: " + Operaria.calcularConsumo()  + "mg");


        System.out.println("Nome: " + Zangao.getNome());
        System.out.println("Tipo: " + Zangao.getTipo());
        System.out.println("Idade: " + Zangao.getIdade());


        Zangao.executarAtividade();
        System.out.println("Consumo: " + Zangao.calcularConsumo() + "mg");

        System.out.println("Nome: " + Rainha.getNome());
        System.out.println("Tipo: " + Rainha.getTipo());
        System.out.println("Idade: " + Rainha.getIdade());


        Rainha.executarAtividade();
        System.out.println("Consumo: " + Rainha.calcularConsumo()  + "mg");

        System.out.println("----------CONSUMO TOTAL DIÁRIO COLMEIA----------");
        System.out.println("Consumo total: " + Zangao.calcularConsumo() + Operaria.calcularConsumo() + Rainha.calcularConsumo() + "mg");
        System.out.println("----------ATIVIDIDADES---------------");
        ((ColetandoRecursos) Operaria).coletandoRecursos();
        ((DefenderColmeia) Operaria).defenderColmeia();
        ((DefenderColmeia) Zangao).defenderColmeia();
        ((Incapacitada) Rainha).fazerNada();
    }
}
