package br.com.rpires.service;

/**
 * @author rodrigo.pires
 */
public interface IContratoService {
    String salvar();

    
    String buscar(Long id);

    String excluir(Long id);

    String atualizar(Long id, String novoContrato);
    
    
}
