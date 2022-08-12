import java.util.Random;
public class Acciones {
    Perro perro=new Perro("nombre", "raza", false);
    private Random rand=new Random();
    Persona persona=new Persona("nombre", "apellido", "numero", rand.nextInt(1,1000)+1);
    public Acciones(String nombre, String raza, boolean estado,String nombrePersona, String apellidoPersona,String numeroPersona){
        perro.setNombre(nombre);
        perro.setRaza(raza);
        perro.setEstado(estado);
        persona.setNombre(nombrePersona);
        persona.setApellido(apellidoPersona);
        persona.setNumero(numeroPersona);

    }
    public String llamarPerrera(){
        int suerte=rand.nextInt(0,20)+1;
        if(suerte>=0 && suerte<=5){
            return "Lo siento, ya se han llevado a su perro "+perro.getNombre();
        }else{return "Aqui esta su perro "+perro.getNombre()+"----"+persona.darRecompensa();}
    }
    public String Cartel(){
        int suerte=rand.nextInt(0,20)+1;
        if(suerte>=0 && suerte<=10){
            return "Hemos encontrado a su perrito "+perro.getNombre()+"----"+persona.darRecompensa();
        }else{
            return "Lo siento no es su perrito ";
        }
    }
    public String anuncio(){
        int suerte=rand.nextInt(0,20)+1;
        if(suerte>=0 && suerte<=15){
            return "Hemos encontrado a tu perrito "+perro.getNombre()+"----"+persona.darRecompensa();
        }else{
            return "Lo siento no hemos encontrado a tu perro";
        }
    }
}
