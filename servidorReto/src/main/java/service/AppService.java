package service;

import java.util.ArrayList;

import model.App;

public class AppService {
	private final ArrayList<App> apps = new ArrayList<>();
	
	// Obtener app por ID
    public App getAppById(int id) {
        return apps.stream()
                .filter(app -> app.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
 // Actualizar app existente
    public App updateApp(int id, App updatedApp) {
        for (int i = 0; i < apps.size(); i++) {
            if (apps.get(i).getId() == (id)) {
                updatedApp.setId(id);
                apps.set(i, updatedApp);
                return updatedApp;
            }
        }
        return null;
    }
	
	
	
}
