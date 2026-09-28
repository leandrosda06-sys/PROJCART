package Negocio;

public class Cart{
    public int potencia;
    double velocidad;

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= potencia;
    }
}
