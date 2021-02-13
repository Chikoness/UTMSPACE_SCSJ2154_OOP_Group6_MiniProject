public enum Food {
    // Appetizers
    App01("Honey Garlic Mini Sausages", "Appetizers", 1),
    App02("Nachos Dip", "Appetizers", 1),

    // Main courses
    Main01("Macaroni and Cheese with Beef Bacon", "Main Course", 1),
    Main02("Soy Sauce Chicken Fried Rice", "Main Course", 1),

    // Desserts
    Des01("Caramel Pudding", "Dessert", 0),
    Des02("Fruit Cocktail", "Dessert", 0);

    String foodName;
    String foodType;
    int foodCategory;

    Food(String _foodName, String _foodType, int _foodCategory) {
        foodName = _foodName;
        foodType = _foodType;
        foodCategory = _foodCategory; // 0 for Vegetarian-Friendly, 1 for Non-Vegetarian
    }
}
