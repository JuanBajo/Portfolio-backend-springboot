package com.yoprogramo.portfoliopersonal.security;

import com.yoprogramo.portfoliopersonal.utils.JWTUtil;
import static io.jsonwebtoken.Jwts.claims;
import java.io.IOException;
import java.util.List;
import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JWTAuthFilter extends OncePerRequestFilter {

    public JWTUtil jwt;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        if (jwt == null) {
            ServletContext servletContext = request.getServletContext();
            WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
            jwt = webApplicationContext.getBean(JWTUtil.class);
        }

        String token = request.getHeader("Authorization");
        if (token != null){
            String user = jwt.getValue(token);
            List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN");
            UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user, null, grantedAuthorities);
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        
        
        filterChain.doFilter(request, response);
        

    }

}
