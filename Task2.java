public class Task2 {
    
    public static void main(String[] args) {
        int[][] range={{1,400,5},{401,800,4},{801,1200,3},{1201,9000,2},{9001,15000,1}};
        int num=12452; // input variable
        for(int i=0;i<range.length;i++)
        {
            int toVal=range[i][1];
            if(num<=toVal)
            {
                int discountPercent=range[i][2];
                double discountAmnt=(num*discountPercent)/100.00;
                double remainingAmnt=num-discountAmnt;
                System.out.println("Your commission rate is "+discountPercent+"% you will get "+discountAmnt+" and remaining amount is "+remainingAmnt);
                break;
            }
        }
    }
}
