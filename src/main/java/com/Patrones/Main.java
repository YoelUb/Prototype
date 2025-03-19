package com.Patrones;

import com.Patrones.prototype.Circulo;
import com.Patrones.prototype.Forma;
import com.Patrones.prototype.Rectangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        Circulo circulo = new Circulo();
        circulo.setX(10);
        circulo.setY(10);
        circulo.setRadio(20);
        formas.add(circulo);

        Circulo otroCirculo = (Circulo) circulo.clonar();
        formas.add(otroCirculo);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setX(5);
        rectangulo.setY(5);
        rectangulo.setAncho(10);
        rectangulo.setAlto(20);
        formas.add(rectangulo);

        List<Forma> copiaFormas = new ArrayList<>();
        for (Forma forma : formas) {
            copiaFormas.add(forma.clonar());
        }

        System.out.println("Objetos clonados correctamente.");
    }
}