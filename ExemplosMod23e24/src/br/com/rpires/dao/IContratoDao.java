package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public interface IContratoDao {
    void salvar();

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

    Object buscar(Long id);

    void excluir(Long id);

    void atualizar(Long id, Object novoObj);
    
    
    
    
}
