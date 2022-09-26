package exercicio09;

public enum SortMethod {
    QUICK_SORT("QUICK_SORT"), MERGE_SORT("MERGE_SORT");

    private final String value;
    
    SortMethod(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
