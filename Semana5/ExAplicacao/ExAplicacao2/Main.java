package Semana5.ExAplicacao.ExAplicacao2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var carros = new ArrayList<Carro>();
        var motos = new ArrayList<Moto>();
        var onibus = new ArrayList<Onibus>();

        carros.add(new Carro("Ford Ka", "Zetec Rocam 1.2", 257));
        carros.add(new Carro("Fiat Uno", "Firefly 1.0", 290));

        motos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
        motos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));

        onibus.add(new Onibus("Mercedes Benz", "V8", 50, true));
        onibus.add(new Onibus("Scania Escolar", "V8", 15, false));

        for (var carro : carros) {
            System.out.println(carro.imprimir());
        }

        for (var moto : motos) {
            System.out.println(moto.imprimir());
        }

        for (var umOnibus : onibus) {
            System.out.println(umOnibus.imprimir());
        }
    }
}