package trabajo_figuras;

import java.util.Scanner;

public class Trabajo_Figuras {
 public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        while (true) {
            int cont = 0;
            double x = 0, y = 0, x1 = 0, y1 = 0, z = 0, z1 = 0, resta1,
                    resta2, resta3, pot1, pot2, pot3, suma1, suma2, suma3, raiz1,
                    raiz2, raiz3;

            System.out.println("---------------------");
            System.out.println("  Reconocer Figuras  ");
            System.out.println("---------------------");
            System.out.println("1.- Tres puntos");
            System.out.println("2.- Cuatro puntos");
            System.out.print("op: ");
            int Punt = Integer.parseInt(f.nextLine());

            switch (Punt) {
                case 1:
                    System.out.print("Ingrese Punto 1 : ");
                    String punto_1 = f.nextLine();
                    String[] posicion = punto_1.split(",");
                    String fila = posicion[0];
                    String colum = posicion[1];

                    x = Integer.parseInt(fila);
                    x1 = Integer.parseInt(colum);


                    System.out.print("Ingrese Punto 2 : ");
                    String punto_2 = f.nextLine();
                    String[] posici = punto_1.split(",");
                    String fil = posici[0];
                    String colu = posici[1];

                    y = Integer.parseInt(fil);
                    y1 = Integer.parseInt(colu);

                    System.out.print("Ingrese Punto 3 : ");
                    String punto_3 = f.nextLine();
                    String[] posic = punto_1.split(",");
                    String fi = posic[0];
                    String col = posic[1];

                    z = Integer.parseInt(fi);
                    z1 = Integer.parseInt(col);

                    resta1 = x - x1;
                    resta2 = y - y1;
                    resta3 = z - z1;
                    pot1 = Math.pow(resta1, 2);
                    pot2 = Math.pow(resta2, 2);
                    pot3 = Math.pow(resta3, 2);

                    suma1 = pot1 + pot2;
                    suma2 = pot2 + pot3;
                    suma3 = pot3 + pot1;
                    raiz1 = Math.sqrt(suma1);
                    raiz2 = Math.sqrt(suma2);
                    raiz3 = Math.sqrt(suma3);
                    System.out.println("distancia lado1 " + raiz1);
                    System.out.println("distancia lado2 " + raiz2);
                    System.out.println("distancia lado2 " + raiz3);
                    
                    if(raiz1==raiz2 && raiz1==raiz3){
                        System.out.println("tres lados iguales,equilatero");
                    }else 
                        if(raiz1==raiz2 || raiz1==raiz3){
                        System.out.println("dos lados iguales,isosceles");
                    }else{
                        System.out.println("tres lados diferentes,escaleno");
                    }
                    cont++;

                    break;
                case 2:
                    break;
            }
        }
    }
   
     
        

}
