package trabajo_figuras;

import java.util.Scanner;

public class Trabajo_Figuras {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int cont = 0;
        int x = 0;
        int y = 0;
        System.out.print("ingrese 3 o 4 puntos: ");
        int contPunto = Integer.parseInt(f.nextLine());

        while (cont < contPunto) {

            System.out.print("coordenada" + (cont + 1) + ": ");
            String coord = f.nextLine();

            String[] posicion = coord.split(",");
            String fila = posicion[0];
            String colum = posicion[1];

            x = Integer.parseInt(fila);
            y = Integer.parseInt(colum);
            
            String[][] matriz =new String[x][y];
            
            
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            cont++;
        }

    }

}
