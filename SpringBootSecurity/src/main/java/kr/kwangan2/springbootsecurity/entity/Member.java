package kr.kwangan2.springbootsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import kr.kwangan2.springbootsecurity.domain.Role;
import lombok.Data;

@Entity
@Data
public class Member {
	
	@Id
	private String id;
	private String password;
	private String name;
	@Enumerated(EnumType.STRING)
	private Role role;
	private String enabled;

}
