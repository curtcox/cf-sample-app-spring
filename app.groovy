@Grab("thymeleaf-spring4")

import org.springframework.core.env.*
import com.fasterxml.jackson.databind.*

@Controller
class Application {


	@Autowired
	private ObjectMapper json;

	@Value('${VCAP_APPLICATION:{}}')
	private String application;

	@Value('${VCAP_SERVICES:{}}')
	private String services;


	@RequestMapping("/")
	public String index(Model model) {
		return "index"
	}

}
