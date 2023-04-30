package plasma.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import plasma.model.Settings;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/home/")
    public String main(Model model){
        List<Settings> profiles = service.findAll();
        model.addAttribute("page", profiles);
        return "";
    }
}
