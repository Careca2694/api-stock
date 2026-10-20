package stockManeger.api_stock.infrastructur.service;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import stockManeger.api_stock.infrastructur.entity.Categoria;
import stockManeger.api_stock.infrastructur.entity.Produto;
import stockManeger.api_stock.infrastructur.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public Optional<Produto> procurarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }
    public Produto procurarPorNome(String nome) {
        return produtoRepository.findByNome(nome);
    }
    public Produto procurarPorCategoria(Categoria categoria) {
        return produtoRepository.findByCategoria(categoria);
    }
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
    public Produto atualizarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }


}
