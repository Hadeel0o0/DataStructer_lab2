/*
Equivalence Testing with Array
 */
public class q4 {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        int  arr2[]={0,0,0,0};
        for (int i = 0; i < 4; i++) {
            arr2[i]=arr[i];
        }

        boolean f=true;
        for (int i = 0; i < 4; i++) {
           if (arr2[i]!=arr[i])
               f=false;
            if (f == false){
                System.out.println("not Equivalence"); break;}
           else {System.out.println(" Equivalence");   break;}

        }
    }
}
