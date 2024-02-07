public class NoHayExistenciasException extends RuntimeException {
    public NoHayExistenciasException() {
        super("No quedan existencias del producto");
    }
}
