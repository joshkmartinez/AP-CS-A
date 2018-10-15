
public class QuadraticFormula
{
    private static double findQuadForm(double a, double b, double c){
        double ans = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        return ans;
    }   
    public static void main(String[] args) {
       System.out.println(findQuadForm(3,6,6));
    }
}
