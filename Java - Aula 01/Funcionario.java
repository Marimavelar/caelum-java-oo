class Funcionario{
    private int id;
    private String nomeFuncionario;
    private double salario; // Não podemos acessar diretamente essa variável fora dessa "classe" por conta do private
    private double comissao;
    private static double premio; // variável da classe
    private static int quantidadeFuncionarios;

    // constructor's
    Funcionario(String nome){
        this();
        this.setNomeFuncionario(nome);
    }
    Funcionario(String nome, double valor){
        this(nome);
        this.setSalario(valor);
    }
    Funcionario(){
        this.setId(quantidadeFuncionarios);
        quantidadeFuncionarios++;
    }

    // methods
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

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getComissao(){
        return this.comissao;
    }

    public static void setPremio(double premio){
        Funcionario.premio = premio;
    }

    public static double getPremio(){
        return Funcionario.premio;
    }
    
}