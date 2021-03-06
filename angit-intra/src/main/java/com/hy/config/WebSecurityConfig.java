package com.hy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/").permitAll()// 访问：/home
//																// 无需登录认证权限
//				.anyRequest().authenticated() // 其他所有资源都需要认证，登陆后访问
//				// .antMatchers("/hello").hasAuthority("ADMIN")
//				// //登陆后之后拥有“ADMIN”权限才可以访问/hello方法，否则系统会出现“403”权限不足的提示
//				.and().formLogin().loginPage("/login")// 指定登录页是”/login”
//				.permitAll().successHandler(loginSuccessHandler()) // 登录成功后可使用loginSuccessHandler()存储用户信息，可选。
//				.and().logout().logoutSuccessUrl("/home") // 退出登录后的默认网址是”/home”
//				.permitAll().invalidateHttpSession(true).and().rememberMe()// 登录后记住用户，下次自动登录,数据库中必须存在名为persistent_logins的表
//				.tokenValiditySeconds(1209600);
		http.authorizeRequests()
			.antMatchers("/webjars/**","/lib/**").permitAll().anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.permitAll()
			.successHandler(loginSuccessHandler())
			.and()
			.logout()
			.permitAll()
			.and()
			.csrf()
			.disable();
			
		super.configure(http);
	}

//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("111111").roles("USER","ADMIN")
//		.and().withUser("root").password("1").roles("USER");
//	}

	@Bean
	public LoginSuccessHandler loginSuccessHandler() {
		return new LoginSuccessHandler();
	}

}
