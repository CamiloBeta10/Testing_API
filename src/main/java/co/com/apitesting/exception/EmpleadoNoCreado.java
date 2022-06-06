package co.com.apitesting.exception;

public class EmpleadoNoCreado extends  AssertionError{

    public static final String CREACION_FALLIDA = "Empleado creado fallido";

    public EmpleadoNoCreado(String message) {
        super(message);
    }

    public EmpleadoNoCreado(String message, Throwable cause) {
        super(message, cause);
    }
}
