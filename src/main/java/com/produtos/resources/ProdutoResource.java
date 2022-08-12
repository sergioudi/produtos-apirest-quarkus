package com.produtos.resources;

import com.produtos.models.Produto;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(hal = true)
public interface ProdutoResource extends PanacheEntityResource<Produto, Long>{
    

}