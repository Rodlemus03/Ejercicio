public class Persona {
    private String nombre;
    private String apellido;
    private String numero;
    private int dinero;
    //Constructor
    public Persona(String nombre, String apellido, String numero,int dinero){
        this.nombre=nombre;this.apellido=apellido;this.numero=numero;this.dinero=dinero;
    }
    //Metodos
    public String darRecompensa(){return "Aqui esta su recompensa: "+this.dinero;}
    //gets
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public String getNumero(){return this.numero;}
    public int getDinero(){return this.dinero;}
    //Sets
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellido(String apellido){this.apellido=apellido;}
    public void setNumero(String numero){this.numero=numero;}
    public void setDinero(int dinero){this.dinero=dinero;}
    //ToString
    public String toString(){
        String cadena="";
        cadena+="Nombre: "+this.nombre;
        cadena+="\nApellido: "+this.apellido;
        cadena+="\nNumero: "+this.numero;
        cadena+="\nDinero: "+this.dinero;
        return cadena;
        
    }
}
