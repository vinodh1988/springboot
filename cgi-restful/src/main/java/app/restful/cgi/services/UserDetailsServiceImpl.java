package app.restful.cgi.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import app.restful.cgi.repositories.UserDAO;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
@Autowired
	UserDAO userdao;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		app.restful.cgi.repositories.User u=userdao.findByName(name);
		return new User(u.getUser(), u.getPassword(), getGrantedAuthorities(u));
	}
	
	public Collection<GrantedAuthority> getGrantedAuthorities(app.restful.cgi.repositories.User user){
		Collection<GrantedAuthority> c=new ArrayList<GrantedAuthority>();
		if(user.getRole().equals("admin"))
		c.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		else
		c.add(new SimpleGrantedAuthority("ROLE_USER"));
		return c;
	}
	
	

}
