package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.Domicilio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(Reporte.class)
public class Reporte_ { 

    public static volatile SingularAttribute<Reporte, Date> fecha;
    public static volatile SingularAttribute<Reporte, Integer> precio;
    public static volatile SetAttribute<Reporte, Domicilio> domiciliosSet;
    public static volatile SingularAttribute<Reporte, Integer> idReporte;
    public static volatile SingularAttribute<Reporte, Integer> nOReporte;
    public static volatile SingularAttribute<Reporte, Integer> cantidad;
    public static volatile SingularAttribute<Reporte, String> nombre;

}