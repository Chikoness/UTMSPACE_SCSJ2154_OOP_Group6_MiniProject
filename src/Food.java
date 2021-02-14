public enum Food {
    // Appetizers list
    App01("Honey Garlic Mini Sausages", "Appetizers"),
    App02("Nachos Dip", "Appetizers"),

    // Main courses list
    Main01("Macaroni and Cheese with Beef Bacon", "Main Course"),
    Main02("Soy Sauce Chicken Fried Rice", "Main Course"),

    // Desserts list
    Des01("Caramel Pudding", "Dessert"),
    Des02("Fruit Cocktail", "Dessert"),

    // Special, mostly cake
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
}
