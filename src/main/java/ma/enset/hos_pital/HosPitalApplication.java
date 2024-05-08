package ma.enset.hos_pital;

import ma.enset.hos_pital.entities.Patient;
import ma.enset.hos_pital.ropositori.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HosPitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;


    public static void main(String[] args) {
        SpringApplication.run(HosPitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,134));
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,431));
        patientRepository.save(new Patient(null,"Imane",new Date(),true,124));

    }
}
