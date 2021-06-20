import java.util.Scanner;

class Unit {
    String WeightFrom[] = new String[]{"lb", "oz", "gr"};
    String WeightTo[] = new String[]{"mg", "g", "kg"};
    double WeightChange[] = new double[]{453592.37, 28349.52, 64.799};
    double WeightUnit[] = new double[]{1, 1000, 1000000};
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
        String ConvertFrom;
        String ConvertTo;
        double Value, num1, result, num2;

        switch (unit) {
            case "weight":
                System.out.print("Convert from? ");
                ConvertFrom = sc.nextLine();
                switch (ConvertFrom) {
                    case "lb":
                        System.out.print("Convert to? ");
                        ConvertTo = sc.nextLine();
                        switch (ConvertTo) {
                            case "mg":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[0];
                                num2 = n1.WeightUnit[0];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[0] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[0], result);
                                break;
                            case "g":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[0];
                                num2 = n1.WeightUnit[1];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[0] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[1], result);
                                break;
                            case "kg":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[0];
                                num2 = n1.WeightUnit[2];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[0] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[2], result);
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                        break;
                    case "oz":
                        System.out.print("Convert to? ");
                        ConvertTo = sc.nextLine();
                        switch (ConvertTo) {
                            case "mg":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[1];
                                num2 = n1.WeightUnit[0];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[1] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[0], result);
                                break;
                            case "g":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[1];
                                num2 = n1.WeightUnit[1];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[1] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[1], result);
                                break;
                            case "kg":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[1];
                                num2 = n1.WeightUnit[2];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[1] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[2], result);
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                        break;
                    case "gr":
                        System.out.print("Convert to? ");
                        ConvertTo = sc.nextLine();
                        switch (ConvertTo) {
                            case "mg":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[2];
                                num2 = n1.WeightUnit[0];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[2] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[0], result);
                                break;
                            case "g":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[2];
                                num2 = n1.WeightUnit[1];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[2] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[1], result);
                                break;
                            case "kg":
                                System.out.print("Value? ");
                                Value = sc.nextDouble();
                                num1 = n1.WeightChange[2];
                                num2 = n1.WeightUnit[2];
                                result = Value * num1 * num2;
                                System.out.print(Value + n1.WeightFrom[2] + "---->");
                                System.out.printf("%.3f" + n1.WeightTo[2], result);
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");

                }
                break;

            case "length":
                switch (unit) {
                    case "length":
                        System.out.print("Convert from? ");
                        ConvertFrom = sc.nextLine();
                        switch (ConvertFrom) {
                            case "in":
                                System.out.print("Convert to? ");
                                ConvertTo = sc.nextLine();
                                switch (ConvertTo) {
                                    case "mm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[0];
                                        num2 = n1.LengthUnit[0];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[0] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[0], result);
                                        break;
                                    case "cm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[0];
                                        num2 = n1.LengthUnit[1];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[0] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[1], result);
                                        break;
                                    case "m":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[0];
                                        num2 = n1.LengthUnit[2];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[0] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[2], result);
                                        break;
                                    case "km":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[0];
                                        num2 = n1.LengthUnit[3];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[0] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[3], result);
                                        break;
                                    default:
                                        System.out.println("잘못된 입력입니다.");
                                }
                                break;
                            case "ft":
                                System.out.print("Convert to? ");
                                ConvertTo = sc.nextLine();
                                switch (ConvertTo) {
                                    case "mm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[1];
                                        num2 = n1.LengthUnit[0];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[1] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[0], result);
                                        break;
                                    case "cm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[1];
                                        num2 = n1.LengthUnit[1];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[1] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[1], result);
                                        break;
                                    case "m":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[1];
                                        num2 = n1.LengthUnit[2];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[1] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[2], result);
                                        break;
                                    case "km":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[1];
                                        num2 = n1.LengthUnit[3];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[1] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[3], result);
                                        break;
                                    default:
                                        System.out.println("잘못된 입력입니다.");
                                }
                                break;
                            case "yd":
                                System.out.print("Convert to? ");
                                ConvertTo = sc.nextLine();
                                switch (ConvertTo) {
                                    case "mm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[2];
                                        num2 = n1.LengthUnit[0];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[2] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[0], result);
                                        break;
                                    case "cm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[2];
                                        num2 = n1.LengthUnit[1];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[2] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[1], result);
                                        break;
                                    case "m":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[2];
                                        num2 = n1.LengthUnit[2];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[2] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[2], result);
                                        break;
                                    case "km":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[2];
                                        num2 = n1.LengthUnit[3];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[2] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[3], result);
                                        break;
                                    default:
                                        System.out.println("잘못된 입력입니다.");
                                }
                                break;
                            case "mile":
                                System.out.print("Convert to? ");
                                ConvertTo = sc.nextLine();
                                switch (ConvertTo) {
                                    case "mm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[3];
                                        num2 = n1.LengthUnit[0];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[3] + "---->");
                                        System.out.printf("%3.1f" + n1.LengthTo[0], result);
                                        break;
                                    case "cm":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[3];
                                        num2 = n1.LengthUnit[1];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[3] + "---->");
                                        System.out.printf("%3.1f" + n1.LengthTo[1], result);
                                        break;
                                    case "m":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[3];
                                        num2 = n1.LengthUnit[2];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[3] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[2], result);
                                        break;
                                    case "km":
                                        System.out.print("Value? ");
                                        Value = sc.nextDouble();
                                        num1 = n1.LengthChange[3];
                                        num2 = n1.LengthUnit[3];
                                        result = Value * num1 * num2;
                                        System.out.print(Value + n1.LengthFrom[3] + "---->");
                                        System.out.printf("%.3f" + n1.LengthTo[3], result);
                                        break;
                                    default:
                                        System.out.println("잘못된 입력입니다.");
                                }
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");

                        }
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");
                }
        }
    }
}

