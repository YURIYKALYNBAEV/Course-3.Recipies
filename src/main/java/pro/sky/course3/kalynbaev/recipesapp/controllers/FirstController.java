package pro.sky.course3.kalynbaev.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course3.kalynbaev.recipesapp.exception.IncorrectArgumentException;
import pro.sky.course3.kalynbaev.recipesapp.info.InfoProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

@RestController
public class FirstController {
    @GetMapping
    public String runningApplication() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String getInfoAboutProject() throws IncorrectArgumentException {

        final Pattern datePattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");
        final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("проект позволяет создавать, ").append("\n");
        stringBuilder.append("редактировать, получать, отправлять и удалять ").append("\n");
        stringBuilder.append("рецепты различных блюд. ").append("\n");
        stringBuilder.append("Для создания проекта были использованы следующие ").append("\n");
        stringBuilder.append("технологии: Spring Boot DevTools, Lombok, Spring Web. ").append("\n");
        stringBuilder.append("Проект написан на языке Java. ");

        InfoProject infoProject = new InfoProject("Юрий",
                "Рецепты",
                LocalDate.parse("03.02.2023", dateFormatter),
                stringBuilder);

        return infoProject.toString();
    }
}
