package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;

	@NotEmpty
	@Size(min = 3, max = 20, message = "Username must be min of 3 chars and max of 20 chars")
	private String name;

	@Email
	private String email;

	@NotEmpty
	@Size(min = 6, max = 20, message = "Username must be min of 6 chars and max of 20 chars")
	private String password;

	@NotEmpty
	private String about;
}
