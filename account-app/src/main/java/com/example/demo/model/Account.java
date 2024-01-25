package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "account_table")
public class Account implements Serializable {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number")
	private String accountNumber;
	@Column(name = "account_holder_name")
	private String accountHolderName;
	@Column(name = "account_holder_address")
	private String accountHolderAddress;
	@Column(name = "account_holder_email",unique = true)
	private String email;

	public Account(String accountHolderName, String accountHolderAddress, String email) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		this.email = email;
	}

}
