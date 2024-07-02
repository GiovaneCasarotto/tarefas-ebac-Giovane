package cadastrocliente.br.com.gcasarotto.dao;


import cadastrocliente.br.com.gcasarotto.domain.Cliente;
import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}