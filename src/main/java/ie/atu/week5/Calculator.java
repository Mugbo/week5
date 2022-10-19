package ie.atu.week5;

public class Calculator {
        private int result;
        private int num1;
        private int num2;

        public Calculator() {
            result = 0;
            num1 = 1;
            num2 = 2;
        }

        public int add(int num1, int num2) {
            result = num1 + num2;
            return result;
        }

        public int multiply(int num1, int num2){
            result = num1 * num2;
            return result;
        }

        public int subtract(int num1, int num2){
            result = num1 - num2;
            return result;
        }

        public int divide(int num1, int num2){
            result = num1 / num2;
            return result;
        }
}
