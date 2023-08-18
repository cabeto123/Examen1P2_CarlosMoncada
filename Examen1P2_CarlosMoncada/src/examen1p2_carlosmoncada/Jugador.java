/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class Jugador {
    String nombre;
    int edad;
    String nacionalidad;
    String piehabil;
    int rating;
    Equipo equipo;
    int agarre;
    int lanzamiento;
    int fisico;
    int ritmo;
    int entrada;
    int vision;
    int passing;
    int regate;
    int disparo;

    public Jugador(String nombre, int edad, String nacionalidad, String piehabil, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.piehabil = piehabil;
        this.equipo = equipo;
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
    public String toString() {
        return "Nombre= " + nombre + " Edad= " + edad + "Nacionalidad= " + nacionalidad + "Pie habil= " + piehabil + "Rating= " + rating + "Equipo=" + equipo + "Agarre=" + agarre + "Lanzamiento= " + lanzamiento + "Fisico= " + fisico + "Ritmo=" + ritmo + "Entrada=" + entrada + "Vision= " + vision + "Passing= " + passing + "Regate= " + regate + "Disparo= " + disparo ;
    }
    
}
