/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.tecnm.itoaxaca.examen.implement.service;

import ex.tecnm.itoaxaca.examen.models.ICAModel;
import ex.tecnm.itoaxaca.examen.repository.ICARepository;
import ex.tecnm.itoaxaca.examen.service.ICAService;
import ex.tecnm.itoaxaca.examen.utils.CalculoIca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author angel
 */
@Service
public class ICAServiceImplement implements ICAService{
@Autowired
private ICARepository icaRepository;

    @Override
    public void createICA(ICAModel ica) {
          //ica.setIca(calculoIca.calcularICA(ica.getMedidaCintura(), ica.getMedidaAltura()));
          //String nivel=calculoIca.ObtenerNivel(ica.getGenero(), ica.getIca());
          //ica.setIca(nivel);
          icaRepository.save(ica);
    }

    @Override
    public List getAlumno() {
         return icaRepository.findAll();
    }

    @Override
    public ICAModel getICA(String numControl) {
         return icaRepository.findBynumControl(numControl);
    }

    @Override
    public void updateIca(ICAModel icaModel, String numControl) {
        icaModel.setNumControl(numControl);
        icaRepository.save(icaModel);
    }

    @Override
    public void deleteAlumn(String numControl) {
       icaRepository.deleteById(numControl); 
    }

    
    
}
