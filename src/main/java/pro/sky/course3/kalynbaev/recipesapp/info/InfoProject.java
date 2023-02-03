package pro.sky.course3.kalynbaev.recipesapp.info;

import java.time.LocalDate;
import java.util.*;

public class InfoProject {
    private String author;
    private String title;
    private LocalDate localDate;
    private StringBuilder description;

    public InfoProject(String author,
                       String title,
                       LocalDate localDate,
                       StringBuilder description)
    {
        setAuthor(author);
        setTitle(title);
        setLocalDate(localDate);
        setDescription(description);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }


    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoProject that = (InfoProject) o;
        return Objects.equals(author, that.author) && Objects.equals(title, that.title) && Objects.equals(localDate, that.localDate) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, localDate, description);
    }

    @Override
    public String toString() {
        return "InfoProject{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", localDate=" + localDate +
                ", description='" + description + '\'' +
                '}';
    }
}
