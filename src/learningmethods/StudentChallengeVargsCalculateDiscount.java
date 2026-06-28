package learningmethods;

public class StudentChallengeVargsCalculateDiscount {
    public static void main(String[] args) {

        double[] prices = {100, 200, 300, 400, 500};
        System.out.println("Discount is : " + calculateDiscount(prices));

    }

    static double calculateDiscount(double... prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }

        if(sum<500){
            return (sum *0.1);
        } else if (500<=sum && sum<1000) {
            return (sum *0.2);
        } else if (sum>=1000) {
            return (sum *0.3);
        }
        return 0;
    }
}
