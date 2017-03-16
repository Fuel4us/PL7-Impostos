package impostos;

/**
 *
 * @author Gonçalo Fonseca 1150503
 */
public class TesteImpostos {

    public static void main(String[] args) {

        Reformado r1 = new Reformado("Gonçalo", "Matosas", 100000, 58600);
        Reformado r2 = new Reformado();

        TrabContaOutrem tco1 = new TrabContaOutrem("Pedro", "Antas", 123000, 2500, "Vets and Tets");
        TrabContaOutrem tco2 = new TrabContaOutrem();

        TrabContaProp tcp1 = new TrabContaProp("Luis", "Areosa", 80000, 1500, "Gestor de uma empresa");
        TrabContaProp tcp2 = new TrabContaProp();

        Desempregado ds1 = new Desempregado("Ines", "Santa tona da mesericórdia", 50000, 150);
        Desempregado ds2 = new Desempregado();

        Contribuinte[] contribuintes = new Contribuinte[10];

        contribuintes[0] = r1;
        contribuintes[1] = tco1;
        contribuintes[2] = tcp1;
        contribuintes[3] = ds1;

        // c)
        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i] != null) {
                System.out.println(contribuintes[i] + "imposto: " + contribuintes[i].calcularImposto());
            }
        }
        
        System.out.println("\n--------------------------x----------------------");
        // d)
        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i] == ds1) {
                System.out.println(contribuintes[i] + " o imposto do contribuinte é: " + contribuintes[i].calcularImposto());
            }
            
        }

    }
}
