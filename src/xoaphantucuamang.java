import java.util.Scanner;

public class xoaphantucuamang {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu ban muon xoa: ");
        index = scanner.nextInt();
        a = delete(a, index);
        System.out.println("mang moi la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] delete(int[] arr, int element){
        int newArr[] = new int[arr.length - 1];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != element){
                newArr[c] = arr[i];
                c++;
            }
        }
        return newArr;
    }
}
