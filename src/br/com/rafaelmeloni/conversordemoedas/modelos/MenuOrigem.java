package br.com.rafaelmeloni.conversordemoedas.modelos;


import java.util.Scanner;

public class MenuOrigem {
    private String moeda = "";



    public void chamaMenu(String texto){

        Scanner scanner = new Scanner(System.in);
        String menu = """
                ************ Bem vindo ao conversor de moedas ************
                
                Escolha uma das opções abaixo para a moeda de %S :
                
                1: Real.
                2: Libra esterlinas.
                3: Euro;
                4: Dólar americano.
                5: Yen;
                
                ************************************************************""".formatted(texto);
        System.out.println(menu);

       int escolha = scanner.nextInt();

       switch(escolha){
           case 1 :
                moeda = "BRL";
               break;
           case  2 :
                moeda = "GBP";
               break;
           case  3 :
               moeda = "EUR";
               break;
           case  4 :
               moeda = "USD";
               break;
           case  5 :
               moeda = "JPY";
               break;

           default:
               System.out.println("Digite um valor válido.");
               break;
       }



    }

    public String getMoeda() {
        return moeda;
    }


}
