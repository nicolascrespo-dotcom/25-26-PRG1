import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos euros debe pagar?");
        int pagar = sc.nextInt();
        System.out.println("¿Con cuántos euros paga?");
        int entrega = sc.nextInt();

        int cambio = entrega - pagar;
        int[] valores = {100, 50, 20, 10, 5, 2, 1};
        String[] tipo = {"billete(s)", "billete(s)", "billete(s)", "billete(s)", "billete(s)", "moneda(s)", "moneda(s)"};

        for (int i = 0; i < valores.length; i++) {
            int cantidad = cambio / valores[i];
            System.out.println(cantidad + " " + tipo[i] + " de " + valores[i] + " €");
            cambio = cambio % valores[i];
        }
    }
}
