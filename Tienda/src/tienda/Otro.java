package tienda;

public class Otro extends Articulo implements IPrintable{

String categoria;

@Override
public void ver(){
    System.out.println("ID: "+id);
    System.out.println("Nombre: "+nombre);
    System.out.println("Descuento: "+descripcion); 
    System.out.println("Categoria: "+categoria);
    System.out.println("Subtotal: "+getSubtotal());
    System.out.println("Total: "+getTotal());

}


public Otro (int cantidad,double precio,String descripcion,String nombre,String categoria){
super(cantidad,precio,descripcion,nombre);
this.categoria=categoria;
}


@Override
double getSubtotal(){
return cantidad*precio;
}



    
}
