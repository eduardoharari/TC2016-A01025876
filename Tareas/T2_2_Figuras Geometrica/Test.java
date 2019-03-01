/**
 * Test
 */
public class Test 
{
    public static void main(String[] args) 
    {
        Cuadrado c = new Cuadrado(23.339865);
        Rectangulo r = new Rectangulo(25, 32);
        Triangulo t = new Triangulo(10, 15, 34, 16);
        Trapecio tr = new Trapecio(25, 13, 15); // area
        Trapecio tra = new Trapecio(25, 24, 23, 14); //  perimetro
        Rombo rombo = new Rombo(13, 14, 17);
        Romboide romboide = new Romboide(13,14);

        c.getArea();
        c.getPerimetro();
        c.print();
        r.getArea();
        r.getPerimetro();
        r.print();
        t.getArea();
        t.getPerimetro();
        t.print();
        tr.getArea();
        tra.getPerimetro();
        tr.printA();
        tra.printP();
        rombo.getArea();
        rombo.getPerimetro();
        rombo.print();
        romboide.getArea();
        romboide.getPerimetro();
        romboide.print();
       
        
        
    }

    
}