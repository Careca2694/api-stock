package stockManeger.api_stock.infrastructur.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stockManeger.api_stock.infrastructur.entity.Produto;
import stockManeger.api_stock.infrastructur.exception.ProdutoNaoEncontrado;
import stockManeger.api_stock.infrastructur.service.ProdutoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stock-api")
public class ProdutoController {

    private ProdutoService produtoService;

    @GetMapping("{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return produtoService.procurarPorId(id).orElseThrow(() -> new ProdutoNaoEncontrado("Produto com " + id + " nao encontrado"));
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos(){

        try{
            List<Produto>listar  = produtoService.listarTodos();
            return ResponseEntity.ok().body(listar);
        }catch(ProdutoNaoEncontrado ex){
            throw new ProdutoNaoEncontrado("Produto nao encontrado");
        }
    }

    @PostMapping
    public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto){
        Produto prod = produtoService.salvarProduto(produto);
        return ResponseEntity.ok().body(prod);
    }

}
