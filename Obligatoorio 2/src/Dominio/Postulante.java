/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Juan Pedro Alvarez, Juan Diego Vieites
 */
public class Postulante {
    private String nombre;
    private int cedula;
    private String direccion;
    private int telefono;
    private String mail;
    private String linkedin;

    public Postulante() {
    }
    
    public Postulante(String nombre, int cedula, String direccion, int telefono, String mail, String linkedin) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
    }
    
    
    
}
