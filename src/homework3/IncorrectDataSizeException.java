package homework3;

public class IncorrectDataSizeException extends RuntimeException {
    public IncorrectDataSizeException() {
        super("Введено неверное количество данных");
    }
}
