package br.com.sondait.timesheet;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import br.com.sondait.timesheet.config.SeleniumHelper;

@SpringBootApplication
@Controller
public class TimeSheetApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(TimeSheetApplication.class, args);
	}

	@GetMapping(value = "/")
	public RedirectView swaggerJson(HttpServletRequest request){
		return new RedirectView("http://petstore.swagger.io/?url="+request.getRequestURL()+"swagger.yaml");
	}

	// @GetMapping(value = "/swagger.yaml")
	// public String swaggerYaml() {
	// 	return "swagger.yaml";
	// }

}
