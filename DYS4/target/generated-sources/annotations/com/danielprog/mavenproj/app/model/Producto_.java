package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.Inventario;
import com.danielprog.mavenproj.app.model.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SetAttribute<Producto, Venta> ventasSet;
    public static volatile SingularAttribute<Producto, Inventario> categoria1;
    public static volatile SingularAttribute<Producto, Integer> idProducto;

}