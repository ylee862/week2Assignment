package src;

import src.DivideByZeroException;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operator;


        try {
            // 숫자1 입력
            num1 = 10;

            // 숫자2 입력
            num2 = 5;

            // 연산자 입력
            operator = '/';

            // calculate 메소드 호출
            int result = calculate(10, 5, '/');
            System.out.println(result);


            // 결과 출력

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }


    }
    public static int calculate ( int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        // 사칙연산 수행 및 예외 처리
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0){
                    throw new DivideByZeroException();
                }
                result = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        return result;
    }
}

