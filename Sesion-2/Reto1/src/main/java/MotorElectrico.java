public class MotorElectrico {
    private boolean conectado = false;

    public MotorElectrico(){
        System.out.println("Creando motor electrico");
        this.conectado = false;
    }

    public void conectar(){
        System.out.println("Conectando motor electrico");
        this.conectado = true;
    }

    public void activar(){
        if(!this.conectado){
            System.out.println("No se puede activar porque no esta conectado el motor electrico");
        }
        else {
            System.out.println("Esta conectado, activando motor electrico");
        }
    }

    public void moverMasRapido(){
        if (!this.conectado){
            System.out.println("No se puede mover mas rapido el motor porque no esta conectado");
        }
        else {
            System.out.println("Moviendo mas rapido");
        }
    }

    public void detener(){
        if(!this.conectado){
            System.out.println("No se puede detener el motor electrico porque esta desconectado");
        }
        else {
            System.out.println("Deteniendo motor electrico");
        }
    }

    public void desconectar(){
        System.out.println("Desconectado motor electrico...");
        this.conectado = false;
    }

}