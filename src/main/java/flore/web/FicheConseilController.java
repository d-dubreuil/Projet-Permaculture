package flore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FicheConseilController {

	@GetMapping("/ficheConseil")
	public String flore(Model model) {
		model.addAttribute("page", "FicheConseil");

		return "/ficheConseil";
	}
}
