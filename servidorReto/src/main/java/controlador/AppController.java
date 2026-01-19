package controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.App;
import service.AppService;

@RestController
@RequestMapping("/api/apps")
public class AppController {
	@Autowired
    private AppService appService;
	
	// GET /api/apps/{id} - Obtener app por ID
    @GetMapping("/{id}")
    public ResponseEntity<App> getAppById(@PathVariable int id) {
        App app = appService.getAppById(id);
        if (app != null) {
            return ResponseEntity.ok(app);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    // PUT /api/apps/{id} - Actualizar app
    @PutMapping("/{id}")
    public ResponseEntity<App> updateApp(@PathVariable int id, @RequestBody App app) {
        App updatedApp = appService.updateApp(id, app);
        if (updatedApp != null) {
            return ResponseEntity.ok(updatedApp);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
