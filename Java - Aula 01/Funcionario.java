class Funcionario{
    private String nomeFuncionario;
    private double salario; // Não podemos acessar diretamente essa variável fora dessa "classe"

    Funcionario(String nome){
        this.setNomeFuncionario(nome);
    }
    Funcionario(String nome, double valor){
        this.setNomeFuncionario(nome);
        this.setSalario(valor);
    }

    public void setNomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeFuncionario(){
        return this.nomeFuncionario;
    }

    // Se o salário for menor que 1500, ele não aceita e salvar como 1500 pois teoricamente seria regra de negócio ninguém poder receber menos de 1500 na empresa
    public void setSalario(double valor){
        if(valor < 1500){
            this.salario = 1500;
        } else {
            this.salario = valor;
        }
    }

    public double getSalario(){
        return this.salario;
    }
}