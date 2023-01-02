package SquareRoot;

public class SqRoot {
    public static int rootnumber(int num){
        int i = 1;
        while(i * i <= num)
            i++;
        return i - 1;
    }
    public static void main(String[] args) {
        System.out.println(rootnumber(15));
    }
}
