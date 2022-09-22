package jeep.controller;

import java.util.List;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;



import entity.Jeep;
import entity.jeepModel;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import jeep.Constants;

@Validated
@RequestMapping("/jeep")
@OpenAPIDefinition(info = @Info(title = "jeep"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server.")})
public interface JeepSalesController {
	
	

	@Operation(
			summary = "Returns a list of Jeep",
			description = "Returns a list of Jeep given an optional model or trim",
			responses = {
					@ApiResponse(responseCode = "200", description ="A list of Jeeps returned", 
							content = @Content(mediaType = "application/json")),
					@ApiResponse(responseCode = "400", description = "The request parameters are invalid",
							content = @Content(mediaType = "application/json")),
					@ApiResponse(responseCode = "404", description = "No jeeps were found with inputs",
							content = @Content(mediaType = "application/json")),
					@ApiResponse(responseCode = "500", description = "Error occured",
							content = @Content(mediaType = "application/json"))},
			parameters = {
					@Parameter(name = "model", allowEmptyValue = false, required = false,
							description = "The model name (i.e., 'WRANGLER')"),
					@Parameter(name = "trim", allowEmptyValue = false, required = false, description = "Trim level (i.e. 'Sport'")
			}
)
@GetMapping	
@ResponseStatus(code = HttpStatus.OK)
List<Jeep> fetchJeeps(
	@RequestParam(required = false) 
	jeepModel model,
	//do length first before pattern
	@Length(max = Constants.TRIM_MAX_LENGTH)
	@Pattern(regexp = "[\\w\\s]*")
	@RequestParam(required = false)
	String trim);
}
