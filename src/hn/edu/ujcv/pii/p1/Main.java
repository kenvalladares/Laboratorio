package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        menu();

    }

    private static void VenderDiario() {
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        int total = 0;
        String [] participantes = new String[100];
        String respuesta="";
        int[] numero = new int [5];
        int[] ganadores = new int [100];
        int [] matrizEnteros = new int[5];
        String opcion2 = " ";
        System.out.println("*************");
        System.out.println("              Juego diario             ");
        System.out.println("*************");
        for (int fila=0; fila < 5; fila++){
            matrizEnteros[fila] = obtenerNumeroAzar();
        }
        int cont =0, s=0;
        do{
            System.out.println("Ingrese su nombre");
            participantes[cont] = teclado.next();
            System.out.println("Ingrese sus 5 números");
            for(int i=0; i<5; i++){
                numero[i]=teclado.nextInt();
                for (int j=0; j<i;j++){
                    if(numero[i]==numero[j]){
                        System.out.println("El número que ingresó está repetido");
                        i--;
                    }
                }
            }
            for(int p=0; p<5; p++){
                int premio = numero[p];
                for (int fila=0; fila < 5; fila++){
                    if(matrizEnteros[fila]==premio){
                        ganadores[s]++;
                    }
                }
            }
            s++;
            System.out.println("¿Desea ingresar otra persona? S/N");
            respuesta = teclado.next();
            cont++;
        }while(respuesta.equalsIgnoreCase("s"));
        System.out.println("El juego diario comenzará");
        for (int fila=0; fila < 5; fila++){
            System.out.print(" "+matrizEnteros[fila]);
        }
        System.out.println("");
        for (int l=0; l < cont; l++){
            if(ganadores[l]<3){
                System.out.println("El participante: "+participantes[l]+" Encontró: "+ganadores[l]+" números, Son muy pocos números, Mucha suerte para la próxima♥");
            }
            if(ganadores[l]==3){
                System.out.println("El Participante: "+participantes[l]+" Encontró: "+ganadores[l]+" números, ¡Ha ganado 5,000.00 LPS♥!");
            }
            if(ganadores[l]==4){
                System.out.println("El Participante: "+participantes[l]+" Encontró: "+ganadores[l]+" números, ¡Ha ganado 10,000.00 LPS♥!");
            }

            if(ganadores[l]==5){
                System.out.println("El Participante: "+participantes[l]+" Encontró: "+ganadores[l]+" números, ¡Ha ganado 100,000.00 LPS♥!");
            }
        }
        System.out.println(" ");
        System.out.println("*************");
        System.out.println("           Juego Finalizado            ");
        System.out.println("*************");
        System.out.println("¿Desea regresar al menu? S/N");
        opcion2 = teclado.next();
        if (opcion2.equalsIgnoreCase("S")){
            menu();
        }
    }
    private static void VenderSemanal() {
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        int total = 0;
        String [] participantes = new String[100];
        String respuesta="";
        int[] ganadores = new int [100];
        int[] ganadores2 = new int [100];
        int[] numero = new int [3];
        String opcion2 = " ";
        int numero1 = 0, numero2 = 0;
        System.out.println("************");
        System.out.println("             Juego semanal          ");
        System.out.println("************");
        numero1 = obtenerNumeroAzar();
        numero2 = obtenerNumeroAzar();
        int cont=0, s=0, k=0,n=0;
        do{
            System.out.println("Ingrese su nombre");
            participantes[cont] = teclado.next();
            System.out.println("Ingrese sus 2 números");
            for(int i=0; i<2; i++){
                numero[i]=teclado.nextInt();
                for (int j=0; j<i;j++){
                    if(numero[i]==numero[j]){
                        System.out.println("El número que ingresó está repetido");
                        i--;
                    }
                }
            }
            if(numero[0]==numero1){
                ganadores[s]++;
            }
            if(numero[1]==numero2){
                ganadores[s]++;
            }
            s++;
            System.out.println("Desea ingresar otra persona? S/N");
            respuesta = teclado.next();
            cont++;
        }while(respuesta.equalsIgnoreCase("s"));
        System.out.println("El juego semanal comenzará");
        System.out.println(+numero1);
        System.out.println(+numero2);
        System.out.println("");
        for (int l=0; l < cont; l++){
            if(ganadores[l] ==0)  {
                System.out.println("El participante "+participantes[l]+" encontró: "+ganadores[l]+" números, Son muy pocos números, Mucha suerte para la próxima♥");
            }
            if(ganadores[l]==1){
                System.out.println("El participante "+participantes[l]+" encontró: "+ganadores[l]+" números, ¡Ha ganado 10,000.00 LPS♥!");
            }
            if(ganadores[l]==2){
                System.out.println("El participante "+participantes[l]+" encontró: "+ganadores[l]+" números, ¡Ha ganado 100,000.00 LPS♥!");
            }
        }
        System.out.println(" ");
        System.out.println("**********");
        System.out.println("      Juego Finalizado      ");
        System.out.println("**********");
        System.out.println("¿Desea regresar al menú? S/N");
        opcion2 = teclado.next();
        if (opcion2.equalsIgnoreCase("S")){
            menu();
        }
    }
    private static void VenderMensual() {
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        int total = 0;
        String [] participantes = new String[100];
        String respuesta="";
        int[] numero = new int [5];
        int[] number = new int [5];
        String  opcion2 = " ";
        int[] ganadores = new int [100];
        int [] matrizEnteros = new int[1];
        int numero1 = 0;
        System.out.println("**************");
        System.out.println("              Juego Mensual             ");
        System.out.println("**************");
        numero1 = obtenerNumeroAzar();
        int cont=0, s=0;
        do{
            System.out.println("Ingrese su nombre");
            participantes[cont] = teclado.next();
            System.out.println("Ingrese su  número");
            for(int i=0; i<1; i++){
                numero[i]=teclado.nextInt();
                for (int j=0; j<i;j++){
                    if(numero[i]==numero[j]){
                        System.out.println("El número que ingresó esta repetido");
                        i--;
                    }
                }
            }

            if(numero[0]==numero1){
                ganadores[s]++;
            }
            s++;
            System.out.println("Desea ingresar otra persona? S/N");
            respuesta = teclado.next();
            cont++;
        }while(respuesta.equalsIgnoreCase("s"));
        System.out.println("El juego Mensual comenzará...");
        System.out.println("El número ganador es:"+numero1);
        System.out.println(" ");
        for (int l=0; l < cont; l++){
            if(ganadores[l] ==0)  {
                System.out.println("El participante "+participantes[l]+" No adivinó el número, Mucha suerte para la próxima♥");
            }
            if(ganadores[l] ==1)  {
                System.out.println("El participante "+participantes[l]+" encontró el número ganador, ¡Ha ganado 100,000.00 LPS♥!");
            }
        }
        System.out.println(" ");
        System.out.println("¿Desea regresar al menú? S/N");
        opcion2 = teclado.next();
        if (opcion2.equalsIgnoreCase("S")){
            menu();
        }
    }
    private static int obtenerNumeroAzar(){
        return   (int) (Math.random() * ((100-1)+1))+1;
    }
    public static void menu(){
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");
        int opcion=0;
        System.out.println("* *  MENÚ DE JUEGOS  * *");
        System.out.println("*    1.Juego diario    *");
        System.out.println("*    2.Juego semanal   *");
        System.out.println("*    3.Juego mensual   *");
        System.out.println("*    4.Salir           *");
        System.out.println("* * * * * *  * * * * * *");
        System.out.println("");
        System.out.print("Elija una opción: ");
        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                VenderDiario();
                break;

            case 2:
                VenderSemanal();
                break;

            case 3:VenderMensual();
                break;

            case 4: break;

            default:
                System.out.println("Ingrese una opción valida por favor");
        }
    }
}