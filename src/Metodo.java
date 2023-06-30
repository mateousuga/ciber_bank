public class Metodo {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(3);
        miCuenta.depositar(300);
        miCuenta.depositar(500);
        System.out.println(miCuenta.getsaldo());

        miCuenta.retirar(100);
        System.out.println(miCuenta.getsaldo());

        Cuenta cuentaAmigo = new Cuenta(2);
        cuentaAmigo.depositar(1000);
        boolean transferencia = cuentaAmigo.transferir(400, miCuenta);
        if (transferencia) {
            System.out.println("trasnferencia exitosa");
        } else {
            System.out.println("Transferencia erronea");
        }
        System.out.println(miCuenta.getsaldo());
        System.out.println(cuentaAmigo.getsaldo());
    }
}
