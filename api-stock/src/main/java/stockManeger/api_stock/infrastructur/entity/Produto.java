package stockManeger.api_stock.infrastructur.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String nome;
    @NonNull
    private Categoria categoria;
    @Column(nullable = false)
    private Integer quantidade;
    @Column(nullable = false)
    private BigDecimal preco;
    @Column(unique = true, nullable = false)
    private Integer codigo_produto;
}
