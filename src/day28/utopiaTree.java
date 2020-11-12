package day28;

public class utopiaTree {
    public static void main(String[] args) {

        int Growth=0;
       for(int i=1;i<=10;i++){
         int year=i;

         if(year<4){
             Growth++;
             System.out.println("year"+year+" - growth 1 cm");
             System.out.println("tree size: "+Growth+"cm");
         }else{
             Growth+=2;
             System.out.println("year"+year+" - growth 2 cm");
             System.out.println("tree size: "+Growth+"cm");
         }




       }









    }
}
