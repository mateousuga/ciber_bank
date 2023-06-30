public class pruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(12);
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setDocumento("243567565");

        cuenta.setTitular(cliente);
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getAgencia());
    }
}
