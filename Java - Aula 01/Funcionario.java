class Funcionario{
    String nome;
    private double salario; // Não podemos acessar diretamente essa variável fora dessa "classe"


    // Se o salário for menor que 1500, ele não aceita e salvar como 1500 pois teoricamente seria regra de negócio ninguém poder receber menos de 1500 na empresa
    void registraSalario(double valor){
        if(valor < 1500){
            this.salario = 1500;
        } else {
            this.salario = valor;
        }
    }

    double retornaSalario(){
        return this.salario;
    }
}