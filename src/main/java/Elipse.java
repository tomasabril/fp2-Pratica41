/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1013343
 */
public class Elipse {
    protected double eixo1;
    protected double eixo2;
    
    public Elipse(double eixo1, double eixo2) {
        this.eixo1 = eixo1;
        this.eixo2 = eixo2; }
    
    public double getArea(Elipse esta) {
        return Math.PI*this.eixo1*this.eixo2; }
    
    public double getPerimetro(Elipse esta) {
        return Math.PI*(3*(this.eixo1+this.eixo2)-Math.sqrt
        ((3*this.eixo1+this.eixo2)*(this.eixo1+3*this.eixo2))); }
    
}
