public class MotorElectricoAdapter extends Motor{
    private MotorElectrico motorElectricoAdaptado;

    public MotorElectricoAdapter(){
        super();
        this.motorElectricoAdaptado = new MotorElectrico();
        System.out.println("Creando motor electrico adaptado");
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo motor electrico adaptado");
        this.motorElectricoAdaptado.conectar();
        this.motorElectricoAdaptado.activar();
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando el motor electrico adaptado");
        this.motorElectricoAdaptado.moverMasRapido();
    }

    @Override
    public void apagar(){
        System.out.println("Apagando motor electrico adaptado");
        this.motorElectricoAdaptado.detener();
        this.motorElectricoAdaptado.desconectar();
    }
}