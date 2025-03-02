/**
 *  <h1>Conta</h1>
 *  A classe Conta armazena informações relevantes acerca da criação de um conta bancária
 *
 * @author Pedro Henrique Silva Batista
 * @version 1.0
 * @since 01/03/2025
 */

public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;


    /**
     * Este método permite configurar/atribuir o número da agência
     * @param numero Este é o único parâmetro do método
     * */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Este método permite configurar/atribuir a agência da conta bancária
     * @param agencia Este é o único parâmetro do método
     * */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Este método permite configurar/atribuir o nome do cliente da conta bancária
     * @param nomeCliente Este é o único parâmetro do método
     * */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Este método permite configurar/atribuir o saldo da conta bancária
     * @param saldo Este é o único parâmetro do método
     * */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método permite retornar o número da agência
     * @return int o número da conta bancária
     * */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Este método permite retornar a agência da conta bancária
     * @return String a agência da conta bancária
     * */
    public String getAgencia() {
        return this.agencia;
    }

    /**
     * Este método permite retornar o nome do cliente da conta bancária
     * @return String o nome do cliente da conta bancária
     * */
    public String getNomeCliente() {
        return this.nomeCliente;
    }

    /**
     * Este método permite retornar o saldo da conta bancária
     * @return double o saldo da conta bancária
     * */
    public double getSaldo() {
        return this.saldo;
    }
}
