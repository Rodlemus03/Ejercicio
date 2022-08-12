public class Perro {
    private String nombre;
    private String raza;
    private boolean estado;
    
    public Perro(String nombre, String raza, boolean estado){
        this.nombre=nombre;
        this.raza=raza;
        this.estado=estado;
    }
    //gets
    public String getNombre(){return this.nombre;}
    public String getRaza(){return this.raza;}
    public boolean getEstado(){return this.estado;}
    //Sets
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setRaza(String raza){this.raza=raza;}
    public void setEstado(boolean estado){this.estado=estado;}
    //ToString
    public String toString(){
        String cadena="";
        cadena+="Nombre: "+this.nombre;
        cadena+="\nRaza: "+this.raza;
        cadena+="\nPerdido: "+this.estado;
        return cadena;

    }
}
