package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.UsuarioRol;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SetAttribute<Usuario, UsuarioRol> usuarioRolesSet;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, Integer> documento;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, Integer> telefono;
    public static volatile SingularAttribute<Usuario, String> nombre;

}