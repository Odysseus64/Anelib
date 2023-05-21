package web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Profile;
import web.service.ProfileService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileService service;
    @GetMapping("/manga/profile")
    public String page(Model model){
        List<Profile> profiles = service.findAll();
        model.addAttribute("page", profiles);
        return "/manga/profile";
    }
}
