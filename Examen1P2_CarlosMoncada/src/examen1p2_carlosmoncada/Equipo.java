/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_carlosmoncada;

import java.util.ArrayList;

/**
 *
 * @author calol
 */
public class Equipo {
String nombre;
String pais;
int ratingplantilla;
ArrayList<Jugador> plantilla= new ArrayList<>();

    public Equipo() {
    }

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    public void agregardelantero(Delantero j){
    plantilla.add(j);
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRatingplantilla() {
        return ratingplantilla;
    }

    public void setRatingplantilla(int ratingplantilla) {
        this.ratingplantilla = ratingplantilla;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }
    public void Calcularrating() {
        int suma=0;
        for (int i = 0; i < plantilla.size(); i++) {
            suma+=plantilla.get(i).getRating();
        }
        suma/=plantilla.size();
        this.ratingplantilla=suma;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
