package homework3;

public class IncorrectDateFormatException extends RuntimeException {
    public IncorrectDateFormatException() {
        super("Дата рождения должна быть введена в формате dd.mm.yyyy");
    }
}
