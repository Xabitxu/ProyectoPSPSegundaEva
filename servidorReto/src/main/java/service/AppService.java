package service;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;
import model.App;

public class AppService {
	private ArrayList<App> app = new ArrayList<>();
	private final File jsonFile = Paths.get("app.json").toFile();
	private final ObjectMapper mapper = new ObjectMapper();
	
	
	
	// Obtener app por ID
    public App getAppById(int id) {
        return app.stream()
                .filter(app -> app.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
 // Actualizar app existente
    public App updateApp(int id, App updatedApp) {
        for (int i = 0; i < app.size(); i++) {
            if (app.get(i).getId() == (id)) {
                updatedApp.setId(id);
                app.set(i, updatedApp);
                return updatedApp;
            }
        }
        return null;
    }
	
	
	
}
