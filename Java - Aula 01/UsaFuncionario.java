class UsaFuncionario{
    public static void main(String []args){
        Funcionario funcionario = new Funcionario("Mariana");
        Funcionario funcionarioDois = new Funcionario("Mariana", 200);
        //funcionario.nome = "Mariana";
        //funcionario.salario = 4000;

        funcionario.setSalario(4000);
        System.out.println(funcionario.getNomeFuncionario() + " - " + funcionario.getSalario());

        funcionario.setSalario(500);
        System.out.println(funcionario.getNomeFuncionario() + " - " + funcionario.getSalario());

        System.out.println("Salário é: " + funcionario.getSalario());
    }
}