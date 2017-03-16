package impostos;

/**
 *
 * @author Gonçalo Fonseca 1150503
 */
public abstract class Contribuinte {

    // nome e morada contribuinte
    private String nome;
    private String morada;

    // Valores de rendimento de trabalho e outros rendimentos
    private float rt;
    private float or;

    // Variáveis por omissão
    static final String NOME_POR_OMISSAO = "Nome não defenido";
    static final String MORADA_POR_OMISSAO = "Morada não definida";
    static final float RT_POR_OMISSAO = 0;
    static final float OR_POR_OMISSAO = 0;

    /**
     * Constrói uma instância de {@code Contribuinte} recebento todos os
     * atributos do Contribuinte
     *
     * @param nome Nome do Contribuinte
     * @param morada Morada do Contribuinte
     * @param rt Rendimentos de Trabalho do Contribuinte
     * @param or Outros Rendimentos do Contribuinte
     */
    public Contribuinte(String nome, String morada, float rt, float or) {

        this.nome = nome;
        this.morada = morada;
        this.or = or;
        this.rt = rt;
    }

    /**
     * Constrói uma instância de {@code Contribuinte} com os valores por omissão
     */
    public Contribuinte() {

        this(NOME_POR_OMISSAO, MORADA_POR_OMISSAO, OR_POR_OMISSAO, RT_POR_OMISSAO);
    }

    /**
     * Constrói uma instância de {@code Contribuinte} com os mesmos atributos do
     * Contribuinte recebido por parâmetro
     *
     * @param outroContribuinte o contribuinte com as caracterísicas a copiar
     */
    public Contribuinte(Contribuinte outroContribuinte) {

        this(outroContribuinte.nome, outroContribuinte.morada, outroContribuinte.or, outroContribuinte.rt);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the rt
     */
    public float getRt() {
        return rt;
    }

    /**
     * @param rt the rt to set
     */
    public void setRt(float rt) {
        this.rt = rt;
    }

    /**
     * @return the or
     */
    public float getOr() {
        return or;
    }

    /**
     * @param or the or to set
     */
    public void setOr(float or) {
        this.or = or;
    }

    public String toString() {

        return "Contribuinte: " + nome + " de " + morada + " com RT: " + rt + " com OR: " + or + ".";
    }

    /**
     * Devolve a taxa de Rendimentos de Trabalho usando o Polimorfismo
     *
     * @return taxaRT do contribuinte
     */
    protected abstract float taxaRT();

    /**
     * Devolve a taxa de Outros Rendimentos usando o Polimorfismo
     *
     * @return taxaOR do contribuinte
     */
    protected abstract float taxaOR();

    /**
     * Calcula o imposto a pagar por um Contribuinte
     *
     * @return imposto a pagar
     */
    public float calcularImposto() {
        
        return (this.rt * this.taxaRT() + this.or * this.taxaOR());
    }

}
