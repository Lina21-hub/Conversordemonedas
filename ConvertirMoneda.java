import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir (String monedaBase, String monedaTarget, ConsultarMoneda consultar, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consultar.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1"+monedaBase+"="+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingresa la cantidad "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase + "=" + cantidadConvertida+" "+ monedas.conversion_rate());
    }
    public static  void convertirOtraMoneda(ConsultarMoneda consultar, Scanner lectura){
        System.out.println("Ingrese el codigo de la monda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la Moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consultar,lectura);
    }
}
