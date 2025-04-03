package hkmu.wadd.dao;

import hkmu.wadd.model.TicketUser;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserManagementService {
    @Autowired
    private PasswordEncoder pe;

    @Resource
    private TicketUserRepository tuRepo;

    @Transactional
    public List<TicketUser> getTicketUsers() {
        return tuRepo.findAll();
    }

    @Transactional
    public void delete(String username) {
        TicketUser ticketUser = tuRepo.findById(username).orElse(null);
        if (ticketUser == null) {
            throw new UsernameNotFoundException("User '" + username + "' not found.");
        }
        tuRepo.delete(ticketUser);
    }

    @Transactional
    public void createTicketUser(String username, String password, String[] roles) {
        TicketUser user = new TicketUser(username, pe.encode(password), roles);
        tuRepo.save(user);
    }

    @Transactional
    @PostConstruct
    public void createFirstAdmin() {
        if (tuRepo.count() == 0) {
            TicketUser user = new TicketUser("keith", pe.encode("keithpw"),
                    new String[]{"ROLE_ADMIN", "ROLE_USER"});
            tuRepo.save(user);
        }
    }
}