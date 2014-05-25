/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1013343
 */
public class Circulo extends Elipse {
    public Circulo (double raio) {
        super(raio, raio); }
    
    public double getPerimetro(Elipse esta) {
        return 2*Math.PI*eixo1; }
    
}
