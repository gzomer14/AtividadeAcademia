package main;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import exception.LoginException;

public class LoginWindow extends JDialog{

	private JLabel lblNomeSistema;
	private JTextField txfUsuario;
	private JPasswordField txfSenha;
	private JButton btnEntrar;
	
	public LoginWindow() {
		setSize(600,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		componentesCriar();
	}
	
	private void componentesCriar() {
		
		lblNomeSistema = new JLabel("MasterSys");
		lblNomeSistema.setFont(new Font(Font.MONOSPACED, Font.BOLD, 32));
		lblNomeSistema.setBounds(200, 50, 200, 45);
		getContentPane().add(lblNomeSistema);
		
		txfUsuario = new JTextField();
		txfUsuario.setBounds(100, 100, 350, 25);
		getContentPane().add(txfUsuario);
		
		txfSenha = new JPasswordField();
		txfSenha.setBounds(100, 135, 350, 25);
		getContentPane().add(txfSenha);
		
		btnEntrar = new JButton();
		btnEntrar.setAction(new AbstractAction("ENTRAR") {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				LoginException exception = validaUsuario();
				if(exception != null) {
					JOptionPane.showMessageDialog(null, "["+exception.getCodigo()+"]: "+exception.getMensagem());
				}
				else if((exception = validaSenha()) != null) {
					JOptionPane.showMessageDialog(null, "["+exception.getCodigo()+"]: "+exception.getMensagem());
				}
				else {
					JOptionPane.showMessageDialog(null, "Logado com sucesso !");
				}
			}
		});
		btnEntrar.setBounds(100, 165, 350, 35);
		getContentPane().add(btnEntrar);
	}
	
	private LoginException validaUsuario() {
		
		final String usuarioDigitado = txfUsuario.getText();
		if (usuarioDigitado.isEmpty()) {
			return new LoginException(false, "Campo usuário obrigatório !", LoginException.CODIGO_USUARIO_OBRIGATORIO);
		}
		else if (usuarioDigitado.indexOf(" ") > 0) {
			return new LoginException(false, "Campo usuário não pode ter espaços !", 98);
		}
		
		return null;
	}
	
	private LoginException validaSenha() {
		final String senhaDigitada = txfSenha.getText();
		if (senhaDigitada.isEmpty()) {
			return new LoginException(false, "Campo senha obrigatório !", LoginException.CODIGO_SENHA_OBRIGATORIO);
		}
		else if(senhaDigitada.indexOf(" ") > 0) {
			return new LoginException(false, "Campo senha não pode ter espaços !", 98);
		}
		return null;
	}
	
	public static void main(String[] args) {
		new LoginWindow().setVisible(true);
	}

}
