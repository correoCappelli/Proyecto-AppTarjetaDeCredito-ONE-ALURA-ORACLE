import com.aluraone.apptarjetas.interfaces.Credito;
import com.aluraone.apptarjetas.modelos.*;
import com.aluraone.apptarjetas.calculos.CompraConTarjetaACredito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        DeCredito creditoUno = new DeCredito("creditoUno",2000,"contacto",123);
        System.out.println("Credito Inicial :  " + creditoUno.getCreditoTarjeta());

        Scanner teclado = new Scanner(System.in);


        System.out.println("Desea comprar con la tarjeta ? 1-Si , 2-No");

        int res = teclado.nextInt();
        int totalValor = 0;

        while (res == 1){

            System.out.println("Ingrese tipo y valor");
            Compra item = new Compra(teclado.next(),teclado.nextInt());
            DeCredito tarjeta = (DeCredito) creditoUno;
            tarjeta.getListaDeCompras().add(item);
            totalValor+=item.getValorItem();
            System.out.println("Desea seguir comprando ? 1-Si, 2-No");
            res = teclado.nextInt();
        }

    CompraConTarjetaACredito calcularCredito = new CompraConTarjetaACredito();
        calcularCredito.ComprarACredito(creditoUno,totalValor);
        System.out.println("Credito Final :  " + creditoUno.getCreditoTarjeta());

        for (int i = 0; i < creditoUno.getListaDeCompras().size(); i++) {
            System.out.println(creditoUno.getListaDeCompras().get(i).getDescripcion() + " " + creditoUno.getListaDeCompras().get(i).getValorItem() );
        }

    }
}
