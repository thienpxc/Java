package example;

public class Example9 {
    public static void main(String[] args) {
    int [] value = {1,2,7,3,4,5,6,1,8};
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < value.length; i++) {
            if (value[i] > max1){
                max1 = value[i];
                //System.out.printf("Phần tử lớn nhất: %d \n",max1);
            }
        }
        for (int j = 0; j < value.length; j++) {
            if (value[j] != max1 && value[j] > max2){
                max2 = value[j];
                //System.out.printf("Phần tử lớn thứ hai: %d \n",max2);
            }
        }
        System.out.println("Phần tử lớn nhất: " + max1);
        System.out.println("Phần tử lớn thứ hai: " + max2);


    }
}
