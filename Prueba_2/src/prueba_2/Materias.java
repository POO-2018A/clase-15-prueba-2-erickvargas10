/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_2;

/**
 *
 * @author ESFOT
 */
public class Materias {
    private String nombreMateria;
    private String nivel;

    public Materias(String nombreMateria, String nivel) {
        this.nombreMateria = nombreMateria;
        this.nivel = nivel;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Materias{" + "Materia: " + nombreMateria + " - "+ nivel + ", Nivel=" +'}';
    }
    
    
    
    
    
    
}
