public class Calculadora {
    public double pi = 3.14;

    public int adicao(int x, int y) {
        return x + y;
    }

    public int subtracao(int x, int y) {
        return x - y;
    }
	
    public int multiplicacao(int x, int y) {
        return x * y;
    }
	
    public double divisao(int x, int y) {
        return x / y;
    }

    // Desenvolver os cálculos
    public int areaQuadrado(int x) {
        int A = x * x; // Fórmula: A=a^2
        return A;
    }

    public double areaTrianguloRetangulo(int x, int y) {
        return (x * y ) / 2;
        // Fórmula: A=b.h/2
        // Sendo b = base
        // h = altura
    }

    public double areaCircunferencia(int x) {
        double A = pi * (x * x);
        return A;
        // Fórmula: A=(pi)r^2
        // pi = 3.14
        // sendo r = raio
    }

    public double areaEsfera(int x) {
        double A = 4 * pi * (x * x);
        return A;
        // Fórmula: A=4(pi)r^2
    }

    public double volumeEsfera(int x) {
        double V = (4 / 3) * pi * (x * x * x); // Fórmula: V=4/3(pi)r^3
        return V;
    }

    public double areaCilindro(int x, int y) {
        double A = 2 * pi * x * (x + y); // Fórmula: A=2(pi)r(r+h)
        return A;
    }

    public double volumeCilindro(int x, int y) {
        double V = pi * (x * x) * y; // Fórmula: V=(pi)r^2h
        return V;
    }

    public int areaSuperficieCubo(int x) {
        int A = 6 * (x * x); // Fórmula: A=6a^2
        return A;
    }

    public int volumeCubo(int x) {
        int V = x * x * x; // Fórmula: V=a^3
        return V;
    }
}