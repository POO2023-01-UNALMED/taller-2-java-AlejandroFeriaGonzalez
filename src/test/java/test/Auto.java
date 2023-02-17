package test;


public class Auto {
    public String modelo, marca;
    public int precio, registro;
    public Asiento[] asientos;
    public Motor motor;
    public static int cantidadCreados;

    public int cantidadAsientos(){
        int i = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {++i;}
        }
        return i;
    }

    public String verificarIntegridad() {
        for (Asiento asiento : asientos) {
            if (asiento == null){ continue;}

            if (asiento.registro == this.registro && asiento.registro  == this.motor.registro){
                continue;
            } else {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
