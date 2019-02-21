/*This class has getters and setters of the UserRole attributes. It is related to the user_role table.It has details of a user id and his role id*/
package com.apartmentReservation.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_role")
public class UserRole {
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "relation_id")
 private int id;
 
 public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public int getRoleId() {
	return roleId;
}

public void setRoleId(int roleId) {
	this.roleId = roleId;
}

@Column(name = "user_id")
 private int userId;
 
 @Column(name = "role_id")
 private int roleId;
 

 
 
 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 
}