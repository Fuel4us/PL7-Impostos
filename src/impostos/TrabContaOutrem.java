package impostos;

/**
 *
 * @author Gonçalo Fonseca 1150503
 */
public class TrabContaOutrem extends Contribuinte {

    private String Empresa;

    private static float taxaRT1 = 1;
    private static float taxaRT2 = 2;
    private static float TaxaOR = 2;
    private static float valorRef = 30000;

    private static final String EMPRESA_POR_OMISSAO = "Nome de empresa não definido";

    public TrabContaOutrem(String nome, String morada, float rt, float or, String nomeEmpresa) {
        super(nome, morada, rt, or);
        this.Empresa = nomeEmpresa;
    }

    public TrabContaOutrem() {
        this(Contribuinte.MORADA_POR_OMISSAO, Contribuinte.NOME_POR_OMISSAO, Contribuinte.OR_POR_OMISSAO, Contribuinte.RT_POR_OMISSAO, TrabContaOutrem.EMPRESA_POR_OMISSAO);
    }

    public TrabContaOutrem(TrabContaOutrem outraConta) {
        this(outraConta.getNome(), outraConta.getMorada(), outraConta.getOr(), outraConta.getRt(), outraConta.getEmpresa());
    }

    /**
     * @return the Empresa
     */
    public String getEmpresa() {
        return Empresa;
    }

    /**
     * @param Empresa the Empresa to set
     */
    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
    
     @Override
    public String toString() {
        return String.format("Descrição Trabalhador Conta Outrém:%n%s Nome da Empresa: %s%n", super.toString(), this.Empresa);
    }

    public static float getTaxaOR() {
        return TaxaOR;
    }

    public static void setTaxaOR(float taxa) {
        TaxaOR = taxa;
    }

    /**
     * @return the taxaRT1
     */
    public static float getTaxaRT1() {
        return taxaRT1;
    }

    /**
     * @param aTaxaRT1 the taxaRT1 to set
     */
    public static void setTaxaRT1(float aTaxaRT1) {
        taxaRT1 = aTaxaRT1;
    }

    /**
     * @return the taxaRT2
     */
    public static float getTaxaRT2() {
        return taxaRT2;
    }

    /**
     * @param aTaxaRT2 the taxaRT2 to set
     */
    public static void setTaxaRT2(float aTaxaRT2) {
        taxaRT2 = aTaxaRT2;
    }

    protected float taxaRT() {
        if (this.getRt() > TrabContaOutrem.valorRef) {
            return TrabContaOutrem.taxaRT2;
        } else {
            return TrabContaOutrem.taxaRT1;
        }
    }
    
    protected float taxaOR() {
        return TrabContaOutrem.TaxaOR;
    }

    
}
