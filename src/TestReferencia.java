public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(3);
        primeraCuenta.setNumero(300);

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.setNumero(200);

        System.out.println(primeraCuenta.getNumero());
        System.out.println(segundaCuenta.getNumero());
        segundaCuenta.setNumero(500);
        System.out.println(primeraCuenta.getNumero());

        Cliente andres = new Cliente();
        andres.setDocumento("75643225");
        andres.setTelefono("3456576");
        andres.setNombre("Andres");

        Cuenta cuentaAndres = new Cuenta(1);
    }
}
