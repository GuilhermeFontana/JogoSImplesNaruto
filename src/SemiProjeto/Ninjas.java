package SemiProjeto;

public abstract class Ninjas {


   private String Nome;
   private int Idade;
   private String missao;
   private String nivel;
   private String statusDaMissao;


    public Ninjas() {
    }

    public Ninjas(String nome, int idade, String missao, String nivel, String statusDaMissao) {
        Nome = nome;
        Idade = idade;
        this.missao = missao;
        this.nivel = nivel;
        this.statusDaMissao = statusDaMissao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getStatusDaMissao() {
        return statusDaMissao;
    }

    public void setStatusDaMissao(String statusDaMissao) {
        this.statusDaMissao = statusDaMissao;
    }

    @Override
    public String toString() {
        return "Ninjas{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", missao='" + missao + '\'' +
                ", nivel='" + nivel + '\'' +
                ", statusDaMissao='" + statusDaMissao + '\'' +
                '}';
    }

    public void mostrarInformacoes(){
        System.out.println("Seu nome é: " + Nome);
        System.out.println("Sua idade é: "  + Idade + " anos");
    }


}
