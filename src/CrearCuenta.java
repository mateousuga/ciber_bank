public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(2);
        primeraCuenta.depositar(400);
        System.out.println(primeraCuenta.getsaldo());

        Cuenta segundaCuenta = new Cuenta(3);
        segundaCuenta.depositar(4344);
        System.out.println(segundaCuenta.getsaldo());
    }
}
