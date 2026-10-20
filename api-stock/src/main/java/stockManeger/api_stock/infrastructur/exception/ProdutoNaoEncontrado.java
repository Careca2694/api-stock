package stockManeger.api_stock.infrastructur.exception;

public class ProdutoNaoEncontrado extends RuntimeException{

    public ProdutoNaoEncontrado(String message) {
        super(message);
    }

    public ProdutoNaoEncontrado(String message, Throwable cause) {
        super(message, cause);
    }
}
