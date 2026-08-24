abstract class Empleado {
    protected static int totalEmpleados = 0;
    protected static int proximoId = 1001; 

    protected int id;
    protected String nombre;
    protected String cedula;
    protected double sueldoBase;

    public Empleado(String nombre, String cedula, double sueldoBase) {
        this.id = proximoId++;
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        totalEmpleados++;
    }

    public abstract double calcularSueldo();
    public abstract String obtenerDetalles();

    public static int obtenerTotalEmpleados() {
        return totalEmpleados;
    }

    public static void mostrarEstadisticas() {
        System.out.println("Total empleados: " + totalEmpleados);
    }
}

class Gerente extends Empleado {
    public Gerente(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 1.25;
    }

    @Override
    public String obtenerDetalles() {
        return String.format("[%d] %s - Gerente - $%.2f", id, nombre, calcularSueldo());
    }
}

class Supervisor extends Empleado {
    public Supervisor(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 1.15;
    }

    @Override
    public String obtenerDetalles() {
        return String.format("[%d] %s - Supervisor - $%.2f", id, nombre, calcularSueldo());
    }
}

class Obrero extends Empleado {
    public Obrero(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }

    @Override
    public String obtenerDetalles() {
        return String.format("[%d] %s - Obrero - $%.2f", id, nombre, calcularSueldo());
    }
}

public class NominaEmpresa {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[8];

        empleados[0] = new Gerente("Laura", "CED-01", 4000.00);   
        empleados[1] = new Gerente("Roberto", "CED-02", 4500.00); 
        empleados[2] = new Supervisor("Ana", "CED-03", 2500.00);  
        empleados[3] = new Supervisor("Pedro", "CED-04", 2700.00);
        empleados[4] = new Obrero("Carlos", "CED-05", 1500.00);
        empleados[5] = new Obrero("María", "CED-06", 1600.00);
        empleados[6] = new Obrero("Juan", "CED-07", 1550.00);
        empleados[7] = new Obrero("Sofía", "CED-08", 1580.00);

        double totalNomina = 0;

        for (Empleado emp : empleados) {
            System.out.println(emp.obtenerDetalles());
            totalNomina += emp.calcularSueldo();
        }

        System.out.printf("Total: $%.2f%n", totalNomina);
        Empleado.mostrarEstadisticas();
    }
}