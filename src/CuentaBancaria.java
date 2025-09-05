public class CuentaBancaria {
    private double saldo;

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;

        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso.");
        } else if (monto > saldo) {
            System.out.println("No se puede retirar la cantidad porque excede su saldo actual");
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
// Le pregunte a copilot de como hacer el ejercicio y me dijo que usara la variable if y else if para hacer el ejercicio
// aunque no la terminer de entender muy bien como funciona pero creo que si le coji un poquito el tiro