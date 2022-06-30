package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.Inventario;
import com.danielprog.mavenproj.app.model.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Inventario> cantidad;
    public static volatile SingularAttribute<Venta, Producto> producto;
    public static volatile SingularAttribute<Venta, Integer> idVenta;

}