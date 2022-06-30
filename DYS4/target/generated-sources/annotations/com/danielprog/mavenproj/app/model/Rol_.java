package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.UsuarioRol;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SetAttribute<Rol, UsuarioRol> usuarioRolesSet;
    public static volatile SingularAttribute<Rol, String> nombreRol;
    public static volatile SingularAttribute<Rol, Integer> noRol;

}