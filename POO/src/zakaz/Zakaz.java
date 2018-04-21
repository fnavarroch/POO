package zakaz;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;


public class Zakaz
{
    public static void main(String[] args) throws SQLException, IOException, ParseException
    {
        boolean terminar==false;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el nombre de la empresa");
        String nombreEmpresa= entrada.nextLine();
        System.out.println("Por favor ingrese la direccion de la empresa");
        String direccionEmpresa= entrada.nextLine();
        System.out.println("Por favor ingrese el rut de la empresa");
        String rutEmpresa= entrada.nextLine();
        System.out.println("Por favor ingrese el numero telefonico de la empresa");
        int telefonoEmpresa= entrada.nextInt();
        
        Empresa empresa = new Empresa(nombreEmpresa,
                                     direccionEmpresa,
                                     rutEmpresa,
                                     telefonoEmpresa);
        
        empresa.cargar();
        //Menu
        while(terminar==false){
            System.out.println("Bienvenido al gestor de Planillas Zakaz\n\n");
            System.out.println("menu\n");
            System.out.println("1- agregar encargado\n");
            System.out.println("2- agregar producto\n");
            System.out.println("3- agregar vehiculo\n");
            //System.out.println("4- agregar planilla\n");
            
            System.out.println("6- cambiar encargado\n");
            
            System.out.println("99- cerrar programa\n");
            
            System.out.println("ingrese una opcion\n");
            int op= entrada.nextInt();
            
            if (op==1){
                System.out.println("ingrese nombre\n");
                String nombreEncargado= entrada.nextLine();
                System.out.println("ingrese año nacimiento\n");
                int añoEncargado= entrada.nextInt();
                System.out.println("ingrese rut\n");
                String rutEncargado= entrada.nextLine();
                
                if (agregarEncargado(nombreEncargado,
                                     añoEncargado,
                                     rutEncargado)==true){
                    System.out.println("encargado ingresado exitosamente\n");
                }
                else{
                    System.out.println("error al ingresar encargado\n");
                }
            if (op==2){
                System.out.println("ingrese el nombre del producto\n");
                String nombreProducto= entrada.nextLine();
                System.out.println("ingrese una id para el producto\n");
                int idProducto= entrada.nextInt();
                System.out.println("ingrese su valor\n");
                int valorProducto= entrada.nextInt();
                
                if (agregarProducto(nombreProducto,
                                    idProducto,
                                    valorProducto)==true){
                        System.out.println("producto ingresado exitosamente\n");
                    }
                else{
                        System.out.println("error al ingresar producto\n");
                }
            if (op==3){
                System.out.println("ingrese la marca del vehiculo\n");
                String marcaVehiculo= entrada.nextLine();
                System.out.println("ingrese tipo del vehiculo\n");
                String tipoVehiculo= entrada.nextLine();
                System.out.println("ingrese modelo del vehiculo\n");
                String modeloVehiculo= entrada.nextLine();
                System.out.println("ingrese patente del vehiculo\n");
                String patenteVehiculo= entrada.nextLine();
                
                if (agregarVehiculo(marcaVehiculo,
                                    tipoVehiculo,
                                    modeloVehiculo,
                                    patenteVehiculo)==true){
                        System.out.println("vehiculo ingresado exitosamente\n");
                    }
                else{
                        System.out.println("error al ingresar vehiculo\n");
                }
             if (op==99){
                 terminar=true;
             }
        }
        //Menu?
        empresa.empleados.mostrarEmpleados();
        System.out.println(empresa.locales.mostrarLocales());
        empresa.productos.mostrarProductos();
        empresa.vehiculos.mostrarVehiculos();
        //System.out.println(empresa.planillas.mostrarPlanillas());
        //Fin Menu
        empresa.informeLocales("Listado de Locales","Reporte de  Locales","Reporte de  Locales");
        empresa.informeEmpleados("Listado de Empleados","Reporte de  Empleados","Reporte de  Empleados");
        empresa.informeVehiculos("Listado de Vehiculos","Reporte de  Vehiculos","Reporte de  Empleados");
        empresa.informeProductos("Listado de Productos","Reporte de  Productos","Reporte de  Productos");
        empresa.informePlanillas("Listado de Planillas","Reporte de  Planillas","Reporte de  Planillas");
        
        empresa.guardar();
    }
    
}
