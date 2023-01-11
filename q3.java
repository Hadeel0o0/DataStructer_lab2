/*
3. Concatenate two arrays to new array

 */
public class q3 {

    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int [] array={5,6,7,8};
        int  arr2[]={0,0,0,0,0,0,0,0};

        for (int i = 0; i < 4; i++)
            arr2[i]=arr[i];

            int n=0;
            for (int j = 4; j < 8 && n<4 ; j++){
                arr2[j]=array[n];
                n++;
            }

        for (int i = 0; i < 8; i++)
            System.out.println(arr2[i]);

    }


}
