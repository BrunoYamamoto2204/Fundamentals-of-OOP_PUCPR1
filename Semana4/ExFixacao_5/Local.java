package Semana4.ExFixacao_5;

import java.util.ArrayList;

class Local {
    private String nome;
    private double latitude;
    private double longitude;

    public Local(String nome, double latitude, double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

class Rota {
    private ArrayList<Local> locais;

    public Rota() {
        locais = new ArrayList<Local>();
    }

    public void addLocal(Local local) {
        locais.add(local);
    }

    // Este é um exemplo de como você pode calcular a distância.
    // Esta função supõe que a latitude e longitude são coordenadas cartesianas 2D simples.
    // Em uma aplicação real, você precisaria usar uma fórmula como a Fórmula de Haversine, que leva em conta a curvatura da Terra.
    public double calcularDistanciaTotal() {
        double totalDistancia = 0.0;
        for (int i = 0; i < locais.size() - 1; i++) {
            double xDist = locais.get(i).getLatitude() - locais.get(i+1).getLatitude();
            double yDist = locais.get(i).getLongitude() - locais.get(i+1).getLongitude();
            totalDistancia += Math.sqrt(xDist*xDist + yDist*yDist);
        }
        return totalDistancia;
    }

    public static void main(String[] args) {
        Local l1 = new Local("Ponto A", 10, 20);
        Local l2 = new Local("Ponto B", 30, 40);
        Local l3 = new Local("Ponto C", 50, 60);

        Rota rota = new Rota();
        rota.addLocal(l1);
        rota.addLocal(l2);
        rota.addLocal(l3);

        System.out.println("Distância total da rota: " + rota.calcularDistanciaTotal());
    }
}
