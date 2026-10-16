/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_carlosochoa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lab1P2_CarlosOchoa {

    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<String> nombres = new ArrayList<>();
    public static ArrayList<String> categorias = new ArrayList<>();
    public static ArrayList<Double> precios = new ArrayList<>();
    public static ArrayList<Integer> stocks = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;

        do {
            System.out.println("CrustedFoods Music Store");
            System.out.println("1.Agergar producto");
            System.out.println("2.Mostrar Catalogo");
            System.out.println("3.Buscar producto");
            System.out.println("4.Actualizar Precio");
            System.out.println("5.Eliminar producto");
            System.out.println("6. Reporte general");
            System.out.println("7.Salir");
            System.out.println("Ingrese una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                default:

            }
        } while (opcion != 7);

    }//fin del main

    public static void agregarProducto() {
        System.out.println("==Agergar producto==");
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        String categoria;

        do {
            System.out.println("Ingrese la categoria (Instrumento,Accesorio, Software):");
            categoria = scanner.nextLine();

            if (!categoria.equalsIgnoreCase("Instrumento") && !categoria.equalsIgnoreCase("Accesorio") && !categoria.equalsIgnoreCase("Software")) {
                System.out.println("Categoria no valida");

            }
        } while (!categoria.equalsIgnoreCase("Instrumento") && !categoria.equalsIgnoreCase("Accesorio") && !categoria.equalsIgnoreCase("Software"));

        double precio;

        do {
            System.out.println("Ingrese el precio: ");
            precio = scanner.nextDouble();

            if (precio <= 0) {
                System.out.println("El precio debe ser mayor a 0.");
            }
        } while (precio <= 0);

        int stock;
        
        do{
            System.out.println("Ingrese la cantidad en stock: ");
            stock = scanner.nextInt();
            
            if(stock <= 0){
                System.out.println("El stock debe ser mayor a 0.");
            }
        }while(stock <= 0);
        scanner.nextLine();
        
        nombres.add(nombre);
        categorias.add(categoria);
        precios.add(precio);
        stocks.add(stock);
        
        System.out.println("producto agregado correctamente");
    }
    public static void catalogoMostrar(){
        System.out.println("==Catalogo de Productos==");
        
        if(nombres.size() == 0){
            System.out.println("no hay productos registrados");
            
        }else{
            for (int i = 0; i < nombres.size(); i++) {
                
                System.out.println("Producto #" + (i + 1));
                System.out.println("Nombre: " + nombres.get(i));
                System.out.println("Categoria: " + categorias.get(i));
                System.out.println("Precio: L." + precios.get(i));
                System.out.println("Stocks: " + stocks.get(i));
                
            }
        }
    }
        

}//fin de la clase
