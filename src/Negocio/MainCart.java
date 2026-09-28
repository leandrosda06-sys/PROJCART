package Negocio;

public class MainCart {

    static void main() {
        Cart c1 = new Cart();

        c1.potencia = 80;
        c1.velocidad = 60;

        c1.potencia = 55;
        c1.velocidad = 700;

        c1.potencia = 90;
        c1.velocidad = 80;


        System.out.println("La potencia del carro es " + c1.potencia + " Y la velocidad es " + c1.velocidad);

        c1.acelerar();
        c1.acelerar();
        c1.frenar();


        System.out.println("La potencia del carro es " + c1.potencia + " Y la velocidad es " + c1.velocidad);
        System.out.println("La potencia del carro es " + c1.potencia + " Y la velocidad es " + c1.velocidad);
        System.out.println("La potencia del carro es " + c1.potencia + " Y la velocidad es " + c1.velocidad);
    }
}