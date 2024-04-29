package br.com.rafaelmeloni.conversordemoedas.principal;

import br.com.rafaelmeloni.conversordemoedas.modelos.BuscadorValores;
import br.com.rafaelmeloni.conversordemoedas.modelos.MenuOrigem;
import br.com.rafaelmeloni.conversordemoedas.modelos.ValorMoedasAtualizado;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        var menu = new MenuOrigem();
        menu.chamaMenu("origem");
        String moeda1 = menu.getMoeda();
        menu.chamaMenu("Destino");
        String moeda2 = menu.getMoeda();
        System.out.println("Agora digite o valor à ser convertido: ");
        double quantidade = leitura.nextDouble();
        BuscadorValores buscadorValores = new BuscadorValores();
        ValorMoedasAtualizado valorMoedasAtualizado = buscadorValores.buscaValores(moeda1, moeda2,quantidade);
        String mensagem = """
                O valor : %.2f em: %s convertido para %s é igual a %.2f
                
                """.formatted(quantidade,moeda1,moeda2,valorMoedasAtualizado.conversion_result());
        System.out.println(mensagem);



    }
}
