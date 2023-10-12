package com.codingtech.gestionformation.security.dao2;


import com.codingtech.gestionformation.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;





public interface IRoleDao extends JpaRepository<Role, Integer> {

    public Role findRoleByNom(String namRole);

}
