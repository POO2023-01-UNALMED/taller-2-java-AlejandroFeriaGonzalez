

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
            if (asiento != null && asiento.registro == this.registro && asiento.registro  == this.motor.registro){
                continue;
            } else {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }

    public static void main(String[] args) {

		Auto a = new Auto();
		Motor m = new Motor();
		a.registro = 32;
		m.registro = 32;
		a.motor = m;
		a.asientos = new Asiento[5];
		a.asientos[0] = new Asiento();
		a.asientos[0].registro = 32;
		a.asientos[4] = new Asiento();
		a.asientos[4].registro = 32;
		
		
		Auto a2 = new Auto();
		Motor m2 = new Motor();
		a2.registro = 32;
		m2.registro = 32;
		a2.motor = m2;
		a2.asientos = new Asiento[5];
		a2.asientos[0] = new Asiento();
		a2.asientos[0].registro = 40;
		a2.asientos[4] = new Asiento();
		a2.asientos[4].registro = 32;

		boolean ok = false;
		
		if(a.verificarIntegridad().equals("Auto original") && 
				a2.verificarIntegridad().equals("Las piezas no son originales")) {
			ok = true;
		}

        System.out.println(ok);
    }
}
