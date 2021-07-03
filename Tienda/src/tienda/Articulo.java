
package tienda;

public abstract class Articulo implements IPrintable{
    
    String nombre;
    int id;
    final double iva = 1.16;
    double precio;
    int cantidad;
    String descripcion;

//Implementamos IPrintable

    
@Override    
public void ver(){


}        
    
    
//Contructor    
    
public Articulo(int cantidad,double precio,String descripcion,String nombre){
this.id=++id;
}    
    
    
    
    
    
//Metodos setters
    
void setnombre(String nombre){
this.nombre=nombre;
}    

void setid(int id){
this.id=id;
}
    
void setprecio(double precio){
this.precio=precio;
}
    
void setcantidad(int cantidad){
this.cantidad=cantidad;
}

void setdescripcion(String descripcion){
this.descripcion=descripcion;
}

//Metodos getters

double getprecio(){
return precio;
}

int getid(){
return id;
}

int getcantidad(){
return cantidad;
}

String getdescripcion(){
return descripcion;
}

String getnombre(){
return nombre;
}

//Metodos abstractos


abstract double getSubtotal();

double getTotal(){
return getSubtotal()*iva;
}



}

