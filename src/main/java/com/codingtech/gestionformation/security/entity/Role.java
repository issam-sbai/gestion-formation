package com.codingtech.gestionformation.security.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a role entity in the system.
 */
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}



	public Role(String nom) {
		this.nom = nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}
// Getters and setters generated by Lombok @Data
}
