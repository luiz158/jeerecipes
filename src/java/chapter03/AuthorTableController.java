package chapter03;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author yury
 */
@Named(value = "authorTableController")
@RequestScoped
public class AuthorTableController {

    private String juneauBio = "Josh Juneau has been developing software.";
    private String deaBio = "This is Carl Dea's Bio";
    private String beatyBio = "This is Mark Beaty's Bio";
    private String oConnerBio = "This is John O'Connor's Bio";
    private String guimeBio = "This is Freddy Guime's Bio";
    private List<Author> authorList = new ArrayList<>();
    private Author current;

    public AuthorTableController() {
        authorList.add(new Author("Josh", "Juneau", juneauBio));
        authorList.add(new Author("Carl", "Dea", deaBio));
        authorList.add(new Author("Mark", "Beaty", beatyBio));
        authorList.add(new Author("John", "OConner", oConnerBio));
        authorList.add(new Author("Fredy", "Guime", guimeBio));
    }

    public String displayAuthor(String last) {
        for (Author author : authorList) {
            if (author.getLast().equals(last)) {
                current = author;
                break;
            }
        }
        return "recipe39b";
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public Author getCurrent() {
        return current;
    }

    public void setCurrent(Author current) {
        this.current = current;
    }
    
}