import java.util.ArrayList;
import java.util.List;

public class CarteiraPrime {
	
	private List<Cliente> clientes =  new ArrayList<>();
	
	
	
	public void adicionar(Cliente cliente) {
		this.clientes.add(cliente);
		System.out.println("Cliente Adicionado");
	}
	
	public void listar() {
		List<Cliente> clientes = this.clientes;
		for (Cliente cliente : clientes) {
			System.out.println("Nome: " + cliente.getNome() + " CPF: " + cliente.getCpf());
		}
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
