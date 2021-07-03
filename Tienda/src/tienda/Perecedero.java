
package tienda;



public class Perecedero extends Articulo implements IPrintable {

int dias_por_caducar;

@Override
public void ver(){
    System.out.println("ID: "+id);
    System.out.println("Nombre: "+nombre);
    System.out.println("Descuento: "+descripcion); 
    System.out.println("Dias por expirar: "+dias_por_caducar);
    System.out.println("Subtotal: "+getSubtotal());
    System.out.println("Total: "+getTotal());

}




public Perecedero(int cantidad,double precio,String descripcion,String nombre,int dias){
super(cantidad,precio,descripcion,nombre);
this.dias_por_caducar=dias_por_caducar;

}



 @Override
 double getSubtotal() {
 double subtotal;
 
 switch(dias_por_caducar){
     case 1:    subtotal=getSubtotal()/4;
                break;
                
     case 2:    subtotal=getSubtotal()/3;
                break;
                
     case 3:    subtotal=getSubtotal()/2;
                break;
                
     case 0:    subtotal=getSubtotal()*0;
                break;
 
     default:   subtotal=getSubtotal();
                break;
 }
  
 
 
 return subtotal;
 
 
 
 
 
   
 }
 
 
 











    
}

