class Conta {
    String nomeTitular;
    String agencia;
    int numero;
    double saldo; 
    Data dataDeAbertura;

    void deposita(double valor){
        this.saldo += valor;
    }

    void saca(double valor){
        this.saldo -= valor;
    }

    double calculaRendimento(){
        return saldo * 0.1;
    }

    String retornaDadosDaConta(){
        String dados = "Titular: " + this.nomeTitular;
        dados += "\nAgência: " + this.agencia;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
        return dados;
    }

    void transfereValor(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.saldo += valor;   
        }
    }
}