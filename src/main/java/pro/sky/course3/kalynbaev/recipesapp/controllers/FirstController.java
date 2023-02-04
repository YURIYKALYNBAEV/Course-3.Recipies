package pro.sky.course3.kalynbaev.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course3.kalynbaev.recipesapp.exception.IncorrectArgumentException;
import pro.sky.course3.kalynbaev.recipesapp.info.InfoProject;

import java.time.LocalDate;

@RestController
public class FirstController {
    @GetMapping("/")
    public String runningApplication() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String getInfoAboutProject() throws IncorrectArgumentException {

        String stringDescription = null;
        stringDescription = "проект позволяет создавать,\n" +
                " редактировать, получать, отправлять и удалять\n" +
                " рецепты различных блюд.\n" +
                " Для создания проекта были использованы следующие\n" +
                " технологии: Spring Boot DevTools, Lombok, Spring Web.\n" +
                " Проект написан на языке Java.\n";

        InfoProject infoProject = new InfoProject("Юрий",
                "Рецепты",
                LocalDate.now(),
                stringDescription);

        return infoProject.toString();
    }
}
