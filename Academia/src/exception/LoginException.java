package exception;

public class LoginException {


    private boolean valido;
    private String mensagem;
    private int codigo;

    public static final int CODIGO_USUARIO_OBRIGATORIO = 99;
    public static final int CODIGO_SENHA_OBRIGATORIO = 98;


    public LoginException(final boolean valido, final String mensagem, final int codigo) {
        this.valido = valido;
        this.mensagem = mensagem;
        this.codigo = codigo;

}

    public boolean isValido() {
        return valido;
    }

    public String getMensagem() {
        return mensagem;
    }

    public int getCodigo() {
        return codigo;
    }

}