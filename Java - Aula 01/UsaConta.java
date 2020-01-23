class UsaConta {
    public static void main(String []args){

        // criando uma variavel do "tipo" Conta
        Conta conta = new Conta();
        conta.setNomeTitular("Mariana Marcondes");
        conta.setAgencia("000");
        conta.setNumero(000000);
        conta.deposita(2500.0);

        Data data = new Data();
        data.setDia(01);
        data.setMes(01);
        data.setAno(2020);
        conta.setDataDeAbertura(data);

        System.out.println("Referência: " + conta);
        System.out.println(conta.getNomeTitular() + " - " +  conta.getSaldo());

        // Por não ter atribuido valor, ele retorna valores default para variaveis inicializados vazios
        Conta contaDois = new Conta(); 
        System.out.println(contaDois.getNomeTitular() + " - " + contaDois.getSaldo());

        //contaDois = conta;
        System.out.println(contaDois.getNomeTitular() + " - " + contaDois.getSaldo());


        conta.deposita(1200);
        System.out.println("Depósito feito com sucesso, o saldo total é: " + String.format("%.2f", conta.getSaldo()));
        
        conta.saca(200);
        System.out.println("Saque feito com sucesso, o saldo total é: " + String.format("%.2f", conta.getSaldo()));

        System.out.println("Rendimento calculado com sucesso, o saldo total é: " + String.format("%.2f", conta.getRendimento()));
    
        System.out.println("Retorno dos dados: \n" + conta.getDadosDaConta());

        conta.transfereValor(1000, contaDois);
        System.out.println("Valor transferido com sucesso!");
        System.out.println("Saldo conta titular: " + String.format("%.2f", conta.getSaldo()));
        System.out.println("Saldo conta destino: " + String.format("%.2f", contaDois.getSaldo()));


        // Comparando objetos
        Conta contaTres = new Conta("Hugo");

        Conta contaQuatro = new Conta("Hugo");

        // São diferentes pois o seu numero de referencia sao diferentes. Será?
        if(contaTres == contaQuatro){
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }

        contaQuatro.setNomeTitular("Pedro");
        if(contaTres == contaQuatro){
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }
    }
}