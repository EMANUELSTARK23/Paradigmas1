abstract class Animal {
    protected String nombre;
    protected int energia;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.energia = 100; 
    }

    public abstract void hacerSonido();
    public abstract void moverse();

    public void dormir() {
        System.out.println(nombre + " zzzzzzz");
        this.energia += 20;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
        this.energia += 10;
    }
}

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: Guau guau");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre ");
    }

    public void traerObjeto() {
        System.out.println(nombre + " trajo el objeto");
    }
}

class Gato extends Animal {
    private String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla: Miau miau");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " camina sigilosamente");
    }
    
    public void rasgunar() {
        System.out.println(nombre + " está rasguñando el sillón");
    }
}

class Pajaro extends Animal {
    private double envergaduraAlas;

    public Pajaro(String nombre, double envergaduraAlas) {
        super(nombre);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " canta: Pío pío");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " vuela por el cielo");
    }
    
    public void volar() {
        System.out.println(nombre + " está volando alto");
    }
}

class Serpiente extends Animal {
    private String tipoVeneno;

    public Serpiente(String nombre, String tipoVeneno) {
        super(nombre);
        this.tipoVeneno = tipoVeneno;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " sisea: ssss ssss");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se arrastra por el suelo");
    }
}

class Pez extends Animal {
    private String tipoAgua;

    public Pez(String nombre, String tipoAgua) {
        super(nombre);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace burbujas: Glu glu");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " nada velozmente en el agua");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] refugio = new Animal[5];
        refugio[0] = new Perro("Max", "Golden Retriever");
        refugio[1] = new Gato("Luna", "Negro");
        refugio[2] = new Pajaro("Piolín", 25.5);
        refugio[3] = new Serpiente("Kaa", "Neurotóxico");
        refugio[4] = new Pez("Nemo", "Agua Dulce");

        for (Animal animal : refugio) {
            System.out.println("\nAnimal: " + animal.nombre);
            animal.hacerSonido();
            animal.moverse();
        }
    }
}