import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String lotteryNum = sc.nextLine();
        String chosenNum = sc.nextLine();
        
        lotteryNum = lotteryNum.replace(" ", ",");
        chosenNum = chosenNum.replace(" ", ",");
        
        String[] lotteryArr = lotteryNum.split(",");
        String[] chosenArr = chosenNum.split(",");
        
        int count = 0;
        
        for(int i = 0; i < lotteryArr.length - 1; i++) {
          for(int j = 0; j < chosenArr.length; j++) {
             if(lotteryArr[i].equals(chosenArr[j])) {
                 count++;
             }
          }   
        }
        
        if(count == 5) {
            for(int i = 0; i < chosenArr.length; i++) {
                if(lotteryArr[6].equals(chosenArr[i])) {
                    count = 7;
                    break;
                }else {
                    count = 8;
                }
            }
        }
        
        switch(count) {
            
            case 0:
                System.out.print(0);
                break;
            case 1:
                System.out.print(0);
                break;
            case 2:
                System.out.print(0);
                break;
            case 3:
                System.out.print(5);
                break;
            case 4:
                System.out.print(4);
                break;
            case 6:
                System.out.print(1);
                break;
            case 7:
                System.out.print(2);
                break;
            case 8:
                System.out.print(3);
                break;
                
        }
        
	}

}
