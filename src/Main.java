//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(500);
        cuenta.retirar(0); // aca se poner lo que usted quiera retirar ( la cantidad )
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
        }

