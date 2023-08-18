/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class Delantero extends Jugador {

    public Delantero(){
    }
    public Delantero(   String nombre, int edad, String nacionalidad, String piehabil) {
    this.edad=edad;
      this.nacionalidad=nacionalidad;
      this.nombre=nombre;
      this.piehabil=piehabil;
    }


    @Override
    public void ratingAgarre() {
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
        this.agarre = random;
    }

    @Override
    public void ratingLanzamiento() {
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
        this.lanzamiento = random;
    }

    @Override
    public void ratingPassing() {
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
        this.passing = random;
    }

    @Override
    public void ratingFisico() {
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
        this.fisico = random;
    }

    @Override
    public void ratingRitmo() {
        int random = 0;
        while (random < 70 || random > 100) {
            random = (int) ((Math.random() * (12 - 1) + 1));
            random *= 12;
        }

        this.ritmo = random;
    }

    @Override
    public void ratingEntrada() {
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
        this.entrada = random;
    }

    @Override
    public void ratingVision() {
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
        this.vision = random;
    }

    @Override
    public void ratingRegate() {
        int random = 0;
        while (random < 70 || random > 100) {
            random = (int) ((Math.random() * (12 - 1) + 1));
            random *= 12;
        }

        this.regate = random;
    }

    @Override
    public void ratingDisparo() {
        int random = 0;
        while (random < 70 || random > 100) {
            random = (int) ((Math.random() * (12 - 1) + 1));
            random *= 12;
        }

        this.disparo = random;
    }

    @Override
    public void Calcularrating() {
        this.rating = this.agarre + this.lanzamiento + this.fisico + this.ritmo + this.entrada + this.vision + this.passing + this.regate + this.disparo / 9;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
