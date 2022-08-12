import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("A BUSCAR A TU PERRO ");
        String nombre="", apellido="", numero="";
        String nombrePerro="",raza="",estado="";
        boolean estadoDef=false;
        int opcion=0;
        while(opcion!=6){
            System.out.println("1. NUEVA PERSONA ");
            System.out.println("2. NUEVO PERRO ");
            System.out.println("3. LLAMAR PERRERA ");
            System.out.println("4. PONER POSTERS ");
            System.out.println("5. PONER ANUNCIO ");
            System.out.println("6. SALIR ");
            opcion=teclado.nextInt();
            if(opcion==1){
                System.out.println("Ingresa el nombre de la persona");
                nombre=teclado.next();
                System.out.println("Ingresa el apellido de la persona");
                apellido=teclado.next();
                System.out.println("Ingresa el numero de la persona");
                numero=teclado.next();
            }else if(opcion==2){
                System.out.println("Ingresa el nombre del perro");
                nombrePerro=teclado.next();
                System.out.println("Ingresa la raza del perro");
                raza=teclado.next();
                System.out.println("Esta perdido? ");
                estado=teclado.next();
                if(estado=="si"){estadoDef=true;}else{estadoDef=false;}
            }else if(opcion==3){
                Acciones accion=new Acciones(nombrePerro, raza, estadoDef, nombre, apellido, numero);
                System.out.println(accion.llamarPerrera());

            }else if(opcion==4){
                Acciones accion=new Acciones(nombrePerro, raza, estadoDef, nombre, apellido, numero);
                System.out.println(accion.Cartel());

            }else if(opcion==5){
                Acciones accion=new Acciones(nombrePerro, raza, estadoDef, nombre, apellido, numero);
                System.out.println(accion.anuncio());
            }else if(opcion==6){System.out.println("Feliz dia");}
        }
    }
}
