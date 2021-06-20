import java.util.Scanner;

class Unit {
    String WeightFrom[] = new String[]{"lb", "oz", "gr"};
    String WeightTo[] = new String[]{"mg", "g", "kg"};
    double WeightChange[] = new double[]{453592.37, 28349.5231, 64.79891};
    int WeightUnit[] = new int[]{1, 1000, 1000000};
    String LengthFrom[] = new String[]{"in", "ft", "yd", "mile"};
    String LengthTo[] = new String[]{"mm", "cm", "m", "km"};
    double LengthChange[] = new double[]{25.4, 304.8, 914.4, 1609344.0};
    double LengthUnit[] = new double[]{1, 0.10000, 0.0001000, 0.0000001};
}

public class Change {
    public static void main(String args[]) {
        Unit n1 = new Unit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Which unit? ");
        String unit = sc.nextLine();
        if (unit.equals("weight")) {
            System.out.print("Convert from? ");
            String ConvertFrom = sc.nextLine();
            for (int i = 0; i < n1.WeightFrom.length; i++) {
                if (n1.WeightFrom[i].equals(ConvertFrom)) {
                    System.out.print("Convert to? ");
                    String ConvertTo = sc.nextLine();
                    for (int j = 0; j < n1.WeightTo.length; j++) {
                        if (n1.WeightTo[j].equals(ConvertTo)) {
                            System.out.print("Value? ");
                            double Value = sc.nextDouble();
                            double num1 = n1.WeightChange[i];
                            int num2 = n1.WeightUnit[j];
                            double result = num1 * num2 * Value;
                            System.out.print(Value + n1.WeightFrom[i] + "---->");
                            System.out.printf("%.1f" + n1.WeightTo[j], result);
                        } else if (n1.LengthTo[j].equals(ConvertTo)) {
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                }
            }
        } else if (unit.equals("length")) {
            System.out.print("Convert from? ");
            String ConvertFrom = sc.nextLine();
            for (int i = 0; i < n1.LengthFrom.length; i++) {
                if (n1.LengthFrom[i].equals(ConvertFrom)) {
                    System.out.print("Convert to? ");
                    String ConvertTo = sc.nextLine();
                    for (int j = 0; j < n1.LengthTo.length; j++) {
                        if (n1.LengthTo[j].equals(ConvertTo)) {
                            System.out.print("Value? ");
                            double Value = sc.nextDouble();
                            double num1 = n1.LengthChange[i];
                            double num2 = n1.LengthUnit[j];
                            double result = num1 * num2 * Value;
                            System.out.print(Value + n1.LengthFrom[i] + "---->");
                            System.out.printf("%.1f" + n1.LengthTo[j], result);
                        } else if (n1.WeightTo[j].equals(ConvertTo)) {
                            System.out.println("잘못된 입력입니다.");
                        }

                    }

                }
            }
        } else {
            System.out.print("잘못된 입력입니다.");
        }
    }
}



