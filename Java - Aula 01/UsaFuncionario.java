class UsaFuncionario{
    public static void main(String []args){
        Funcionario funcionario = new Funcionario("Mariana");
        Funcionario funcionarioDois = new Funcionario("Mariana", 200);
        //funcionario.nome = "Mariana";
        //funcionario.salario = 4000;

        funcionario.setSalario(4000);
        System.out.println(funcionario.getNomeFuncionario() + " - " + funcionario.getSalario() + " - " + funcionario.getId());

        funcionario.setSalario(500);
        System.out.println(funcionario.getNomeFuncionario() + " - " + funcionario.getSalario() + " - " + funcionario.getId());

        funcionarioDois.setSalario(4000);
        System.out.println(funcionarioDois.getNomeFuncionario() + " - " + funcionarioDois.getSalario() + " - " + funcionarioDois.getId());

        funcionarioDois.setSalario(500);
        System.out.println(funcionarioDois.getNomeFuncionario() + " - " + funcionarioDois.getSalario() + " - " + funcionarioDois.getId());

        System.out.println("Salário é: " + funcionario.getSalario());

        funcionario.setComissao(200);
        Funcionario.setPremio(1000);

        System.out.println(funcionario.getComissao());
        System.out.println(Funcionario.getPremio());
    }
}