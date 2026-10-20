package stockManeger.api_stock.infrastructur.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stockManeger.api_stock.infrastructur.entity.Categoria;
import stockManeger.api_stock.infrastructur.entity.Produto;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public Produto findByNome(String nome);
    public Produto findByCategoria(Categoria categoria);

}
