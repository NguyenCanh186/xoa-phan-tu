public class arr {
    public static void main(String[] args) {
int a1[] = new int[3];
doiSo(a1, 2, 90);
        System.out.println(a1[2]);
    }
    public static void doiSo(int a[], int index, int newValue ){
        a[index] = newValue;
    }
}
