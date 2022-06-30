package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.Domiciliario;
import com.danielprog.mavenproj.app.model.Reporte;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(Domicilio.class)
public class Domicilio_ { 

    public static volatile SetAttribute<Domicilio, Domiciliario> domiciliarioSet;
    public static volatile SingularAttribute<Domicilio, Integer> precio;
    public static volatile SingularAttribute<Domicilio, Reporte> nODomicilio;
    public static volatile SingularAttribute<Domicilio, String> producto;
    public static volatile SingularAttribute<Domicilio, Integer> cantidad;
    public static volatile SingularAttribute<Domicilio, Integer> idDomicilio;

}