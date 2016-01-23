package data.converter;

public class ConverterExeption extends Exception {

    public ConverterExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ConverterExeption(Throwable cause) {
        super("Converter has thrown exception", cause);
    }
}
