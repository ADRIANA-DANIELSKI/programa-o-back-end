public abstract class Esporte {
    // Atributos comuns
    private String nome;
    private int numeroJogadores; // Por equipe ou total, dependendo da definição

    // Construtor
    public Esporte(String nome, int numeroJogadores) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
    }

    // Método concreto: exibe as informações gerais
    public void exibirInformacoes() {
        System.out.println("--- Informações do Esporte ---");
        System.out.println("Nome: " + nome);
        System.out.println("Número de Jogadores por Equipe (Regra Padrão): " + numeroJogadores);
    }

    // Método abstrato: deve ser implementado por cada subclasse
    public abstract void iniciarPartida();
}