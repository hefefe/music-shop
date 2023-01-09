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

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/home")
    public String getAdminHome(){
        return "adminHome";
    }
}

