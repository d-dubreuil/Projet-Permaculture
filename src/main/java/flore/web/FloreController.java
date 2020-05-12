package flore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FloreController {

	@GetMapping("/flore2")
	public String flore(Model model) {
		model.addAttribute("page", "flore");

		return "/flore";
	}


}
