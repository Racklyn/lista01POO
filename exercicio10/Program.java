package exercicio10;

public class Program {
    public static void main(String[] args) {
        EmailController controller = new EmailController();

        controller.addFuncionario(new Funcionario(
            "Chico", "Cozinheiro", "1234", "chico@empresa"
        ));
        controller.addFuncionario(new Funcionario(
            "Tonho", "Entregador", "1222", "tonho@empresa"
        ));
        controller.addFuncionario(new Funcionario(
            "Ana", "Atendente", "3110", "ana@empresa"
        ));

        controller.sendEmail(new Email(
            "chico@empresa",
            "ana@empresa",
            "Título do email",
            "Mensage do emaillllll. Blá blá blá..................."
        ));

        controller.sendEmail(new Email(
            "ana@empresa",
            "tonho@empresa",
            "Título do email 2",
            "Mensage do emaillllll 2. Blá blá blá 2..................."
        ));

        controller.sendEmail(new Email(
            "ana@empresaaa",
            "tonho@empresa",
            "Título do email 2",
            "Mensage do emaillllll 2. Blá blá blá 2..................."
        ));

        System.out.println("\nFUNCIONÁRIOS:");
        for (Funcionario f: controller.getFuncionarios()){
            System.out.println("==============================");
            f.imprimir();
        }
    }
}
