package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.Producto;
import com.danielprog.mavenproj.app.model.Venta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Date> fecha;
    public static volatile SingularAttribute<Inventario, Integer> nOProducto;
    public static volatile SetAttribute<Inventario, Venta> ventasSet;
    public static volatile SetAttribute<Inventario, Producto> productosSet;
    public static volatile SingularAttribute<Inventario, Integer> cantidad;
    public static volatile SingularAttribute<Inventario, Integer> idInventario;

}