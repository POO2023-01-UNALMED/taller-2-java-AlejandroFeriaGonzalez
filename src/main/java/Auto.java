

public class Auto {
    public String modelo, marca;
    public int precio, registro;
    public Asiento[] asientos;
    public Motor motor;
    public static int cantidadCreados;

    public int cantidadAsientos(){
        return this.asientos.length;
    }

    public String verificarIntegridad() {
        for (Asiento asiento : asientos) {
            if (asiento.registro == this.registro && asiento.registro  == this.motor.registro){
                
            } else {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
