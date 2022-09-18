package co.parkapp.parkapp;

import co.parkapp.parkapp.models.Visitas;
import co.parkapp.parkapp.views.Visitasview;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkappApplication.class, args);
                
            Visitasview vista=new Visitasview();
            Visitas visita = new Visitas(1130615694,2, "Diego Cochas", "XFC435","Camioneta",2022-09-18 17:05:15,2022-09-18 17:45:30, 20000, "Pagado");
            vista.Insertarvisita(visita);
	}
            
}
