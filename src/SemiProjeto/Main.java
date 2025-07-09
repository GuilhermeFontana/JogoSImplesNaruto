package SemiProjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner CaixaDeTexto = new Scanner(System.in);

        Uchihas Sasuke = new Uchihas();
        Sasuke.Nome = "Sasuke Uchiha";
        Sasuke.Idade = 17;

        Uzumaki Naruto = new Uzumaki();
        Naruto.Nome = "Naruto Uzumaki";
        Naruto.Idade = 18;



        System.out.println("======= Escolha uma Opção =======");

        System.out.println("1 - Ninjas ");
        System.out.println("2 - Sair ");

        System.out.println("=================================");
        System.out.print("Digite sua Escolha: ");
        int PrimeiraEscolha = CaixaDeTexto.nextInt();
while (PrimeiraEscolha != 2){
        switch (PrimeiraEscolha) {
            case 1:
                System.out.println("1 - " + Sasuke.Nome);
                System.out.println("2 - " + Naruto.Nome);
                System.out.print("Escolha seu ninja e sua missão: ");
                int SegundaEscolha = CaixaDeTexto.nextInt();

                switch (SegundaEscolha) {
                    case 1:
                        Sasuke.mostrarInformacoes();
                        Sasuke.Sharingan();
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
                                Sasuke.PrimeiraPartemissaoPonteVelho();
                                break;
                            case 2:
                                Sasuke.SegundaMissaoAmuleto();
                            default:
                                System.out.println("Missao indisponivel tente mais tarde...");
                        }
                        break;
                    case 2:
                        System.out.println("=================================");
                        Naruto.mostrarInformacoes();
                        Naruto.ModoSabio();
                        Naruto.EscolhaAMissaoUzumaki();
                        break;
                    default:
                        System.out.println("Não sera possivel prosseguir! Encerrando o programa...");
                }



        }
    }
}}