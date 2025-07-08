package SemiProjeto;

public abstract class Ninjas {


    String Nome;
    int Idade;
    String missao;
    String nivel;
    String statusDaMissao;



    public void mostrarInformacoes(){
        System.out.println("Seu nome é: " + Nome);
        System.out.println("Sua idade é: "  + Idade + " anos");
    }


}
