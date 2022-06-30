package com.danielprog.mavenproj.app.model;

import com.danielprog.mavenproj.app.model.Rol;
import com.danielprog.mavenproj.app.model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-06-30T03:55:04")
@StaticMetamodel(UsuarioRol.class)
public class UsuarioRol_ { 

    public static volatile SingularAttribute<UsuarioRol, Integer> uSRol;
    public static volatile SingularAttribute<UsuarioRol, Usuario> fkUsuario;
    public static volatile SingularAttribute<UsuarioRol, Rol> fkNoRol;

}