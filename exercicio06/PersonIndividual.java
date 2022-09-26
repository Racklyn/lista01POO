package exercicio06;

import java.util.regex.Pattern;

public class PersonIndividual extends Person {

    private String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean isValid() {
        Pattern pattern = Pattern.compile("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)");
        Boolean result = pattern.matcher(this.cpf).find();
        System.out.println("CPF " + cpf + (result ? "" : " NÃO") + " é válido!");
        return result;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf;
    }
    
}
