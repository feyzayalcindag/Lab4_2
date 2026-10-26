public class EquationReverser {
// Feyza Yalçındağ 250444002 26.10.26
    public static String reverseEquation(String equation) {

        TokenStack stack = new TokenStack();

        int i = 0;

        while (i < equation.length()) {

            char ch = equation.charAt(i);

            // Sayıysa
            if (Character.isDigit(ch)) {

                int start = i;

                while (i < equation.length()
                        && Character.isDigit(equation.charAt(i))) {
                    i++;
                }

                String number = equation.substring(start, i);

                stack.push(number);
            }

            // Operatörse (+ - * /)
            else {

                stack.push(String.valueOf(ch));
                i++;
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}