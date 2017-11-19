package trabajo_figuras;

import java.util.Scanner;

public class Trabajo_Figuras {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        while (true) {
            int cont = 0;
            double x = 0, y = 0, x1 = 0, y1 = 0, z0 = 0, z1 = 0,z2=0,z3=0, resta1,
                    resta2, resta3,resta4, pot1, pot2, pot3,pot4, suma1, suma2,
                    suma3,suma4, raiz1,raiz2, raiz3,raiz4;

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
                    String[] posici = punto_2.split(",");
                    String fil = posici[0];
                    String colu = posici[1];

                    y = Integer.parseInt(fil);
                    y1 = Integer.parseInt(colu);

                    System.out.print("Ingrese Punto 3 : ");
                    String punto_3 = f.nextLine();
                    String[] posic = punto_3.split(",");
                    String fi = posic[0];
                    String col = posic[1];

                    z0 = Integer.parseInt(fi);
                    z1 = Integer.parseInt(col);

                    resta1 = x - y;
                    resta2 = x1 - y1;
                    resta3 = z0 - z1;
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
                    System.out.println("--------------------------------");
                    if (raiz1 == raiz2 && raiz1 == raiz3) {
                        System.out.println("tres lados iguales,equilatero");
                    } else if (raiz1 == raiz2 || raiz1 == raiz3) {
                        System.out.println("dos lados iguales,isosceles");
                    } else {
                        System.out.println("tres lados diferentes,escaleno");
                    }
                    System.out.println("--------------------------------");
                    cont++;

                    break;
                case 2:
                    System.out.print("Ingrese Punto 1 : ");
                    String punt_1 = f.nextLine();
                    String[] posicio = punt_1.split(",");
                    String f1 = posicio[0];
                    String c1 = posicio[1];

                    x = Integer.parseInt(f1);
                    x1 = Integer.parseInt(c1);

                    System.out.print("Ingrese Punto 2 : ");
                    String punt_2 = f.nextLine();
                    String[] posi = punt_2.split(",");
                    String f2 = posi[0];
                    String c2 = posi[1];

                    y = Integer.parseInt(f2);
                    y1 = Integer.parseInt(c2);

                    System.out.print("Ingrese Punto 3 : ");
                    String pun_3 = f.nextLine();
                    String[] po = pun_3.split(",");
                    String f3 = po[0];
                    String c3 = po[1];

                    z0 = Integer.parseInt(f3);
                    z1 = Integer.parseInt(c3);

                    System.out.print("Ingrese Punto 4 : ");
                    String pun_4 = f.nextLine();
                    String[] p = pun_4.split(",");
                    String f4 = p[0];
                    String c4 = p[1];

                    z2 = Integer.parseInt(f4);
                    z3 = Integer.parseInt(c4);
                    
                    resta1 = x - y;
                    resta2 = x - y1;
                    resta3 = z0 - z2;
                    resta4 = z1 -z3;
                    pot1 = Math.pow(resta1, 2);
                    pot2 = Math.pow(resta2, 2);
                    pot3 = Math.pow(resta3, 2);
                    pot4 = Math.pow(resta4, 2);
                    suma1 = pot1 + pot2;
                    suma2 = pot2 + pot3;
                    suma3 = pot3 + pot4;
                    suma4 = pot4 + pot1;
                    
                    raiz1 = Math.sqrt(suma1);
                    raiz2 = Math.sqrt(suma2);
                    raiz3 = Math.sqrt(suma3);
                    raiz4 = Math.sqrt(suma4);
                    
                    System.out.println("distancia lado1 " + raiz1);
                    System.out.println("distancia lado2 " + raiz2);
                    System.out.println("distancia lado2 " + raiz3);
                    System.out.println("distancio lado4 " + raiz4);
                    
                    System.out.println("--------------------------------");
                    if (raiz1 == raiz2 && raiz1 == raiz3 && raiz1 ==4) {
                        System.out.println("cuatro lados iguales,cuadrado");
                    } else if (raiz1 == raiz2 || raiz1 == raiz3 || raiz1 ==raiz4 ) {
                        System.out.println("dos lados iguales,rectangulo");
                    } else {
                        System.out.println("tres lados diferentes,escaleno");
                    }
                    System.out.println("--------------------------------");
                    
                    break;
            }

        }
    }

}
