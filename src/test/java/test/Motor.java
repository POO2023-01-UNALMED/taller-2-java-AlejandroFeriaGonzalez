package test;

public class Motor {
    public int numeroCilindros, registro;
    public String tipo;

    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    public void asignarTipo(String tipo) {
        if (tipo == "electrico" || tipo == "gasolina"){
            this.tipo = tipo;
        }
    }
}
