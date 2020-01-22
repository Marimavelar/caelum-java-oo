class UsaConta {
    public static void main(String []args){

        // criando uma variavel do "tipo" Conta
        Conta conta = new Conta();
        conta.nomeTitular = "Mariana Marcondes";
        conta.agencia = "0000";
        conta.numero = 000000;
        conta.saldo = 2500.0;
        Data data = new Data();
        data.dia = 01;
        data.mes = 01;
        data.ano = 2020;
        conta.dataDeAbertura = data;

        System.out.println("Referencia: " + conta);
        System.out.println(conta.nomeTitular + " - " +  conta.saldo);

        // Por não ter atribuido valor, ele retorna valores default para variaveis inicializados vazios
        Conta contaDois = new Conta(); 
        System.out.println(contaDois.nomeTitular + " - " + contaDois.saldo);

        contaDois = conta;
        System.out.println(contaDois.nomeTitular + " - " + contaDois.saldo);


        conta.deposita(1200);
        System.out.println("Depósito feito com sucesso, o saldo total é: " + String.format("%.2f", conta.saldo));
        
        conta.saca(200);
        System.out.println("Saque feito com sucesso, o saldo total é: " + String.format("%.2f", conta.saldo));

        System.out.println("Rendimento calculado com sucesso, o saldo total é: " + String.format("%.2f", conta.calculaRendimento()));
    
        System.out.println("Retorno dos dados: \n" + conta.retornaDadosDaConta());

        conta.transfereValor(1000, contaDois);
        System.out.println("Valor transferido com sucesso! (Não rolou, pq?)");
        System.out.println("Saldo conta titular: " + String.format("%.2f", conta.saldo));
        System.out.println("Saldo conta destino: " + String.format("%.2f", contaDois.saldo));


        // Comparando objetos
        Conta contaTres = new Conta();
        contaTres.nomeTitular = "Hugo";
        contaTres.saldo = 100;

        Conta contaQuatro = new Conta();
        contaQuatro.nomeTitular = "Hugo";
        contaQuatro.saldo = 100;

        // São diferentes pois o seu numero de referencia sao diferentes. Será?
        if(contaTres == contaQuatro){
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }

        contaQuatro.nomeTitular = "Pedro";
        if(contaTres == contaQuatro){
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }
    }
}