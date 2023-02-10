 import java.util.Scanner;
 import java.util.Random;
class Game 
{
    int number,num,count=-1,ans;
    Game()
    { 
        Random rand=new Random();
        number=rand.nextInt(100);
    }
    public void takeUserInput()
    {
        System.out.print("Guess the number Between 1 to 100:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    }
    public int isCorrectNumber()
    {
         if (num>number){
         System.out.println("Greater");
     }
         
         else if (num<number){
        System.out.println("Smaller");   
     }
         else if(num==number){
         count++;
    }
        count++;
        return count;
   }
    public void setGuess(int ans)
    {
        this.ans=ans;
    }
    
    public int getGuess()
    {
        return ans;
    }
}
class GuessTheNumber
{
public static void main(String args[])
{
int ans;
Game g=new Game();
do{
g.takeUserInput();
ans=g.isCorrectNumber();
}while(g.num!=g.number);
g.setGuess(ans);
System.out.println("Total no of guesses is:"+g.getGuess());
}
}