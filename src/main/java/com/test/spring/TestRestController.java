package com.test.spring;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest-test")
public class TestRestController {


	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

	 @ResponseStatus(HttpStatus.OK)
     @RequestMapping(value = "/str/{str}", method = RequestMethod.GET)
	 public String getReverseString(@PathVariable String str) throws Exception {

		 StringBuilder reverse = new StringBuilder();
		 reverse.append(str);
		 reverse = reverse.reverse();

		 return reverse.toString();
     }

}