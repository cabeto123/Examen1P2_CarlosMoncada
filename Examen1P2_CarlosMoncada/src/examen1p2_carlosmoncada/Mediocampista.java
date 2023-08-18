/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class Mediocampista extends Jugador {
    public Mediocampista(){
    
    }
    
    public Mediocampista(   String nombre, int edad, String nacionalidad, String piehabil) {
    this.edad=edad;
      this.nacionalidad=nacionalidad;
      this.nombre=nombre;
      this.piehabil=piehabil;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPiehabil() {
        return piehabil;
    }

    public void setPiehabil(String piehabil) {
        this.piehabil = piehabil;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    @Override
    public void ratingAgarre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ratingLanzamiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ratingPassing() {
        int random = 0;
        while (random < 70 || random > 100) {
            random = (int) ((Math.random() * (12 - 1) + 1));
            random *= 12;
        }

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
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
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
        int random = 0;
        while (random < 70 || random > 100) {
            random = (int) ((Math.random() * (12 - 1) + 1));
            random *= 12;
        }

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
        int random = (int) ((Math.random() * (5 - 1) + 1));
        random *= 13;
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
