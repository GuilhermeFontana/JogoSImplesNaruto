package SemiProjeto;

import java.util.Scanner;

public class Uzumaki extends Ninjas {

    Scanner CaixaDeTextoUzumaki = new Scanner(System.in);

    public void ModoSabio(){
        System.out.println("Minha habilidade especial Multi Clones das sombras!");
    }

    public void EscolhaAMissaoUzumaki(){
        System.out.println("========= MISSOES ===========");
        String[] MissoesNAruto= new String[2];
        MissoesNAruto[0] = " 1 - Resgatar um cachorro perdido (Nivel D)";
        MissoesNAruto[1] = " 2 = Investigar um pequeno furto da banca (Nivel C) ";
        for (int i = 0; i < MissoesNAruto.length ; i++) {
            System.out.println(MissoesNAruto[i]);
        }
        System.out.print("Digite a sua missão: ");
        int primeiraEscolhaUzumaki = CaixaDeTextoUzumaki.nextInt();

        switch (primeiraEscolhaUzumaki){
            case 1:
                System.out.println("=================================");
                System.out.println("CHEGANDO NO ESCRITORIO DA HOKAGE ELA MANDA O NARUTO IR ATRAS DE UM CACHORRO PERDIDO");
                System.out.println("=================================");
                System.out.println("VOCE PROCURA EM TODO LUGAR E NAO ACHA, MAS FALTA SOMENTE UM LUGAR PRA PROCURAR NO CEMITERIO E ESTA A NOITE...");
                System.out.println("VOCE ENTRA LA PARA PROCURAR??");
                String[] SegundaEscolhaUzumaki = new String[2];
                SegundaEscolhaUzumaki[0] = "1 - Sim";
                SegundaEscolhaUzumaki[1] = "2 - Não";
                for (int i = 0; i < SegundaEscolhaUzumaki.length; i++) {
                    System.out.println(SegundaEscolhaUzumaki[i]);
                }
                System.out.print("Digite aqui sua escolha: ");
                int PrimeiraEscolhaMissao1 = CaixaDeTextoUzumaki.nextInt();
                switch (PrimeiraEscolhaMissao1){
                    case 1:
                        System.out.println("VOCE CRIOU CORAGEM E OBSERVOU O CACHORRO DE CANTO TE OBSERVANDO E CONSEGUE O CAPTURAR! MISSÃO CUMPRIDA!");
                        return;
                    case 2:
                        System.out.println("VOCE ARREGOU E FOI DORMIR, O CACHORRO RETORNOU PRA CASA DE MANHA, E SUA MISSÃO FOI CONSIDERADA INCOMPLETA!");
                        return;
                    default:
                        System.out.println("Escolha indisponivel. Reinicie o programa!");
                }//pra fazer a primeira missao

            case 2:
                System.out.println("=================================");
                System.out.println("VOCE É CONVOCADO PELA HOKAGE PRA AJUDAR UMA EQUIPE A INVESTIGAR UM PEQUENO FURTO EM UMA BANCA DE JORNAL PROXIMA");
                System.out.println("=================================");
                System.out.println("CHEGANDO NA BANCA VOCE NOTA UMA PESSOA DE LONGE TE OBSERVANDO. VOCE VAI ATRAS DELA?");
                String [] PrimeiraEscolhaSegundaMissao = new String[2];
                PrimeiraEscolhaSegundaMissao[0] = "1 - Sim";
                PrimeiraEscolhaSegundaMissao[1] = "2 - Não";
                for (int i = 0; i < PrimeiraEscolhaSegundaMissao.length ; i++) {
                    System.out.println(PrimeiraEscolhaSegundaMissao[i]);
                }
                System.out.print("Digite aqui sua resposta: ");
                int PrimeiraEscolhaSegundaMissaoNumero = CaixaDeTextoUzumaki.nextInt();
                switch (PrimeiraEscolhaSegundaMissaoNumero){
                    case 1:
                        System.out.println("=================================");
                        System.out.println("ELA NOTA VOCÊ A OBSERVANDO E COMEÇA A FUGIR, NA PERSEGUIÇÃO VOCÊS ACABAM ENTRANDO EM CONFRONTO. VOCE ATIVARIA SEUS CLONES DA SOMRAS PARA LUTAR?");
                        String[] EscolhaDosCLonesDaSombra = new String[2];
                        EscolhaDosCLonesDaSombra[0] = "1 - Sim (50% chance de sucesso)";
                        EscolhaDosCLonesDaSombra[1] = "2 - Não (50% chance de morte)";
                        for (int i = 0; i < EscolhaDosCLonesDaSombra.length; i++) {
                            System.out.println(EscolhaDosCLonesDaSombra[i]);
                        }
                        System.out.print("Digite sua resposta: ");
                        int EscolhaDeAtivarOsClones = CaixaDeTextoUzumaki.nextInt();
                        switch (EscolhaDeAtivarOsClones){
                            case 1:
                                System.out.println("VOCÊ lUTA DE IGUAL ATÉ A AJUDA CHEGAR E CONSEGUIR CAPTUTURA-LO. ERA O BANDIDO CORRETO! MISSAO CUMPRIDA");
                                break;
                            case 2:
                                System.out.println("VOCE QUASE FOI MORTO, A AJUDA CHEGOU E SALVOU A SUA VIDA. MAS O BANDIDO FUGIU. MISSÃO INCLOMPLETA! ");
                                break;
                            default:
                                System.out.println("INDISPONIVEL. REINICIE O PROGRAMA...");
                        }
                        break;
                    case 2:
                        System.out.println("VOCE FOI COVARDE DE NÃO IR ATRÁS, MAS, UM LOCAL VIU E CONTOU PRA EQUIPE QUE ESTAVA JUNTO COM VOCÊ. E ELES CONSEGUIRAM CAPTURA-LO. MISSAO CUMPRIDA!");
                        break;


                }
        }
    }
}
