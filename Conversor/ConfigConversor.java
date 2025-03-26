package Conversor;

public class ConfigConversor {
    public double CelsiusParafahrenheit (double a) {
        return (a * 9/5) + 32;
    }

    public double FahrenheitParaCelsius (double b) {
        return (b - 32) * 5/9;
    }
        
    public double MetroParaQuilometro (double c) {
        return c / 1000;
    }

    public double QuilomentroParaMetro (double d) {
        return d * 1000;
    }
}
