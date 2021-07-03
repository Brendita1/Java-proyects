
package agenciadeportes;

public class Futbolista extends Deportista {
    private String posicion;
    private int numGoles;
    private int numParadas;
    
    public Futbolista(String posicion, int numGoles, int numParadas, String nombre, int edad, double pagaBase) {
        super(nombre, edad, pagaBase);
        this.posicion = posicion;
        this.numGoles = numGoles;
        this.numParadas = numParadas;
    }

    public String getPosicion() {
        System.out.println("Elija opcion.\n");
        System.out.println("1.-Portero\n2.-Delantero\n");
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public int getNumParadas() {
        return numParadas;
    }

    public void setNumParadas(int numParadas) {
        this.numParadas = numParadas;
    }

    @Override
    public  String imprimirDeportista() {
        System.out.println("Posicion:\n(Delantero o Portero\n");
        posicion = sc.nextLine();
        if("delantero".equals(posicion)){
            System.out.println("Ingrese numero de goles:\n");
            numGoles = sc.nextInt(); 
            return "El delantero: " + posicion + " tiene " + numGoles + " goles";
        }else
            if("portero".equals(posicion)){
                System.out.println("Ingrese numero de atajadas:\n");
                numParadas = sc.nextInt();
                return  "El " + posicion + " tiene " + numParadas + " paradas";
            }
    
            
    }

    @Override
    public double calcularPaga() {
        double porcentajePorGoles;
        if(numGoles != 0){
            porcentajePorGoles =(double) numGoles + 0.10;
            return (super.getPagaBase() * porcentajePorGoles); // regresa el aumento por cantidad de goles
        }else
            return super.getPagaBase();
    }
    
}
