class UsaFuncionario{
    public static void main(String []args){
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Mariana";
        //funcionario.salario = 4000;

        funcionario.registraSalario(4000);
        System.out.println(funcionario.nome + " - " + funcionario.retornaSalario());

        funcionario.registraSalario(500);
        System.out.println(funcionario.nome + " - " + funcionario.retornaSalario());

        System.out.println("Salário é: " + funcionario.retornaSalario());
    }
}