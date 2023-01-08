package pl.pab.music4u.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.pab.music4u.entity.GenreEntity;
import pl.pab.music4u.model.GenreDTO;
import pl.pab.music4u.service.GenreService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private final GenreService genreService;

    @GetMapping("/home")
    public String getAdminHome(){
        return "adminHome";
    }
    @GetMapping("/genres")
    public String getCategories(Model model){
        model.addAttribute("genres", genreService.getAllGenres());
        return "genres";
    }
    @GetMapping("/genres/add")
    public String getCategoriesAdd(Model model){
        model.addAttribute("genre", new GenreEntity());
        return "genresAdd";
    }
    @PostMapping("/genres/add")
    public String postCategoriesAdd(@ModelAttribute("genre") GenreDTO genreDTO){
        genreService.addGenre(genreDTO);
        return "redirect:/admin/genres";
    }
    @GetMapping("/datatest")
    public String getDataTest(Model model){
        model.addAttribute("genres", genreService.getAllGenres());
        return "datatest";
    }
    @GetMapping("/genres/delete/{id}")
    public String getCategoriesDelete(Long id){
        genreService.deleteGenre(id);
        return "redirect:/admin/genres";
    }
}
