package exercicio04;

public enum Color {
    
    BLACK("BLACK"), BLUE("BLUE"), RED("RED");

    private final String value;
    
    Color(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
