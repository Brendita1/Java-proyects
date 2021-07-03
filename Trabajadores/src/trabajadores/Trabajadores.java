/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

/**
 *
 * @author Usuario
 */
public class Trabajadores  implements IPrintable{

        public String nombre;
        public String apellido;
        public int num_empleado;
        public int edad;
        public String fecha_nacimiento;
        public int salario;
        public String area;
        public int lineaxhora;
        public String lenguaje_usado;
       public int num_empleados_responsabilidad;
       public int insidencias_resueltas;
    public String area_responsabilidad;
    @Override
    public void printable() {
         System.out.println("Nombre : "+nombre);
         System.out.println("Apellidos : "+apellido);
         System.out.println("Numero de Empleado : "+num_empleado);
         System.out.println("Edad : "+getEdad());
         System.out.println("Fecha de nacimiento : "+fecha_nacimiento);
         System.out.println("Salario : "+salario);
         System.out.println("Area : "+area);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Trabajadores(String nombre, String apellido, int num_empleado, int edad, String fecha_nacimiento, int salario, String area) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_empleado = num_empleado;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.salario = salario;
        this.area = area;
    }

    @Override
    public void printable_p() {
  
        System.out.println("Lineas por hora : "+lineaxhora);
        System.out.println("Lenguaje : "+lenguaje_usado);
   
    }

    public int getLineaxhora() {
        return lineaxhora;
    }

    public void setLineaxhora(int lineaxhora) {
        this.lineaxhora = lineaxhora;
    }

    public String getLenguaje_usado() {
        return lenguaje_usado;
    }

    public void setLenguaje_usado(String lenguaje_usado) {
        this.lenguaje_usado = lenguaje_usado;
    }

    @Override
    public void printable_soporte() 
    {
     System.out.println("El numero de insidencias resueltas es :"+insidencias_resueltas);
     System.out.println("El area de responsabilidad es :"+area_responsabilidad);
    }

    @Override
    public void printable_gerente() 
    {
     System.out.println("El numero de empleados bajo responsabilidad es :"+num_empleados_responsabilidad);      
    }

    public int getNum_empleados_responsabilidad() {
        return num_empleados_responsabilidad;
    }

    public void setNum_empleados_responsabilidad(int num_empleados_responsabilidad) {
        this.num_empleados_responsabilidad = num_empleados_responsabilidad;
    }

    public int getInsidencias_resueltas() {
        return insidencias_resueltas;
    }

    public void setInsidencias_resueltas(int insidencias_resueltas) {
        this.insidencias_resueltas = insidencias_resueltas;
    }

    public String getArea_responsabilidad() {
        return area_responsabilidad;
    }

    public void setArea_responsabilidad(String area_responsabilidad) {
        this.area_responsabilidad = area_responsabilidad;
    }

  
    
    
}
