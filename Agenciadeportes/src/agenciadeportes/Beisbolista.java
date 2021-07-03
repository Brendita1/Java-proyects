package agenciadeportes;

public class Beisbolista extends Deportista {
  private String posicion;
  private int numHomeRuns;
  private int numStrikes;

    public Beisbolista(String posicion, int numHomeRuns, int numStrikes, String nombre, int edad, double pagaBase) {
        super(nombre, edad, pagaBase);
        this.posicion = posicion;
        this.numHomeRuns = numHomeRuns;
        this.numStrikes = numStrikes;
    }

    

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumHomeRuns() {
        return numHomeRuns;
    }

    public void setNumHomeRuns(int numHomeRuns) {
        this.numHomeRuns = numHomeRuns;
    }

    public int getNumStrikes() {
        return numStrikes;
    }

    public void setNumStrikes(int numStrikes) {
        this.numStrikes = numStrikes;
    }

    public String imprimirDeportista() {    
        System.out.println("Ingrese posicion:\n(Picher o Bateador)\n");
        posicion = sc.nextLine();
        if("Picher".equals(posicion)){
            System.out.println("Ingrese número de strikes:\n");
            numStrikes = sc.nextInt();
            return "EL " + posicion + " tiene " + numStrikes + " Strikes";
        }else
            if("Bateador".equals(posicion)){
                System.out.println("Ingrese numero de home runs:\n");
                numHomeRuns = sc.nextInt();
                return "EL " + posicion + " tiene " + numHomeRuns + " Home Runs";
            }
        return null;
    }

}
