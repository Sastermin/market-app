package com.tecdesoftware.market.persistence.mapper;

import com.tecdesoftware.market.domain.Product;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);
    @Mappings({
            // Aquí ignoramos el ID para evitar errores al insertar nuevos productos
            @Mapping(target = "idProducto", ignore = true),
            @Mapping(source = "name", target = "nombre"),
            @Mapping(source = "categoryId", target = "idCategoria"),
            @Mapping(source = "price", target = "precioVenta"),
            @Mapping(source = "stock", target = "cantidadStock"),
            @Mapping(source = "active", target = "estado"),
            @Mapping(target = "codigoBarras", ignore = true),
            @Mapping(target = "categoria", ignore = true)
    })
    Producto toProducto(Product product);
}

