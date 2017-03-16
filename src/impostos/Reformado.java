package impostos;

/**
 *
 * @author Gonçalo Fonseca 1150503
 */
public class Reformado extends Contribuinte {

    private static float taxaRT = 1;
    private static float taxaOR = 3;

    public Reformado(String nome, String morada, float rt, float or) {
        super(nome, morada, rt, or);
    }

    public Reformado() {
        super();
    }

    public Reformado(Reformado outroReformado) {
        this(outroReformado.getNome(), outroReformado.getMorada(), outroReformado.getRt(), outroReformado.getOr());
    }

    public String toString() {
        return "Descrição do Reformado: " + super.toString();
    }

    @Override
    protected float taxaRT() {
        return Reformado.taxaRT;
    }

    /**
     * @return the TaxaRT
     */
    public static float getTaxaRT() {
        return taxaRT;
    }

    /**
     * @param aTaxaRT the TaxaRT to set
     */
    public static void setTaxaRT(float aTaxaRT) {
        taxaRT = aTaxaRT;
    }

    /**
     * @return the TaxaOR
     */
    public static float getTaxaOR() {
        return taxaOR;
    }

    /**
     * @param aTaxaOR the TaxaOR to set
     */
    public static void setTaxaOR(float aTaxaOR) {
        taxaOR = aTaxaOR;
    }

    @Override
    protected float taxaOR() {
        return Reformado.taxaOR;
    }

}
