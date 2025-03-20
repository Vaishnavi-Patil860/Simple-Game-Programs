package GamePrograms.GamePrograms;

import java.util.Scanner;

 class StonePaperScissor {

    static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
     {
        System.out.println();
        System.out.println("GAME STARTS");
        System.out.println();
        String responseA = PlayerA();
        String responseB = PlayerB();
        System.out.println("PLAYER A : "+ responseA );
        System.out.println("PLAYER B : "+ responseB);
        checkWinner(responseA, responseB);

   }
   public static String PlayerA()
   {
      System.out.println(" 1.STONE   2.PAPER   3.SCISSOR");
      System.out.println();
      System.out.println(" player A enter your option :");
      int opt = sc.nextInt();
      String response = checkOption(opt);
        
      return response;
    
   }
   public static String PlayerB()
   {
     int opt = 0 ;
     for (; ;){
        opt = (int)(Math.random()*10);
        if(opt>=1 && opt<=3)
        break;
     }
     String response = checkOption(opt);
     return response;
   }
    public static String checkOption(int opt){
        String response = "";
        switch(opt){
            case 1 : {
                response = "STONE" ;
                break;
            }

            case 2 : {
                response = "PAPER" ;
                break;
            }

            case 3 : {
                response = "SCISSOR" ;
                break;
            }
              default : {
                System.out.println("INVALID OPTION");
                break;
              }

        }
        return response;
    }
        public static void checkWinner(String responseA,  String responseB)
        {

            if((responseA.equals("STONE") && responseB.equals("SCISSOR"))||
            (responseA.equals("PAPER") && responseB.equals("STONE"))||
            (responseA.equals("SCISSOR") && responseB.equals("PAPER")))
            {
                System.out.println("PLAYER A WON");
            }

           else  if((responseA.equals("STONE") && responseB.equals("PAPER"))||
            (responseA.equals("PAPER") && responseB.equals("SCISSOR"))||
            (responseA.equals("SCISSOR") && responseB.equals("STONE")))
            {
                System.out.println("PLAYER B WON");
            }

            else {
                System.out.println("IT'S A DRAW");
            }
       }

}
        
    

