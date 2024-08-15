package Javanote;

public class Variables {
    public static void main(String[] args) {
        byte moveLeft;

        moveLeft = 127;

        int num1 = 19;
        short moveLeft2 = (short) moveLeft;

        System.out.println(moveLeft2);

        moveLeft2 = 130;


        // recibe dos valores numericos y uno de ellos es de tipo es string


        String num2 = "23";

        //parseo pasar de tipo string a tipo numerico

        int newNun2 =Integer.parseInt(num2);

        float promedio = (num1 + newNun2)/2;

        System.out.println(promedio);



    }



}
