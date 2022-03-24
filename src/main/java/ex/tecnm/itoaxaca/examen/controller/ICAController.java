package ex.tecnm.itoaxaca.examen.controller;

import ex.tecnm.itoaxaca.examen.models.ICAModel;
import ex.tecnm.itoaxaca.examen.service.ICAService;
import ex.tecnm.itoaxaca.examen.utils.CalculoIca;
import ex.tecnm.itoaxaca.examen.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author angel
 */
@RestController
@RequestMapping("/api/v1/ica")
public class ICAController {

    @Autowired
    private ICAService icaService;
    @Autowired
    private CalculoIca calculoIca;
    @PostMapping("/")
    public CustomResponse createICA(@RequestBody ICAModel icaModel) {
        calculoIca.calcularICA(icaModel.getMedidaCintura(), icaModel.getMedidaAltura(),icaModel.getGenero());
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(calculoIca);
        icaService.createICA(icaModel);
        return customResponse;
    }

    @GetMapping("/{numControl}")
    public CustomResponse getICA(@PathVariable String numControl) {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(icaService.getICA(numControl));
        return customResponse;
    }
    
    @GetMapping("/")
    public CustomResponse getAlumno() {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(icaService.getAlumno());
        return customResponse;
    }
    
    @PutMapping("/{numControl}")
    public CustomResponse updateICA(@RequestBody ICAModel ica, @PathVariable String numControl) {
        CustomResponse customResponse = new CustomResponse();
        icaService.updateIca(ica, numControl);
        return customResponse;
    }

    @DeleteMapping("/{numControl}")
    public CustomResponse deleteIca(@PathVariable String numControl) {
        CustomResponse customResponse = new CustomResponse();
        icaService.deleteAlumn(numControl);
        return customResponse;
    }

}
