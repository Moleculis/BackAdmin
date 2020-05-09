package ua.nure.moleculisadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MoleculisAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoleculisAdminApplication.class, args);
    }
}
