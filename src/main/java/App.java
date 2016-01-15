import java.util.Map;
import java.util.HashMap;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.velocity.VelocityTemplateEngine;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    get("/",          App::index);
        get("/", App::index);
        get("/add-restaurant", App::addRestaurant);
      }



    public static String index(Request request, Response response) {
        return renderWithoutModel("velocity/index.vm");
    }

    public static String addRestaurant(Request request, Response response) {
        return renderWithoutModel("velocity/addRestaurant.vm");
    }

    public static String renderWithoutModel(String templatePath) {
        return new VelocityTemplateEngine().render(new ModelAndView(new HashMap<>(), templatePath));
    }
    //
    // /******************************************************
    //   Students: TODO: Display all restaurants on main page
    // *******************************************************/
    // get("/", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/index.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // /******************************************************
    // Students: TODO: Create page to add a new restaurant
    // *******************************************************/
    // get("/new-restaurant", (request, reponse) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/newrestaurant.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // /******************************************************
    // STUDENTS:
    // TODO: Create page to display information about the selected restaurant
    // TODO: Create page to display restaurants by cuisine type
    // *******************************************************/

}
