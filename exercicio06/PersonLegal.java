package exercicio06;

import java.util.regex.Pattern;

public class PersonLegal extends Person {

    String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean isValid() {
        Pattern pattern = Pattern.compile("(^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$)");
        Boolean result = pattern.matcher(this.cnpj).find();
        System.out.println("CNPJ " + cnpj + (result ? "" : " NÃO") + " é válido!");
        return result;
    }

    @Override
    public String toString() {
        return "CNPJ: " + cnpj;
    }
    
}
