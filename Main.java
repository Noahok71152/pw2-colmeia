import java.util.ArrayList;

// classes filhas da abelha

class Operaria extends Abelha {
    double HorasVoo;

    public Operaria(String nome, int idade, double HorasVoo) {
        super(nome, idade);
        this.HorasVoo = HorasVoo;
    }

    @Override
    public void executarAtividade() {
        // usando o get pq o professor mandou encapsular
        System.out.println("A abelha " + getNome() + " que e operaria esta colhendo polen");
    }

    @Override
    public double calcularConsumo() {
        double calculo = 10.0 + (this.HorasVoo * 2);
        return calculo;
    }
}

class Rainha extends Abelha {
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
}

class Zangao extends Abelha {
    int voos;

    public Zangao(String nome, int idade, int voos) {
        super(nome, idade);
        this.voos = voos;
    }

    @Override
    public void executarAtividade() {
        System.out.println("Zangao " + getNome() + " voando pra acasalar");
    }

    @Override
    public double calcularConsumo() {
        return 15.0 + (this.voos * 3);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Abelha> colmeia = new ArrayList<>();

        colmeia.add(new Rainha("Elizabeth", 40, 1600));
        colmeia.add(new Zangao("Barry", 28, 3));
        colmeia.add(new Operaria("Maya", 12, 5.0));

        double consumoTotal = 0;

        System.out.println(" ROTINA DIARIA ");

        for (Abelha a : colmeia) {
            a.executarAtividade();

            double gasto = a.calcularConsumo();
            consumoTotal = consumoTotal + gasto; // soma normal sem usar +=

            System.out.println("Gasto da " + a.getNome() + ": " + gasto + " mg");
            System.out.println("");
        }

        System.out.println("-------------------------");
        System.out.println("Consumo total da colmeia deu: " + consumoTotal + " mg");
    }
}
