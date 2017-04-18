@Grab("thymeleaf-spring4")

import org.springframework.core.env.*
import com.fasterxml.jackson.databind.*

@Controller
class Application {

	@RequestMapping("/")
	public String index(Model model) {
		return "index"
	}

}
