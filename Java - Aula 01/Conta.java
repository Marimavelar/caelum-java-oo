class Conta {
    private String nomeTitular;
    private String agencia;
    private int numero;
    private double saldo; 
    private Data dataDeAbertura;

    public Conta(){

    }
    
    public Conta(String nomeTitular){
        setNomeTitular(nomeTitular);
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public double getRendimento(){
        return this.saldo * 0.1;
    }

    public void setDataDeAbertura(Data dataDeAbertura){
        this.dataDeAbertura = dataDeAbertura;
    }

    public Data getDataDeAbertura(){
        return this.dataDeAbertura;
    }

    public String getDadosDaConta(){
        String dados = "Titular: " + this.nomeTitular;
        dados += "\nAgência: " + this.agencia;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.setFormat();
        return dados;
    }

    public void transfereValor(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.saldo += valor;   
        }
    }
}