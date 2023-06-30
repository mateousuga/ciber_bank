public class pruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(2);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println(cuenta.getsaldo());
    }
}
