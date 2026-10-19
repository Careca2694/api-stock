package stockManeger.api_stock.infrastructur.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Optional;

@Entity
public class MovimentoStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
    @Enumerated(EnumType.STRING)
    private TipoMovimento tipoMovimento;
    private Integer quantidade;
    private Date dataHora;
    private Optional<String>observacao;

}
