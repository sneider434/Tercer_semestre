package Ejercicio_3;

public class Administracion_cuenta {
    // declaracion de variables
    String numero_cuenta;
    double saldo;
    String titular;

    // cuenta bancaria de la persona
    public Administracion_cuenta(String numero_cuenta, String titular){
        this.numero_cuenta = numero_cuenta;
        this.titular= titular;
        this.saldo=0.0;
    }
    // obtener numero de cuenta
    public String getNumero_cuenta(){
        return numero_cuenta;
    }
    // obtener saldo
    public double getSaldo(){
        return saldo;
    }
    // obtener nombre del titular
    public String getTitular(){
        return titular;

    }
    public void depositar( double cantidad);{
        if( cantidad > 0){
            saldo -= cantidad;
        }
    }
    public boolean retirar(double cantidad){
        if(cantidad >0 && cantidad <= saldo){

        }
    }
}
