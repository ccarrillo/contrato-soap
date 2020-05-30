package pe.gob.osce.contratos.soap.dao;

import java.util.List;

import pe.gob.osce.contratos.soap.api.gen.CustomerRequest;
import pe.gob.osce.contratos.soap.dto.ContratoDto;

public interface ContratoRepository {

	List<ContratoDto> cargarContratos(CustomerRequest customerRequest);

}
