package com.tecdesoftware.market.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    //Valor único autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column (name= "id_categoria")
    private Integer IdCategoria;

    @Column (name = "coidgo_barras")
    private String codigoBarras;

    @Column (name = "precio_venta")
    private Double precioVenta;

    @Column (name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;
}
