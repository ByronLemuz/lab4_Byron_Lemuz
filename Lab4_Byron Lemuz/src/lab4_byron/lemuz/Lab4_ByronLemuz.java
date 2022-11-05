/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_byron.lemuz;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lesly
 */
public class Lab4_ByronLemuz {

    private static Object entrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    Random lea = new Random();
    int opc = 0;
        while(true){
            System.out.println("-------Menu---------");
            System.out.println("1.Fallout word");
            System.out.println("2.Rodatcripne");
            System.out.println("3.Alpha");
            System.out.println("4.Salir");
            System.out.println("Ingrese una opcion: ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    
                    break;
                
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:    
            }
      }
    }
    

  public static void Rodatcripne(String[]palabras){
    Scanner entrada = new Scanner(System.in);
    int contraseña;
                    String cadena_entrada, cadena_codificada="";
                    System.out.print("Ingrese su contraseña: ");
                    contraseña = entrada.nextInt();
                    System.out.println();
                    
                    if( contraseña >=0 && contraseña <=9)
                    {
                        System.out.print("Nueva contraseña: ");
                        entrada.nextLine();
                        cadena_entrada=entrada.nextLine();
                        System.out.println();
                        for (int i = 0; i< cadena_entrada.length(); i+=1)
                        {
                            int char_como_int = (int)cadena_entrada.charAt(i);
                            
                            if(i%2 == 0)
                            {
                                char_como_int = char_como_int + contraseña;
                            }
                            else
                            {
                                char_como_int = char_como_int - contraseña;
                            }
                            cadena_codificada = cadena_codificada + (char)char_como_int;
                        }
                        System.out.println("La cadena codificada es: "+cadena_codificada);
                    }
                    else
                    {
                        System.out.println("La contraseña ingresada debe estar en minusculas.");
                    }

}}
public static void alpha(string palabras) {
        String cadenas[] = { "Laboratorio", "Laboratorio 4", "H0la", "Hola_mundo", "java" };
        for (String cadena : cadenas) {
            System.out.printf(" '%s'.  %b\n", cadena, contieneSoloLetras(cadena));
        }
    }

    public static boolean contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
}