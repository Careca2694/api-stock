package stockManeger.api_stock.infrastructur.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stockManeger.api_stock.infrastructur.entity.Produto;
import stockManeger.api_stock.infrastructur.exception.ProdutoNaoEncontrado;
import stockManeger.api_stock.infrastructur.service.ProdutoService;

import java.util.Optional;

@RestController
@RequestMapping("/stock-api")
public class ProdutoController {

    private ProdutoService produtoService;

    @GetMapping("{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return produtoService.procurarPorId(id).orElseThrow(() -> new ProdutoNaoEncontrado("Produto com " + id + " nao encontrado"));
    }


}
