/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * modificado por Tomás Abril
 */
public class Pratica41 {
    public static void main(String[] args) {
	    Circulo cins = new Circulo(1);
	    Elipse eins = new Elipse(1, 2);
	    
	    System.out.println("circulo: \n area: " + cins.getArea(cins) + 
	      "\n perimetro: " + cins.getPerimetro(cins) );
	    System.out.println("elipse: \n area: " + eins.getArea(eins) + 
	      "\n perimetro: " + eins.getPerimetro(eins) );
    } }
