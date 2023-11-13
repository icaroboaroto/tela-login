import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe de verificação, que simula a autenticação com banco de dados. 
 */

public class LoginScreen {	
	private Map<String, String> userDatabase;
	
	//Banco de dados simulado, que armazena o "username" e o "password"

	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	
	public boolean login(String username, String password) {	
		if (userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true;//o login deu certo
			}
		}
		return false;//o login deu errado
	}

	/**
	 * Este é um método construtor que valida as informações do usuário para a tentiva de login.
@param username é associado ao "nome de usuário", que é fornecido pelo usuário que está tentando logar.
@param password é associado a "senha", que é fornecida pelo usuário que está tentando logar.
@return (código funcionando) se a autenticação ter sucesso,(código deu erro) se a autenticação deu algum problema
	 */
	
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}

	/**
	 * Adiciona um novo usuário ao "banco de dados".
	 * Observação: Este método é uma simplificação do funcionamento de um método de "cadastro".
	 * Em projetos reais, o uso deste método é desencorajado devido à falta das medidas adequadas de segurança.
	 * @param username ("nome do usuário") é criado.
	 * @param password ("senha") é criada.
	*/
}