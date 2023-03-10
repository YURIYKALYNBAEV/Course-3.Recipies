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
        stringDescription = "- проект позволяет создавать, </br>" +
                " редактировать, получать, отправлять и удалять </br>" +
                " рецепты различных блюд. </br>" +
                " - для создания проекта были использованы следующие </br>" +
                " технологии: Spring Boot DevTools, Lombok, Spring Web. </br>" +
                " - проект написан на языке Java.";

        InfoProject infoProject = new InfoProject("Юрий",
                "Рецепты",
                LocalDate.now(),
                stringDescription);

        return infoProject.toString();
    }
}
