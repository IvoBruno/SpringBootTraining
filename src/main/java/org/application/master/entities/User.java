package org.application.master.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.Consumer;


@Entity
//determina que esta classe trata-se de uma entidade a ser mantida no banco de dados
@Table(name = "tb_user")
//determina o nome da tabela onde serão armazenados os dados, caso não informássemos, seria o mesmo nome da classe
public class User implements Serializable{
   @Id
   //determina que o atributo id da classe vai ser o ‘id’ do banco e o mesmo será chave primaria
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   //Determina que o banco de dados vai gerar o valor para o ‘id’ dessa entidade
   private Long id;
   private String name;
   private String email;
   private String password;
   private String phone;

   public User() {}

   public User(Long id, String name, String email, String password, String phone) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.password = password;
      this.phone = phone;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   @Override
   public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      User user = (User) o;
      return Objects.equals(getId(), user.getId());
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(getId());
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", email='" + email + '\'' +
              ", phone='" + phone + '\'' +
              '}';
   }
}
