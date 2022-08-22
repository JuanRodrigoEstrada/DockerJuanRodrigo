package com.bosonit.DockerJuanRodrigo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UsuarioOutputDTO implements Serializable {
    private Integer id_persona;
    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;

    public UsuarioOutputDTO(UsuarioEntity usuarioEntity) {
        if (usuarioEntity == null) return;
        id_persona = usuarioEntity.getId_persona();
        usuario = usuarioEntity.getUsuario();
        password = usuarioEntity.getPassword();
        name = usuarioEntity.getName();
        surname = usuarioEntity.getSurname();
        company_email = usuarioEntity.getCompany_email();
        personal_email = usuarioEntity.getPersonal_email();
        city = usuarioEntity.getCity();
        active = usuarioEntity.getActive();
        created_date = usuarioEntity.getCreated_date();
        imagen_url = usuarioEntity.getImagen_url();
        termination_date = usuarioEntity.getTermination_date();
    }
}
