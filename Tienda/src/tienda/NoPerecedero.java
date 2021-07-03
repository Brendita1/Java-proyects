package tienda;


public class NoPerecedero extends Articulo implements IPrintable{

    
String tipo;
    
    

@Override
public void ver(){
    System.out.println("ID: "+id);
    System.out.println("Nombre: "+nombre);
    System.out.println("Descripcion: "+descripcion); 
    System.out.println("Tipo: "+tipo);
    System.out.println("Total: "+getTotal());

}




public NoPerecedero(int cantidad,double precio,String descripcion,String nombre,String tipo){
super(cantidad,precio,descripcion,nombre);
this.tipo=tipo;
}



@Override
double getSubtotal(){
return cantidad * precio;
}









//Metodos setters
    
@Override
void setnombre(String nombre){
this.nombre=nombre;
}    

@Override
void setid(int id){
this.id=id;
}
    
@Override
void setprecio(double precio){
this.precio=precio;
}
    
@Override
void setcantidad(int cantidad){
this.cantidad=cantidad;
}

@Override
void setdescripcion(String descripcion){
this.descripcion=descripcion;
}

//Metodos getters

@Override
double getprecio(){
return precio;
}

@Override
int getid(){
return id;
}

@Override
int getcantidad(){
return cantidad;
}

@Override
String getdescripcion(){
return descripcion;
}

@Override
String getnombre(){
return nombre;
}







}
