package Codebat;

public class elementsShift {
    public static void main(String[] args) {
        int[] data ={ 7, 3,8,1,0,5};
        int temp = data[0];
        for(int i = 0; i< data.length-1;i++) {
            data[i] = data[i+1];
        }

        data[data.length-1] = temp;
        for (int j= 0; j< data.length;j++) {
            System.out.println(data[j]);
        }


    }
}
