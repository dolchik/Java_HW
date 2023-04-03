// В калькулятор добавьте возможность отменить последнюю операцию.
package Java_HW.HW_04;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class Ex_43 {
    static String menuPrint(){
        return "Нажмите 1 для сложения,\n"
                + "Нажмите 2 для вычитания,\n"
                + "Нажмите 3 для умножения,\n"
                + "Нажмите 4 для деления,\n"
                + "Нажмите 5 для удаления предыдущего результата,\n"
                + "Или нажмите 6 для завершения работы калькулятора.";
    }
    static double calculator(double v, double a, double b){
        double c = 0;
        if (v == 1){
            c = a + b;
        }
        if (v == 2){
            c = a - b;
        }
        if (v == 3){
            c = a * b;
        }
        if (v == 4){
            c = a / b;
        }
        return c;
    }
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(Ex_43.class.getName());
        FileHandler fh = new FileHandler("logJavaHw43.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.log(Level.WARNING, "Work calculator");
        logger.info("Work calculator");

        
        Scanner numScan = new Scanner(System.in);
        System.out.println("Это калькулятор.\n" + menuPrint());
        double optionNum = numScan.nextDouble();
        while(optionNum < 1 || optionNum > 6){
            System.out.println("Такого варианта нет, повторите ввод.\n"
                    + menuPrint());
            optionNum = numScan.nextDouble();
        }
        LinkedList<Double> resultList = new LinkedList<>();
        while (optionNum != 6){
            if(optionNum > 0 && optionNum < 5){
                System.out.println("Введите первое число: ");
                double firstNum = numScan.nextDouble();
                System.out.println("Введите второе число: ");
                double secondNum = numScan.nextDouble();
                while(optionNum == 4 && secondNum == 0){
                    System.out.println("На ноль делить нельзя. Повторите ввод второго числа: ");
                    secondNum = numScan.nextDouble();
                }
                Double result = calculator(optionNum, firstNum, secondNum);
                resultList.add(result);
                System.out.println("Результат вычисления равен: " + result + "." + "\n");
                System.out.println("Результаты всех предыдущих вычислений:" + resultList + "\n");
            }
            else if(optionNum == 5){
                System.out.println("Убираем результат последнего действия: " + resultList.get(resultList.size() - 1) + ".\n");
                resultList.remove(resultList.size() - 1);
                System.out.println("Результаты после отмены последнего действия: " + resultList + ".\n");
            }
            System.out.println(menuPrint());
            optionNum = numScan.nextDouble();
        }
        System.out.println("Работа завершена.");
        numScan.close();
    }
}