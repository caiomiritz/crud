package br.com.ad.crud.controller.impl;

import br.com.ad.crud.controller.CidadeController;
import br.com.ad.crud.model.Cidade;
import java.util.*;

public class CidadeArmazenamentoVolatilController implements CidadeController {

    private Map<UUID, Cidade> cidades = new HashMap<>();

    @Override
    public void cadastrar(Cidade cidade) {
        cidade.setId(UUID.randomUUID());
        cidades.put(cidade.getId(), cidade);
    }
}
