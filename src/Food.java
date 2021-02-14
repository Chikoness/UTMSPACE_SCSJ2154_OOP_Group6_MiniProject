public enum Food {
    // Appetizers
    App01("Honey Garlic Mini Sausages", "Appetizers"),
    App02("Nachos Dip", "Appetizers"),

    // Main courses
    Main01("Macaroni and Cheese with Beef Bacon", "Main Course"),
    Main02("Soy Sauce Chicken Fried Rice", "Main Course"),

    // Desserts
    Des01("Caramel Pudding", "Dessert"),
    Des02("Fruit Cocktail", "Dessert"),

    // Special
    Spe01("Cake", "Special");

    String foodName;
    String foodType;

    Food(String _foodName, String _foodType) {
        foodName = _foodName;
        foodType = _foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodType() {
        return foodType;
    }
}
