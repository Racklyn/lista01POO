package exercicio06;

public class Program {
    public static void main(String[] args) {
        Person individual1 = new PersonIndividual("123.456.789-10");
        Person individual2 = new PersonIndividual("13.456.789-123");
        Person company1 = new PersonLegal("10.123.456/0001-10");
        Person company2 = new PersonLegal("10.123.456.0001/10");

        Validator validator = new Validator();

        validator.runValidation(individual1);
        validator.runValidation(company1);
        validator.runValidation(individual2);
        validator.runValidation(company2);
    }
}
