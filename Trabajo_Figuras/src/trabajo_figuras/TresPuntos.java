package trabajo_figuras;

public class TresPuntos {

    private double x;
    private double y;

    public TresPuntos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(TresPuntos parametros) {
        double dista_1 =x-parametros.getX();
        double dista_2 =y-parametros.getY();
        double hipotenusa = Math.sqrt(dista_1*dista_1 + dista_2*dista_2);
        return hipotenusa;
    }
    public String toString(){
        return "(x= " + getX() + ", y= " + getY() + " )";
    }

    
}

