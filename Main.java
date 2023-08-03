import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Реализуйте метод, который запрашивает у пользователя ввод дробного 
// числа (типа float), и возвращает введенное значение. Ввод текста вместо 
// числа не должно приводить к падению приложения, вместо этого, необходимо 
// повторно запросить у пользователя ввод данных.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        float result = getFloatFromUser(bufferedReader);
        bufferedReader.close();
        System.out.println(result);
    }

    public static float getFloatFromUser(BufferedReader bufferedReader) throws IOException {
        System.out.print("Введите число: ");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Произошла ошибка при преобразовании введенного значения в число с плавающей точкой!");
            return getFloatFromUser(bufferedReader);
        }
        return result;
    }
}
