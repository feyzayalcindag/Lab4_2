public class ReverseEquationDemo {
    // Feyza Yalçındağ 250444002 26.10.26
    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };

        for (String equation : equations) {

            System.out.println("Input:  " + equation);

            System.out.println(
                    "Output: "
                            + EquationReverser.reverseEquation(equation)
            );

            System.out.println();
        }
    }
}
