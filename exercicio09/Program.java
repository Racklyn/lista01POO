package exercicio09;

public class Program {
    public static void main(String[] args) {
        SortMachine sm = new SortMachine();
        
        for(double d: sm.runSort(new double[]{10.4, 3, 2}, SortMethod.MERGE_SORT)){
            System.out.print(d + " ");
        }
        System.out.println();

        for(double d: sm.runSort(new double[]{10, 9, 2, 27, 1, -9.5, 3, 0, 0}, SortMethod.QUICK_SORT)){
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
