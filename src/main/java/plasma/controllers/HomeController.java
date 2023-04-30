package plasma.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import plasma.model.Manga;
import plasma.service.MangaService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final MangaService service;

    @GetMapping("/home/menu")
    public String home(Model model) {
        List<Manga> manga = service.findAll();
        model.addAttribute("page", manga);
        return "/manga/home-page";
    }

    @GetMapping("/manga/save")
    public String save(Model model) {
        model.addAttribute("save", new Manga());
        return "/manga/create-manga";
    }

    @PostMapping("/manga/save")
    public String saveBook(Manga manga) {
        service.save(manga);
        return "redirect:/home/menu";
    }

    @PostMapping("/manga/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.deleteById(id);
        return "redirect:/home/menu";
    }
}
