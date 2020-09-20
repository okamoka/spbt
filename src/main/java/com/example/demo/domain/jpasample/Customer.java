package com.example.demo.domain.jpasample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Customer {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private long id;
   private String firstName;
   private String lastName; 

   @Override
   public String toString() {
      return String.format(
          "Customer[id=%d, firstName='%s', lastName='%s']", 
          id, firstName, lastName);
   }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    } 
}
