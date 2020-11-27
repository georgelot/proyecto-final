package cl.cparra.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws  Exception{
		
		String adminUsername = "admin@mail.cl";
		String adnimPassword = passwordEncoder().encode("1234");
		String adminRole = "ADMIN";
		
		String userUsername = "conserje@mail.cl";
		String userPassword = passwordEncoder().encode("1234");
		String userRole = "CONSERJE";
		
		String residentUsername = "residente@mail.cl";
		String residentuserPassword = passwordEncoder().encode("1234");
		String residentRole = "RESIDENTE";
		
		auth.inMemoryAuthentication().withUser(adminUsername).password(adnimPassword).roles(adminRole);
		auth.inMemoryAuthentication().withUser(userUsername).password(userPassword).roles(userRole);
		auth.inMemoryAuthentication().withUser(residentUsername).password(residentuserPassword).roles(residentRole);
		
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception{
	
		http.csrf().disable();
		
		http.authorizeRequests()
		.antMatchers("/auth/**").permitAll()
		.antMatchers("/home/**").permitAll()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/mantenedorEmpleados").hasRole("ADMIN")
		.antMatchers("/mantenedorResidentes").hasRole("ADMIN")
		.antMatchers("/actualizaResidente").hasRole("ADMIN")
		.antMatchers("/actualizaEmpleado").hasRole("ADMIN")
		.antMatchers("/empleado/**").hasAnyRole("ADMIN", "CONSERJE")
		.antMatchers("actualizaEmpleado").hasAnyRole("ADMIN", "CONSERJE")
		.antMatchers("/registoEncomiendas").hasAnyRole("ADMIN", "CONSERJE")
		.antMatchers("/registroEventos").hasAnyRole("ADMIN", "CONSERJE")
		.antMatchers("/registroVisitas").hasAnyRole("ADMIN", "CONSERJE")
		.antMatchers("/residentes/**").hasAnyRole("ADMIN", "RESIDENTE")
		.antMatchers("/actualizaResidente").hasAnyRole("ADMIN", "RESIDENTE")
		.antMatchers("/misEncomiendas").hasAnyRole("ADMIN", "RESIDENTE")
		.antMatchers("/misEspacios").hasAnyRole("ADMIN", "RESIDENTE")
		.antMatchers("/misVisitas").hasAnyRole("ADMIN", "RESIDENTE")
		.antMatchers("/login").permitAll()
		.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
		
		.anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll()
		.failureUrl("/login?error=true")
		.usernameParameter("email").passwordParameter("password")
		.defaultSuccessUrl("/")
		.and().exceptionHandling().accessDeniedPage("/prohibido");
		
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
