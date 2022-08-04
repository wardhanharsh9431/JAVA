public class main23 {
    public int FunctionName(int x, int y) // Two parameters in the function
    {
        return (x + y); // Returns the sum of the two numbers
    }

    // This function takes three integer parameters
    public int FunctionName(int x, int y, int z) {
        return (x + y + z);
    }

    // This function takes two double parameters
    public double FunctionName(double x, double y) {
        return (x + y);
    }// Many more such methods can be done with different number of parameters
     // Code used to input the number and

    public static void main(String args[]) {
        FunctionName s = new FunctionName();
        System.out.println(s.FunctionName(10, 20));
        System.out.println(s.FunctionName(10, 20, 30));
        System.out.println(s.FunctionName(10.5, 20.5));
    }
}