import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        System.out.println("nhap vao so luong sinh vien");
        int size = scanner.nextInt();

        if (size < 1 || size > 30) {
            System.out.println("size la 30");
        } else {
            arr=new int[size];
            int count = 0;
            for (int i = 0; i < size; i++) {
                System.out.println("Nhap diem vi tri thu "+(i+1));
                arr[i]=scanner.nextInt();
            }
            for(int i=0; i<arr.length;i++){
                if(arr[i]>5&&arr[i]<11){
                    count++;
                }
            }
            System.out.println("So sinh vien do la: "+count);
        }
    }
}
