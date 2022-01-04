package com.indra.formacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.indra.formacion.model.UsuarioRegistro;
import com.indra.formacion.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UsuarioService service;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		List<UsuarioRegistro> listaRegistro = service.findAll();
		
		for(UsuarioRegistro uR: listaRegistro) {
			auth.inMemoryAuthentication()
			.withUser(uR.getLogin()).password(passwordEncoder().encode(uR.getPass())).roles("ADMIN")
			.and()
			.withUser("p").password(passwordEncoder().encode("pass")).roles("USER");	
		
		}
	}
	@Override
	protected void configure(HttpSecurity session) throws Exception{
		//session.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		session.csrf().disable().authorizeRequests().anyRequest().authenticated()
		.and().formLogin().permitAll().and().logout().permitAll();
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
}
