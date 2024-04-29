package cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.jwt.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
}