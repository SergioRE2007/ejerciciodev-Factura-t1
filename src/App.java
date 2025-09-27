public class App {

    public static final String NEGRO = "\u001B[0m";
    public static final String AZUL = "\u001B[44m";
    public static void main(String[] args) throws Exception {
        
         System.out.println(AZUL+"                                                                                                    "+NEGRO);
        System.out.println("");
        System.out.println("");
        System.out.println("Rojo Polo Paellla Inc.");
        System.out.println("");
        System.out.println("Carretera Muelle 38");
        System.out.println("892344 Ávila, Ávila");
        System.out.println("");
        System.out.println("");
        System.out.printf("%-30s%-30s%-30s%10s%n", "Facturar A", "ENVIAR A", "Nº DE FACTURA", "ES-001");
        System.out.println("");
        System.out.printf("%-30s%-30s%-30s%10s%n", "Leda villareal", "Leda villareal", "Nº DE FACTURA", "ES-001");
        System.out.printf("%-30s%-30s%-30s%10s%n", "Virgen blanca 63", "Cercas bajas 68", "FECHA", "29.01.2019");
        System.out.printf("%-30s%-30s%-30s%10s%n", "089668 Burgos, burgos", "47300 C,adiz, Cádiz", "Nº DE PEDIDO", "1730/2019");
        System.out.printf("%-30s%-30s%-30s%10s%n", "", "", "FECHA", "29.3.2003");
        System.out.printf("%-30s%-30s%-30s%10s%n", "", "", "VENCIMIENTO", "");
        System.out.println("____________________________________________________________________________________________________");
        System.out.println("");
        System.out.printf("%-90s%-90s%n", " Total Factura", "199,65$");
        System.out.println("____________________________________________________________________________________________________");
        System.out.println("");
        System.out.printf("%-10s%-50s%10s%30s%n", "Cant.", "Descripcion", "Precio", "Importe");
        System.out.printf("%-10s%-50s%10s%30s%n", "", "", "Unitario", "");
        System.out.printf("%-10s%-50s%10s%30s%n", "1", "Talla pequeña traje luces en rojo", "100,00", "100,00");
        System.out.printf("%-10s%-50s%10s%30s%n", "2", "Muy grando churrolitro", "25,00", "50,00");
        System.out.printf("%-10s%-50s%10s%30s%n", "3", "Equipaje de futbol", "5,00", "15,00");
        System.out.println("");
        System.out.printf("%70s%30s%n",   "SubTotal", "165,00");
        System.out.printf("%70s%30s%n",   "IVA 21,0%", "34,65");
        System.out.println("");
        System.out.println("");

    }
}
