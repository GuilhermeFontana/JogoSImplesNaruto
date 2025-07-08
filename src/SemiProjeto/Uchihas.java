package SemiProjeto;

import java.util.Scanner;

public class Uchihas extends Ninjas {

    public void Sharingan(){
        System.out.println("Minha habilidade especial é o Sharingan!" );

    }
    Scanner CaixaMissaoUchiha = new Scanner(System.in);

    public void PrimeiraPartemissaoPonteVelho(){
        System.out.println(" Sasuke se encontra com o time 7 na frente da Aldeia da folha");
        System.out.println("=========================================================================");
        System.out.println(" A EQUIPE SAI DA ALDEIA MAS LOGO É ATACADA POR 2 NINJAS DA NEVOA QUE, A TODO CUSTO VAI TENTAR IMPEDI-LOS DE CHEGAR NA PONTE");
        System.out.println("Escolha o que vai fazer:");
        System.out.println("=========================================================================");
        String[] OqueVaiFazer = new String[2];
        OqueVaiFazer[0] = "1 - Ajudar a Sakura a defender o velho";
        OqueVaiFazer[1] = "2 - Atacar que nem um idiota e ter 50% de chance de sucesso";
        for (int i = 0; i < OqueVaiFazer.length; i++) {
            System.out.println(OqueVaiFazer[i]);
        }
        System.out.print("Digite aqui sua decisão: ");
        int RespostaOqVaiFazer1 = CaixaMissaoUchiha.nextInt();
        switch (RespostaOqVaiFazer1){
            case 1:
                System.out.println("Sua ajuda foi muito eficiente");
                System.out.println("Com ajuda de Naruto, Kakashi acabou com os ninjas renegados!");
                break;
            case 2:
                System.out.println("Cê é burro??? Quase morreu! mas te salvaram!!");
                System.out.println("Kakashi acabou com os ninjas renegados!");
            default:
        }
        System.out.println("===========================================================================");
        System.out.println("A EQUIPE CONSEGUE CHEGAR NA PONTE MAS, QUANDO PISA UM NINJA TE CHAMA PRA LUTAR, VOCE ACEITA?");
        String[] Escolha2 = new String[2];
        Escolha2[0] = "1 - Sim";
        Escolha2[1] = "2 - Não";
        for (int i = 0; i < Escolha2.length; i++) {
            System.out.println(Escolha2[i]);
        }
        System.out.print("Digite sua escolha: ");
        int RespostaOqVaiFazer2 = CaixaMissaoUchiha.nextInt();
        switch (RespostaOqVaiFazer2){
            case 1:
                System.out.println("Voce aceitou! vai precisar ativar seu sharingan para ter uma minima chance de ganhar");
                System.out.println("QUER ATIVAR SEU SHARINGAN? ");
                String[] SOuN = new String[2];
                SOuN[0] = "1 - Sim";
                SOuN[1] = "2 - Não";
                for (int i = 0; i < SOuN.length ; i++) {
                    System.out.println(SOuN[i]);
                }
                System.out.print("DIGITE AQUI SUA RESPOSTA: ");


                int entrada = CaixaMissaoUchiha.nextInt();
                switch (entrada){
                    case 1:
                        System.out.println("Voce ativou seu sharingan e ganhou a luta!! MISSAO CUMPRIDA");
                        break;
                    case 2:
                        System.out.println("VOCE QUASE MORREU!! MAS O ninja foi morto por Kakashi. MISSAO CUMPRIDA!!");
                        break;
                }
                break;
            case 2:
                System.out.println("O ninja foi morto por Kakashi. MISSAO CUMPRIDA");
                break;
        }
}
public void SegundaMissaoAmuleto(){
    System.out.println("TSUNADE REUNE O TIME 7 INTEIRO PRA IR ATRAS DO COLAR QUE FOI PERDIDO NO CAMINHO DA ALDEIA DA FOLHA");
    System.out.println("TODOS VAO PROCURAR O COLAR PERTO DO LAMEN DO ICHIRAKU ");
    System.out.println("===========================================================================");
    System.out.println("SASUKE - Vamos procurar perto do lamen tava lá! ");
    System.out.println("NARUTO - Vamos apostar quem encontra primeiro o colar! ");
    System.out.println("===========================================================================");
    System.out.println("Voce ve algo brilhando perto da cadeira e vai la ver??");
        String[] SouN2 = new String[2];
    SouN2[0] = "1 - Sim";
    SouN2[1] = "2 - Não";
    for (int i = 0; i <SouN2.length ; i++) {
        System.out.println(SouN2[i]);
    }
    System.out.print("DIGITE AQUI SUA RESPOSTA: ");
    int RespostaSouN2 = CaixaMissaoUchiha.nextInt();
switch (RespostaSouN2){
    case 1:
        System.out.println("PARABENS ACHOU O COLAR E GANHOU A APOSTA! MISSAO CUMPRIDA!!!");
        break;
    case 2:
        System.out.println("NARUTO FOI MAIS RAPIDO E GANHOU A APOSTA! MISSAO CUMPRIDA TAMBEM!!!");
        break;
}
}





}
