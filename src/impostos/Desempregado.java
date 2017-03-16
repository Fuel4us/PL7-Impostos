/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos;

/**
 *
 * @author Gonçalo Fonseca 1150503
 */
public class Desempregado extends Contribuinte {

    private int mesesParagem;

    private static float taxaOR = 2;

    private static final int MESES_POR_OMISSAO = 0;

    public Desempregado(String nome, String morada, float or, int meses) {
        super(nome, morada, Contribuinte.RT_POR_OMISSAO, or);
        this.mesesParagem = mesesParagem;
    }

    public Desempregado() {
        this(Contribuinte.NOME_POR_OMISSAO, Contribuinte.MORADA_POR_OMISSAO, Contribuinte.OR_POR_OMISSAO, Desempregado.MESES_POR_OMISSAO);
    }

    public Desempregado(Desempregado outroDesempregado) {
        this(outroDesempregado.getNome(), outroDesempregado.getMorada(), outroDesempregado.getOr(), outroDesempregado.getMesesParagem());
    }

    /**
     * @return the mesesParagem
     */
    public int getMesesParagem() {
        return mesesParagem;
    }

    /**
     * @param mesesParagem the mesesParagem to set
     */
    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }

    /**
     * @return the taxaOR
     */
    public static float getTaxaOR() {
        return taxaOR;
    }

    /**
     * @param aTaxaOR the taxaOR to set
     */
    public static void setTaxaOR(float aTaxaOR) {
        taxaOR = aTaxaOR;
    }

    public float taxaRT() {
        return 0;
    }

    public float taxaOR() {
        return Desempregado.taxaOR;
    }

}
