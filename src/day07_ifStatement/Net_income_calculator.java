package day07_ifStatement;

public class Net_income_calculator {
    public static void main(String[] args) {
            int salary = 79000;
            boolean married= true;
            // burda result yaparsam string verir onu istemiyoruz%pecentage istiyoruz ama decimal haliyle yazicaz
            double taxRate = 0;
            if(salary >=130){
                taxRate = 0.35;
            }
            if(salary< 130000 && salary >= 100000){
                taxRate= 0.30;
            }
            if (salary <100000 && salary >=80000){
                taxRate = 0.25;
            }
            if(salary <80000){
                taxRate =0.20;
            }

            if(married){
                taxRate -= 0.05;
            }

            System.out.println(taxRate);
            double salaryAfterTax = salary - (salary * taxRate);
            System.out.println("Salary After Tax = " + salaryAfterTax);





        }
    }


