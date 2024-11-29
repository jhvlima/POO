public class Triangulo {

    private Ponto p1, p2, p3;

    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.p1 = new Ponto(x1, y1);
        this.p2 = new Ponto(x2, y2);
        this.p3 = new Ponto(x3, y3);
    }

    public double distancia(Ponto p1, Ponto p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public double calculaPerimetro() {
        return this.distancia(p1, p2) + this.distancia(p1, p3) + this.distancia(p2, p3);
    }
}