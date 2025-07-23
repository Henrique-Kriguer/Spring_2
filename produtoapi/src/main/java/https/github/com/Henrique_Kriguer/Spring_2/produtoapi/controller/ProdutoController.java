package https.github.com.Henrique_Kriguer.Spring_2.produtoapi.controller;

import https.github.com.Henrique_Kriguer.Spring_2.produtoapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.print("Produto recebido: " + produto);
        return produto;
    }
}
