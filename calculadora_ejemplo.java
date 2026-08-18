public class calculadora_ejemplo {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }
    // Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    // Método para sumar dos números de punto flotante
    public double sumar(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        calculadora_ejemplo calculadora = new calculadora_ejemplo();

        System.out.println("Suma de enteros: " + calculadora.sumar(5, 10));
        System.out.println("Suma de tres enteros: " + calculadora.sumar(5, 10, 15));
        System.out.println("Suma de números de punto flotante: " + calculadora.sumar(5.5, 10.5));
    }
}