package pe.gob.osce.contratos.soap.service;

import pe.gob.osce.contratos.soap.api.gen.CustomerRequest;
import pe.gob.osce.contratos.soap.api.gen.CustomerResponse;

public interface ContratoService {
	
	CustomerResponse obtenerContrato(CustomerRequest request);

}
