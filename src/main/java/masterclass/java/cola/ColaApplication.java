package masterclass.java.cola;

import masterclass.java.cola.persistence.Ingredient;
import masterclass.java.cola.persistence.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ColaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(masterclass.java.cola.ColaApplication.class, args);
	}
	@Autowired
	masterclass.java.cola.persistence.repositories.PlatRepository platRepository;
	@Autowired
	masterclass.java.cola.persistence.repositories.IngredientRepository ingredientRepository;
	@Override
	public void run(String... args) throws Exception {
		this.dataInitialisation();
	}

	private void dataInitialisation(String... args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Ingredient> ingredientsList = this.dataIngredientsInitialisation(objectMapper);

		System.out.println(ingredientsList);
		//platRepository.save(plat);
	}

	private List<Ingredient> dataIngredientsInitialisation(ObjectMapper objectMapper, String... args) {
		List<Ingredient> ingredientsList = new ArrayList<>();
		String jsonIngredients = "[" +
				"[\"Buche de chevre\", true, 0], " +
				"[\"Camembert\", true, 0], " +
				"[\"Grouillère\", true, 0], " +
				"[\"Mozzarella\", true, 0]" +
				"[\"Jambon sans sel\", false, 0]" +
				"[\"Jambon sans couenne\", true, 0]" +
				"[\"Steak de boeuf\", false, 0]" +
				"[\"Steak de cheval\", false, 0]" +
				"[\"Oignon\", false, 0]" +
				"[\"Oignon frix\", false, 0]" +
				"[\"Noix\", true, 0]" +
				"[\"Ail\", true, 0]" +
				"]";
		try {
			List<List<Object>> brutIngredients = objectMapper.readValue(jsonIngredients, List.class);
			// Create Ingredient instances
			for (List<Object> brutIngredient : brutIngredients) {
				Ingredient ingredient = new Ingredient((String) brutIngredient.get(0), (boolean) brutIngredient.get(1), (int) brutIngredient.get(2));
				ingredientRepository.save(ingredient);
				ingredientsList.add(ingredient);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ingredientsList;
	}
}