package pe.gob.osce.contratos.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import pe.gob.osce.contratos.soap.api.gen.CustomerResponse;
import pe.gob.osce.contratos.soap.api.gen.CustomerRequest;
import pe.gob.osce.contratos.soap.service.ContratoService;

@Endpoint
public class ContratoEndpoint {

	private static final String NAMESPACE = "http://www.osce.gob.pe/contratos/soap/api/gen";
	
	@Autowired
	private ContratoService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public CustomerResponse getContratos(@RequestPayload CustomerRequest request) {
		return service.obtenerContrato(request);
	}

}
