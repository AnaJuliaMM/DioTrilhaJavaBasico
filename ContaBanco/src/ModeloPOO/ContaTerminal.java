package ModeloPOO;

class ContaTerminal {
    //Atributos
    private String nomeCliente;
    private int numero;
    private String agencia;
    private double saldo;
    //Construtor
    public ContaTerminal(){
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
