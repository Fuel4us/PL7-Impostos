package impostos;

/**
 *
 * @author Gonçalo Fonseca 1150503
 */
public class TrabContaProp extends Contribuinte {

    private String profissao;

    private static float taxaRT = 3;
    private static float taxaOR1 = 2;
    private static float taxaOR2 = 5;

    private static int valorRef = 50000;

    private static String PROFISSAO_POR_OMISSAO = "Sem profissão definida";

    public TrabContaProp(String nome, String morada, float OR, float RT, String profissao) {
        super(nome, morada, OR, RT);
        this.profissao = profissao;
    }

    public TrabContaProp() {
        this(Contribuinte.MORADA_POR_OMISSAO, Contribuinte.NOME_POR_OMISSAO, Contribuinte.OR_POR_OMISSAO, Contribuinte.RT_POR_OMISSAO, TrabContaProp.PROFISSAO_POR_OMISSAO);
    }

    public TrabContaProp(TrabContaProp outraConta) {
        this(outraConta.getNome(), outraConta.getMorada(), outraConta.getOr(), outraConta.getRt(), outraConta.getProfissao());
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return String.format("Descrição Trabalhador Conta Própria:%n%s Profissão: %s%n", super.toString(), this.profissao);
    }
    
    public float taxaRT() {
        return TrabContaProp.taxaRT;
    }

    /**
     * @return the taxaRT
     */
    public static float getTaxaRT() {
        return taxaRT;
    }

    /**
     * @param aTaxaRT the taxaRT to set
     */
    public static void setTaxaRT(float aTaxaRT) {
        taxaRT = aTaxaRT;
    }

    /**
     * @return the taxaOR1
     */
    public static float getTaxaOR1() {
        return taxaOR1;
    }

    /**
     * @param aTaxaOR1 the taxaOR1 to set
     */
    public static void setTaxaOR1(float aTaxaOR1) {
        taxaOR1 = aTaxaOR1;
    }

    /**
     * @return the taxaOR2
     */
    public static float getTaxaOR2() {
        return taxaOR2;
    }

    /**
     * @param aTaxaOR2 the taxaOR2 to set
     */
    public static void setTaxaOR2(float aTaxaOR2) {
        taxaOR2 = aTaxaOR2;
    }

    public float taxaOR() {
        if (this.getOr() > TrabContaProp.valorRef) {
            return taxaOR2;
        } else {
            return taxaOR1;
        }
    }

}
