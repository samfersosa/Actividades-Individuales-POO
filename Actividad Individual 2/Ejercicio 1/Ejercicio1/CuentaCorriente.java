public class CuentaCorriente extends Cuenta {

    float sobregiro;

    public CuentaCorriente(float saldo, float tasa) {
    super(saldo, tasa); 
    sobregiro = 0; 
    }
   
    public void retirar(float cantidad) {
    float resultado = saldo - cantidad; 
    if (resultado < 0) {
    sobregiro = sobregiro - resultado;
    saldo = 0;
    } else {
    super.retirar(cantidad); 
    }
    }
   
    public void consignar(float cantidad) {
    float residuo = sobregiro - cantidad;
    }
}