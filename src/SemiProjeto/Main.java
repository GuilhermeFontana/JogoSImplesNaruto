package SemiProjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner CaixaDeTexto = new Scanner(System.in);

        Uchihas sasuke = new Uchihas();
        sasuke.setIdade(17);
        sasuke.setNome("Sasuke");

        Uzumaki naruto = new Uzumaki();
        naruto.setIdade(18);
        naruto.setNome("Naruto Uzumaki");


        System.out.println("======= Escolha uma Opção =======");

        System.out.println("1 - Ninjas ");
        System.out.println("2 - Sair ");

        System.out.println("=================================");
        System.out.print("Digite sua Escolha: ");
        int PrimeiraEscolha = CaixaDeTexto.nextInt();
while (PrimeiraEscolha != 2){
        switch (PrimeiraEscolha) {
            case 1:
                System.out.println("1 - " + sasuke.getNome());
                System.out.println("2 - " + naruto.getNome());
                System.out.print("Escolha seu ninja e sua missão: ");
                int SegundaEscolha = CaixaDeTexto.nextInt();

                switch (SegundaEscolha) {
                    case 1:
                        sasuke.mostrarInformacoes();
                        sasuke.Sharingan();
                        System.out.println("========= MISSOES ===========");
                        String[] MissaoSasuke = new String[2];
                        MissaoSasuke[0] = "1 - Ajudar o Mestre de obra chegar na ponte da Aldeia da Nevoa  (Nivel C) ";
                        MissaoSasuke[1] = "2 - Ir com o time 7 achar o colar da Tsunade que o Naruto perdeu (Nivel D) ";
                        for (int i = 0; i < MissaoSasuke.length; i++) {
                            System.out.println(MissaoSasuke[i]);
                        }
                        System.out.print("Digite a missao que deseja: ");
                        int Missao = CaixaDeTexto.nextInt();
                        switch (Missao) {
                            case 1:
                                sasuke.PrimeiraPartemissaoPonteVelho();
                                break;
                            case 2:
                               sasuke.SegundaMissaoAmuleto();
                            default:
                                System.out.println("Missao indisponivel tente mais tarde...");
                        }
                        break;
                    case 2:
                        System.out.println("=================================");
                        naruto.mostrarInformacoes();
                        naruto.ModoSabio();
                        naruto.EscolhaAMissaoUzumaki();
                        break;
                    default:
                        System.out.println("Não sera possivel prosseguir! Encerrando o programa...");
                }



        }
    }
}}